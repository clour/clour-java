package org.clour.inter.data.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONObject;

public class SqlUtil {

	@SuppressWarnings("unchecked")
	public static String buildCondition(Map<String, Object> params, String condition) {
		String result = "";
		if (params != null && params.size() > 0 && StringUtils.isNotBlank(condition)) {
			Map<String, String> conditions = (Map<String, String>) JSONObject.parse(condition);
			if (conditions != null && condition.length() > 0) {
				StringBuilder builder = new StringBuilder("");
				for (String conditionItem : conditions.keySet()) {
					Object paramObject = params.get(conditionItem);
					String param = (paramObject == null) ? null : paramObject.toString();
					String conditionValue = conditions.get(conditionItem);
					if (StringUtils.isNotBlank(param) && StringUtils.isNotBlank(conditionValue)) {
						String[] paramParts = param.split(",");
						String[] conditionParts = conditionValue.split("#");
						builder.append(" ");
						switch (conditionParts.length - paramParts.length) {
						case 1:
							for (int i = 0; i < paramParts.length; i++) {
								builder.append(conditionParts[i]);
								builder.append(paramParts[i]);
							}
							builder.append(conditionParts[paramParts.length]);
							break;
						case 0:
							for (int i = 0; i < conditionParts.length; i++) {
								builder.append(conditionParts[i]);
								builder.append(paramParts[i]);
							}
							break;
						default:
							continue;
						}
					}
				}
				result = builder.toString();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", "sss123");
		params.put("name", "jean,devil");
		System.out.println(JSONObject.toJSON(params));
		System.out.println(JSONObject.toJSON(params));
		String condition = "{\"id\":\"and id='#'\",\"name\":\"and (name>'#' or name <'#')\"}";
		String conditions = "{\"name\":\"jean,devil\",\"id\":\"sss123\"}";
		System.out.println(conditions);
		System.out.println((JSONObject.parseObject(conditions)));
		String result = "";
		result = buildCondition(params, condition);
		System.out.println(result);
		
	}
}

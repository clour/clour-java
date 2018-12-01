package org.clour.inter.model.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.activerecord.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class InterDort extends Model<InterDort> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2976427330077140185L;

	private String id;
	private String interid;
	private String interComent;
	private String interModifyuser;
	private String interModifytime;
	private String interInsertuser;
	private String interInserttime;
	private String interDelmark;
	private Integer interOrder;
	private String interCate;
	private String interIndex;
	private String interCata;
	private String interCode;
	private String interName;
	private String interContent;
	private String interSoure;
	private String interCondition;
	private String interUrl;
	private String interDescript;

	@Override
	protected Serializable pkVal() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public String toString() {
		return "InterDort:{id:" + id + ",interid:" + interid + ",interComent:" + interComent + ",interModifyuser:"
				+ interModifyuser + ",interModifytime:" + interModifytime + ",interInsertuser:" + interInsertuser
				+ ",interInserttime:" + interInserttime + ",interDelmark:" + interDelmark + ",interOrder:" + interOrder
				+ ",interCate:" + interCate + ",interIndex:" + interIndex + ",interCata:" + interCata + ",interCode:"
				+ interCode + ",interName:" + interName + ",interContent:" + interContent + ",interSoure:" + interSoure
				+ ",interCondition:" + interCondition + ",interUrl:" + interUrl + ",interDescript:" + interDescript
				+ "}";
	}

}

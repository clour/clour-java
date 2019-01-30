package org.clour.mode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Staw {
	public static void findSingleWord() throws IOException {
		File file = new File("D:\\\\Share\\\\Code\\\\了不起的盖茨比(英文版).txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		Map<String, Integer> map = new HashMap<>();
		String line = br.readLine();
		while (line != null) {
			String[] arr = line.split(" ");
			for (int i = 0; i < arr.length; i++) {
				if (map.get(arr[i]) == null) {
					map.put(arr[i], 1);
				} else {
					map.put(arr[i], map.get(arr[i]) + 1);
				}
			}
			line = br.readLine();
		}

		int count = 0;
		for (Map.Entry<String, Integer> item : map.entrySet()) {
			if (item.getValue() == 1) {
				System.out.println(item.getKey());
				count++;
			}
		}
		System.out.println(count);
		br.close();

		//排序，输出出现次数最多的单词和次数
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}

		});

		int i = 0;
		while (i < 3) {
			Map.Entry<String, Integer> item = list.get(i);
			System.out.println(item.getKey() + "---" + item.getValue());
			i++;
		}
	}
	
	public static void main(String[] args) throws IOException {
		findSingleWord();
	}
}

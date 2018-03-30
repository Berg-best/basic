package com.tencent.j2ee;

import java.util.HashMap;

public class TestCarModel {

	private static String[][] arrays = new String[][] {
		{"4s", "成都", "tom", "9", "12345.6", "0.88", "12345.6"},
		{"4s", "北京", "tom", "9", "12345.6", "0.88", "12345.6"},
		{"4s", "上海", "tom", "9", "12345.6", "0.88", "12345.6"},
		{"4s", "成都", "jack", "9", "12345.6", "0.88", "12345.6"},
		{"4s", "成都", "tom", "9", "12345.6", "0.88", "12345.6"},
		{"4s", "成都", "tom", "9", "12345.6", "0.88", "12345.6"},
		{"4s", "成都", "tom", "9", "12345.6", "0.88", "12345.6"}
	};
	
	private static HashMap<String, CarModel> map = new HashMap<String, CarModel>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < arrays.length; i++) {
			CarModel carModel = new CarModel(arrays[i][0], arrays[i][1], arrays[i][2], Integer.parseInt(arrays[i][3]), Double.parseDouble(arrays[i][4]), Double.parseDouble(arrays[i][5]), Double.parseDouble(arrays[i][6]));
			String key = arrays[i][0] + arrays[i][1] + arrays[i][2];
			if (!map.containsKey(key)) {
				map.put(key, carModel);
			}
		}
		
		System.out.println(map.size());//这是map的容量
	}

}

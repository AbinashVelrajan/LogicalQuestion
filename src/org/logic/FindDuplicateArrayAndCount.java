package org.logic;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateArrayAndCount {
//	public static void main(String[] args) {
//		int arr[] = { 10, 20, 30, 20, 50, 30, 30, 10, 60 };
//		LinkedHashMap<Integer, Integer> countsMap = new LinkedHashMap<Integer, Integer>();
//
//		for (int i = 0; i < arr.length; i++) {
//			int keyNum = arr[i];
//			int count = 0;
//			if (countsMap.get(keyNum) != null) {
//				count = countsMap.get(keyNum);
//			}
//			int new_count = count + 1;
//			countsMap.put(keyNum, new_count);
//		}
//
//		for (Map.Entry<Integer, Integer> entry : countsMap.entrySet()) {
//			Integer key = entry.getKey();
//			Integer val = entry.getValue();
//			System.out.println(key + " " + val);
//		}
//	}

//	public static void main(String[] args) {
//		int arr[]= {10,20,30,20,50,30,30,10,60};
//		LinkedHashMap<Integer, Integer> countsMap = new LinkedHashMap<Integer, Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			int num = arr[i];
//			int new_count = countsMap.getOrDefault(num, 0) + 1;
//			countsMap.put(num, new_count);
//		}
//		
//		for (Map.Entry<Integer, Integer> entry : countsMap.entrySet()) {
//			Integer key = entry.getKey();
//			Integer val = entry.getValue();
//			System.out.println(key + " " + val);
//		}
//	}

//	public static Object getOrDefault(int key, Object defaultVal) {
//		Object val = countsHashMap.get(key);
//		if (val == null) {
//			val = defaultVal;
//		}
//		return val;
//	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 20, 50, 30, 30, 10, 60 };
		LinkedHashMap<Integer, Integer> countsHashMap = new LinkedHashMap<Integer, Integer>();

		for (int num : arr) {

			int new_count = countsHashMap.getOrDefault(num, 0) + 1;
			countsHashMap.put(num, new_count);

		}
		for (Map.Entry<Integer, Integer> entry : countsHashMap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			// to print only duplicate 
//			if (val > 1) {
//
//				System.out.println(key + " " + val);
//			}
			System.out.println(key + " " + val);

		}

	}

}

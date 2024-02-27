package org.logic;

import java.util.HashMap;
import java.util.Map;

public class FindTheLongestSubString {

	public static void main(String[] args) {
		String str = "abcbcbb";
		int longsubString = 0;
		int startIdx = 0, endIdx = 0;

		for (int i = 0; i < str.length(); i++) {
			Map<Character, Integer> occurenceMap = new HashMap<Character, Integer>();

			for (int j = i; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (occurenceMap.containsKey(ch)) {
					i = occurenceMap.get(ch);
					break;
				}
				occurenceMap.put(ch, j);
				int subStringLength = j - i + 1;
				if (longsubString < subStringLength) {
					longsubString = subStringLength;
					startIdx = i;
					endIdx = j;
				}

			}

		}

		System.out.println(longsubString);
		System.out.println(str.substring(startIdx, endIdx + 1));
	}

}

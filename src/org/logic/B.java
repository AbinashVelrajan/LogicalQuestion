package org.logic;

import java.util.HashMap;
import java.util.Map;

public class B {

	public static void main(String[] args) {
		String str = "abcabcbb";
		int longestSubString = 0;
		int subStringLength = 0;


		for (int i = 0; i < str.length(); i++) {

			Map<Character, Integer> occurence = new HashMap<Character, Integer>();

			for (int j = i; j < str.length(); j++) {
				char ch = str.charAt(j);
				int count = occurence.getOrDefault(ch, 0);
				int newcount = count + 1;

				if (newcount > 1) {
					break;
				}

				occurence.put(ch, newcount);
				subStringLength= j-i+1;
				if (longestSubString<subStringLength) {
					longestSubString=subStringLength;
					
				}
			}
			
		}
		System.out.println(longestSubString);

	}

//	public static void main(String[]args) {
//	String s = "ggxxggxg";
//	boolean happy = true;
//	
//	
//	for (int i = 0; i < s.length(); i++) {
//		if (s.charAt(i)== 'g') {
//			
//			if (i>0 && s.charAt(i-1)=='g') {
//				happy = true;		
//			}else if(i<s.length()-1 && s.charAt(i+1)=='g') {
//				happy = true;
//				
//			}else {
//				happy = false;
//			}	
//		}	
//	}
//	System.out.println(happy);
//	}

}

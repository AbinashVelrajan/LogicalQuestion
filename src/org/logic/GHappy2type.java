package org.logic;

public class GHappy2type {
	public static boolean gHappy(String s) {
		boolean isHappy = true;
		
		int lastIndex = s.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'g') {
				
				boolean leftNoG = i > 0 && s.charAt(i - 1) != 'g';
				boolean rightNoG = i < lastIndex && s.charAt(i + 1) != 'g';
				//unhappy condition
				if(leftNoG && rightNoG) {
					isHappy = false;
//					break;
				}
			}
		}
		return isHappy;
	}

	public static void main(String[] args) {
		String[] gStrings = {"xxggxx", "xxgxggx", "xxggyygxx", "egg"};

		for (String s : gStrings) {			
			System.out.println(s + " : " + gHappy(s));
		}
	}

}

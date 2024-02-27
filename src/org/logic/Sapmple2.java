package org.logic;

public class Sapmple2 {
	public static void main(String[] args) {
		String s = "ggxxgxgg";
		boolean happy = true;
//		boolean unhappy = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'g') {
				if (i > 0 && s.charAt(i - 1) == 'g') {
					happy = true;
				} else if (i < s.length() - 1 && s.charAt(i + 1) == 'g') {
					happy = true;
				} else {
					happy = false;
					break;
				}
			}
		}
		System.out.println(happy);
	}

}

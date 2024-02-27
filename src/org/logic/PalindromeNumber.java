package org.logic;

public class PalindromeNumber {
	public static void main(String[] args) {
//		int num = 4224, rem = 0, rev = 0;
//		while (num > 0) {
//			rem = num % 10;
//			rev = rev * 10 + rem;
//			num = num / 10;
//		}
//		System.out.println(rev);
		String s = "Abinash", res = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			res = res + c;

		}
		System.out.println(res);
	}

}

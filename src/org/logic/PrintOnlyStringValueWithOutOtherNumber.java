package org.logic;

public class PrintOnlyStringValueWithOutOtherNumber {
	public static void main(String[] args) {
		String s = "Abi989na9&87sh";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

//			char chLower = Character.toLowerCase(ch);
//			if (chLower >= 'a' && chLower <= 'z') {
			if (ch < '0' || ch > '9') {
				
				s1 = s1 + ch;
			}

		}
		System.out.println(s1);

	}
}

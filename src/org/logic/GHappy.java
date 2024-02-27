package org.logic;

public class GHappy {
	

	public static boolean gHappy() {
		String str = "xxggyygxx";
		int len = str.length();
		boolean happy = true;

		for (int i = 0; i < len; i++) {
			
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i - 1) == 'g') {
					happy = true;
				} else if (i < len - 1 && str.charAt(i + 1) == 'g') {
					happy = true;
				} else {
					happy = false;
					break;
				}
			}
		}
		return happy;
	}

	public static void main(String[] args) {
		String[] gStrings = { "xxggxx",
				"xxgxggx", "", "egg" 
		};
		

//		for (String s : gStrings) {
//			System.out.println(s + " : " + gHappy(s));
//		}
//		String s = "";
//		System.out.println(gHappy(s));
	}

}

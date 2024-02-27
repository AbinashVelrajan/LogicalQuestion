package org.logic;

public class Sample {

	public static void main(String[] args) {
		String str = "gxggx";

		boolean happy = true;
		boolean unhappy = false;

		boolean result = happy;

		int startIndex = 0;
		int lastIndex = str.length() - 1;

		for (int currentIndex = 0; currentIndex < str.length(); currentIndex++) {
			if (str.charAt(currentIndex) == 'g') {
				int prevIndex = currentIndex - 1;
				int nextIndex = currentIndex + 1;

				if (currentIndex > startIndex && str.charAt(prevIndex) == 'g') {
					result = happy;
				} else if (currentIndex < lastIndex && str.charAt(nextIndex) == 'g') {
					result = happy;
				} else {
					result = unhappy;
					break;
				}
			}
		}

		System.out.println(result);

	}
}

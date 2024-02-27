package org.logic;



public class ReverseStringWithSpace {
	public static void main(String[]args) {
		String s = "I am not String ", res="";
		int j = s.length()-1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
		
			if (s.charAt(i)==' ') {
				res = res+s.charAt(i);
			} else {
              while(s.charAt(j)==' ') {
            	  j--;
              }
              res = res+s.charAt(j);
              j--;
			}
		}
		System.out.println(res);
	}
	
}

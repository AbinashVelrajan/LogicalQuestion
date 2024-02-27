package org.logic;

public class PrintStringValueReverse {

	public static void main(String[] args) {
		String s = "Abinash Abi", res = " ";

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			res = res + c;

		}
		System.out.println(res);

//		String name="I Am Not String",res=" ";
//		
//		for (int i = name.length()-1; i>=0; i--) {
//			char c = name.charAt(i);  
//			res=res+c;
//			
//		}
//		System.out.println(res);
	}

}

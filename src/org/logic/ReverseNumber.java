package org.logic;

public class ReverseNumber {
	public static void main(String[]args) {
		
	int num =510,rev=0,rem=0;
	
	int count = 0;
	
	
//	while(num>0) {
//		rem=num%10;
//		rev=rev*10+rem;
//		num=num/10;
//	}
	String str_num = Integer.toString(num);
	String res = "";
	for (int i = str_num.length() - 1; i >= 0; i--) {
		res += str_num.charAt(i);
	}
	System.out.println(res);
	
	
	}
	
	
	
}


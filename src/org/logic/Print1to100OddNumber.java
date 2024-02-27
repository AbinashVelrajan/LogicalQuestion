package org.logic;

public class Print1to100OddNumber {
	public static void main(String[] args) {
		//Print 1 to 100 odd number 
//		for (int i = 1; i < 100; i++) {
//			if (i%2==1) {
//				System.out.println(i);
//			}
//			
//		}
//---------------------------------------------------------
		int count =0,sum=0;
		for (int i = 0; i < 100; i++) {
			if (i%2==0) {
				count++;
				sum=sum+i;
//				System.out.println("Count of even number:"+count);
//				System.out.println("Sum of Even number:"+sum);
			}
			
		}
		System.out.println("Count of even number:"+count);
		System.out.println("Sum of Even number:"+sum);
		
		
	}
	
	

}

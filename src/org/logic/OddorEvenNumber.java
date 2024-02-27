package org.logic;

public class OddorEvenNumber {
	

	public static void main(String[] args) {
		int count =0,sum=0;
		for (int i = 0; i < 100; i++) {
			
			if (i%2==0) {
				count++;
				sum=sum+i;
				System.out.println(count);
				System.out.println(sum);
				
			
			}
			
		}
		
		
		
		
	}
	
	
	
}

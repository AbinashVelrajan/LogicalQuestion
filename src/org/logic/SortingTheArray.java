package org.logic;

public class SortingTheArray { 
	
	public static void main(String[] args) {
		int a[]= {100,500,400,300,200};
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = i+1; j < 5; j++) {
				if (a[i]>a[j]) {
					int c = a[i];
					a[i]= a[j];
					a[j]=c;
					
				}
			}
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}

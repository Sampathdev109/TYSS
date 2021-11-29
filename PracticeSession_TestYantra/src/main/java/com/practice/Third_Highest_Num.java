package com.practice;

public class Third_Highest_Num {
	
	public static void main(String[] args) {
		
		int a[] = {12,56,77,85,33,215,999,76865,45};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if( a[i] > a[j]) {
					int temp = a[i] ;
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		} 
		

		System.out.println(a[a.length-3]);
		
	}

}

package com.practiceARRAY;

public class ArrayIndices {

	public static void main(String[] args) {
		
		int a[] = {2,7,11,15};
		int target = 9;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j =0; j<a.length;j++) {
				
				if(a[i]+a[j]== target) {
					System.out.print(" " +i);
				}
				
		
			}
		}
	}
}

package com.practice;

public class Fibanocci_New {
	public static void main(String[] args) {
		int num = 10;
		int n1 = 0;
		int n2 = 1;
		int n3 ;
		for(int i =0; i<=num; i++) {
			System.out.print(n1+ " ");
			n3= n1+n2;
			n1=n2;
			n2=n3;
			
		}
	}

}

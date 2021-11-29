package com.practice;

public class Fibanocci {
	
	public static void main(String[] args) {
		
		int number =10;
		int count = 0;
		int num1 = 0;
		int num2 = 1;
		while(count<=number)
		{
			System.out.print(num1+" ");
			int num3 = num1+num2;
			num1=num2;
			num2= num3;
			count = count+1;
			
		}
		 
	}

}

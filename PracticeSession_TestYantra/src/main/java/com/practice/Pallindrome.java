package com.practice;

public class Pallindrome {
	public static void main(String[] args) {
		
		int num = 121;
		int temp = num;
		int rem = 0;
		int rev = 0;
		
		
		while(temp!=0) {
			
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = temp /10;
		}
		if(num == rev) {
			System.out.println("correct");
		}
		else {
			System.out.println("incorrect");
		}
		
	}

}
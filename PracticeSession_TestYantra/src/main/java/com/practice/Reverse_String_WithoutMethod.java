package com.practice;

public class Reverse_String_WithoutMethod {

	public static void main(String[] args) {
		
		String s = "sampdthdev";
		String rev = " ";
		
		char c[] = s.toCharArray();
		
		for( int i=c.length-1; i>0; i--) {
			
			rev = rev+c[i];
		}
		
		System.out.println(rev);
	}}

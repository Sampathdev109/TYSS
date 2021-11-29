package com.practice;

public class Reverse_String_word {

	public static void main(String[] args) {
		
		String s = "Hi we belong from kerala";
		String s1 []= s.split(" ");
		//String rev =  " ";
		
		for (int i = s1.length-1; i>=0; i--) {
			//rev = rev + s1[i];
			System.out.print(s1[i] + " ");
		}
		
	}
}
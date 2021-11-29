package com.practice;

import java.util.LinkedHashSet;

public class Practice1 {

	public static void main(String[] args) {
	String s = "Sampathdev is from is Kerala from Kerala";
	
	String s1 [] = s.split(" ");
	char c[] = s.toCharArray();

		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for(int i = 0; i<c.length; i++) {
			
			ls.add(c[i]);
		}
		for(char ch : ls) {
			
			 int count = 0;
			 
			 for(int j=0; j<c.length; j++) {
				 
				 if(ch == c[j]) {
					 
					 count++;
				 }
			 }
		
		System.out.println("occurance of " + ch + " is " + count);
		}
		
	}}

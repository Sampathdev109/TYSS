package com.practice;

import java.util.LinkedHashSet;

public class Occurance_String_Characters {
	
	public static void main(String[] args) {
		
		String s = "sampathdev from kannur";
		String s1 = s.trim();
		char c [] = s.toCharArray();
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		
		for(int i = 0; i<c.length; i++)
		{
			lhs.add(c[i]); }
		
		for (char c1: lhs) {
			
			 int count =0; 
			 
			 for(int j=0; j<c.length; j++) {
				 
			 if(c1==c[j]) {
				 count++;
				 
			 }
			 }
			
		System.out.println("Occurance of all the " + c1 + " from the given string is " + count) ;
			}
		}}

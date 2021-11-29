package com.practice;

import java.util.LinkedHashSet;

public class Occurance_Word {

	public static void main(String[] args) {
		
		String s = "Sampathdev from Kannur";
		String s1 [] = s.split(" ");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		for(int i=0; i<s1.length;i++) {
			
			lhs.add(s1[i]); }
			
			for(String a : lhs) {
				
				int count = 0;
				
				for(int j=0; j<s1.length; j++) {
					
					if(a.equals(s1[j])) {
						
						count++;
				}

			}
			System.out.println("count of " + a + " is " + count);
			}}}
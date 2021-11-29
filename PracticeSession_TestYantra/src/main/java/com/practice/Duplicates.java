package com.practice;

import java.util.LinkedHashSet;

public class Duplicates {
	public static void main(String[] args) {
		
		String s = "joheno Rome";
		char c[] = s.toCharArray();
		s=s.toLowerCase();
		
		LinkedHashSet<Character> ls = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length(); i++) {
			
			ls.add(s.charAt(i)); 
		}
				for(char ch :ls) {
					
					int count =0;
					
					for( int j=0; j<s.length(); j++) {
						if(ch == s.charAt(j)) {
							
							count++;
						}}
				
			
			if(count >1) 
				System.out.println(ch + " " + count);
			}
				
				
			}
		}
		
		
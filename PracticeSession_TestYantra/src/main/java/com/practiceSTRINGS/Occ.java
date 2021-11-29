package com.practiceSTRINGS;

import java.util.ArrayList;
import java.util.List;

public class Occ {
	
	public static void main(String[] args) {
		int count =1;
		
		String s = "AAABBCCCAABBCCDD";
		char [] c = s.toCharArray();
		
		for(int i=0; i<s.length()-1; i++) {
			
			if(s.charAt(i)!= s.charAt(i+1)) {
				
				System.out.println(count + " " + s.charAt(i));
				count =1;
			}
			else 
				count++;
		}
				System.out.println(count + " " + s.charAt(s.length()-1));
			
		
		}
		
		
	}

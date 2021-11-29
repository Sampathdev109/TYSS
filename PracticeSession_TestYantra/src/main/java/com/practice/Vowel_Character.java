package com.practice;

import java.util.LinkedHashSet;

public class Vowel_Character {
	public static void main(String[] args) {
		String s = "sampathdev";
		char c [] = s.toCharArray();
		String temp = "";
		int count =0;
		
		for(int i=0; i<c.length; i++) {
 			
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'u') {
				
			//if(c[i] == 'a' ||c[i] == 'e' || c[i] == 'i' || c[i] == 'u') {
				temp = temp + c[i];
				count++;
			
			}
		
				
			}
		System.out.println("Occurance of the vowels from " + temp + " is " + count);
		}}
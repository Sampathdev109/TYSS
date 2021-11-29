package com.practice;

public class Compare_Length_Word {
	public static void main(String[] args) {
		
		String s = "Sampathdev Shubham Ravikumar Athul Deepak";
		
		String s1[] = s.split(" ");
		String temp = " ";
		
		for(int i=0; i<s1.length; i++) {
			
		for(int j =i+1; j<s1.length; j++) {
			
			if(s1[i].length() > s1[j].length()) {
				
				temp = s1[i];
				s1[i] = s1[j];
				s1[j] = temp;
				
			}
		}}
		for(String names : s1)
			System.out.println(names);
		}
	}

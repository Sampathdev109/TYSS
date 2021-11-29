package com.practiceSTRINGS;

public class Swap_FirsyWord {
	public static void main(String[] args) {
		
	String name = "Welcome King Sampathdev Welcome Sampathdev to his own King dom";
	// convert string to string array.
	String str [] = name.split(" ");
	//int x = str.length;
	
	String temp = str[0];
	str[0] = str[str.length-1];
	str[str.length-1] = temp;
	
	for(String i : str) {
		
		System.out.print(i + " ");
	}
	
	}
}
package com.practice;

public class Char_Replace {
	
	
//	String b = "eegf";
	
	
public static void main(String[] args) {
	String a = "zzba";
	for(int i = 0; i <a.length(); i++) {
		int ascii = (int)a.charAt(i);
		if(ascii >= 118) {
			ascii -= 21;
			System.out.print((char)ascii);
		} else {
			ascii += 5;
			System.out.print((char)ascii);
		}
		
	}
}
}
/*
 * String s = "zzba";
 *main()
 *for(int i=0; i<s.length();i++)
 *int ascii = (ascii)s.charAt(i);
 *if(ascii>=118) {
 *ascii=ascii-21;
 *sysout()
 *else
 *ascii = ascii +5;
 *
 * 
 * 
 * 
*/

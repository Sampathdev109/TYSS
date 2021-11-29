package com.practice;

public class TreeSet {

	public static void main(String[] args) {
		
		int a[] = {99,999,6,556,4,33,2,667,8,9,556,33,4,33};
		
		java.util.TreeSet<Integer> ts = new java.util.TreeSet<Integer>();
		
		for(int i =0; i<a.length; i++) {
			
			ts.add(a[i]);
		}
		
		for(int i :ts)
		{		System.out.println(i);
		
	}}
}

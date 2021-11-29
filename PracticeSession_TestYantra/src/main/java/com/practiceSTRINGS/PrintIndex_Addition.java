package com.practiceSTRINGS;

public class PrintIndex_Addition {
	public static void main(String[] args) {
	
	int a [] = {2,9,7,11,15};
	int target =26;
	
	for (int i =0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(i+j == target) {
				System.out.println(i);
			}
			
		}
	
}}}
// o/p = {3,4}
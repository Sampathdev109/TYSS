package com.practiceSTRINGS;

public class Segg {

	public static void main(String[] args) {
		
		String s = "ab12cd345";
		String Alpha = " ";
		String Num1 = " ";
		String Num2 = " ";
		String Num3 = " ";
		int N1 = 0;
		int N2 = 0;
		int N3 = 0;
		StringBuffer num1 = new StringBuffer(Num1);
		StringBuffer num2 = new StringBuffer(Num2);
		StringBuffer num3 = new StringBuffer(Num3);
		String Special = " ";
		
		for (int i =0; i<s.length(); i++) {
			
			if((s.charAt(i)>='a') && (s.charAt(i)<='z') || (s.charAt(i)>='A') && (s.charAt(i)<='Z'))
{
	 Alpha = Alpha + s.charAt(i);
}
			else if ((s.charAt(i)>='0') && (s.charAt(i)<='2')) {
				Num1 = Num1 + s.charAt(i);
				
			}
			else if ((s.charAt(i)>='3') && (s.charAt(i)<='9')) {
				Num2 = Num2 + s.charAt(i);
				
			}
			
			
			else {
				
				Special = Special + s.charAt(i);
			
			}
		N1 = Integer.parseInt(Num1);
		N2 = Integer.parseInt(Num2);
		N3 = Integer.parseInt(Num3);
			N3 = N1 + N2;
		}
	
		System.out.println(Alpha);
		System.out.println(N1);
		System.out.println(N2);
		
		System.out.println(Special);
		System.out.println(N3);
		
		
	}
}

package com.practiceSTRINGS;

public class compare_Length_Strinfs {
	
	public static void main(String[] args)
    {
		String s1 = "Hello Mister Perera";
		
		String names [] = s1.split(" ");
        String temp = " ";
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                
                // to compare one string with other strings
                if (names[i].length()  > names[j].length())
                    // swapping
                	temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        for (String k : names) {
            System.out.println(" " + k);
        }
     
    }
    }



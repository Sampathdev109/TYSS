
public class Replace_Fir_Sec {
	
	public static void main(String[] args) {
		
	
	String s = "sampathdev sreekumar";
	String str[] = s.split(" ");
	int count = str[0].length();
		
		if(count>str[1].length()) {
			
			count = str[1].length();
		}
		for(int i=0; i<count; i++) {
		System.out.print(str[0].charAt(i)  + "" + str[1].charAt(i));
	}
		
		
	}

}

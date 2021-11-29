
public class Ascii {
	public static void main(String[] args) {
	String s = "zzba";
	
	for(int i=0; i<s.length(); i++) {
		
		int ascii =  (int)s.charAt(i);
		
		if(ascii>=118) {
			ascii = ascii -21;
			System.out.print((char)ascii);
		}
		else {
			ascii = ascii + 5;
			System.out.print((char)ascii);
		}
	}
}
}

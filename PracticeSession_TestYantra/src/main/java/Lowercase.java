
public class Lowercase {

	public static void main(String[] args) {
		String s = "SAMPATHDEV";
		
		String s1 = s.toLowerCase();
		String str =  " ";
		
		char c[] = s.toCharArray();
		
		for(int i = 0; i<c.length; i++) {
			
	str = s.valueOf(c[0]).toUpperCase();
		}
		for(int j=0; j<s.length(); j++) {
			str = str + c[j];
			
		}
		System.out.println(str);
		System.out.println(s1);
	}}
		
		

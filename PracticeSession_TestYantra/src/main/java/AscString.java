import java.util.TreeSet;

public class AscString {
	public static void main(String[] args) {
		String [] s = {"sampathdev", "radha", "amith", "chethan", "amith", "xenon", "c"};
		
		TreeSet <String> ts = new TreeSet <String>();
		
		for(int i=0; i<s.length; i++) {
			
			for(int j=1+i; j<s.length; j++) {
				
				if(s[i].equals(s[j])) {
					
					
				}
			}
			
		}
		System.out.println(ts);
	}
	

}

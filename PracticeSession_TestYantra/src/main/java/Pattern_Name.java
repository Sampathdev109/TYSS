
public class Pattern_Name {
	public static void main(String[] args) {
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				
				if((i==1 || j==5) && (i==5 || j==1))
				
				System.out.print("*");
				
			}
			System.out.println(" ");
				
			
			
			
		}
		
	}}



/* *1,1
 * 1,2 1,2 1,3 
 * 2,1 2,2 2,3
 * 3,1 3,2 3,3
 * 4,1 4,2 4,3
 * 5,1 5,2 5,3 
 * 
 * **
 * ***
 * ****
 * *****
*/

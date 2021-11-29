
public class Pattern1 {

	public static void main(String[] args) {
		int row =4;
		int count =0;
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=i; j++) {
				
				count = count+1;
				System.out.print(count);
			}
			
			System.out.println();
		}
		
	}
}

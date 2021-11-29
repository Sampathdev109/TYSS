import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Occ {
	public static void main(String[] args) {
		int a[] = {1,2,3,1,11,4323,521,1,3,53,22,1};
		
		HashSet <Integer> l = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			l.add(a[i]);
		}
			for(int a1: l) {
				int count = 0;
				for(int j=0; j<a.length; j++) {
					
					if(a1==a[j]) 
						count++;
						
					
				}
				
				System.out.println(" OCcurance of " + a1 + " is " + count);
				}
				
			}}
		
		

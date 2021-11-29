import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_ArrayList {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		
		List ls =Arrays.stream(a).boxed().toList();
		System.out.println(ls);

}
}
package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> se1=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			se1.add(arr[i]);
			
					
		}
		

	}

}

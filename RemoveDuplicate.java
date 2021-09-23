package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text="PayPal India";
		
		char[] str1=text.toCharArray();
		
		Set <Character> ch1=new LinkedHashSet<Character>();		
	
		
		for (int i = 0; i < str1.length; i++) {
			
			ch1.add(str1[i]);
			
		}
		
		for (Character character : ch1) {
			
			System.out.println(character);
			
		}
		
 
	}

}

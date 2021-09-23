package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		
		String text1="We learn java basics as part of java sessions in java week1";
		
		String[] str1=text1.split(" ");
		
		Set<String> se1=new LinkedHashSet<String>();
		
		for (int i = 0; i < str1.length; i++) {
			
			se1.add(str1[i]);
			
		}
		
		for (String string : se1) {
			
			System.out.print(string +" ");
			
		}
		

	}

}

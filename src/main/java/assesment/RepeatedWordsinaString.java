package assesment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedWordsinaString {

	public static void main(String[] args) {
		String str = ("programing language is java  python is language in java hence java");
		str = str.toLowerCase();
		String[]Array = str.split("");
		
		List<String> Repeated = new  ArrayList<>();
		 HashSet<String> hashSet = new HashSet<>();
		 for(  String str1 :Array) {
			  if(!hashSet.add(str1))
				  Repeated.add(str1);
		 }
		System.out.println(Repeated);

	}

}

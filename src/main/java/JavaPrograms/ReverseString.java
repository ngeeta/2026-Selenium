package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void revSingle() {
		String name = "Geeta";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println(name + " -> " + rev);
	}

	@Test
	public void revAllFromList() {
		List<String> actual = new ArrayList<String>(Arrays.asList("Geeta", "Pihu", "Sweety"));
		List<String> expected = new ArrayList<String>();

		String rev = "";
		for (String s : actual) {
			for (int i = s.length() - 1; i >= 0; i--) {
				rev += s.charAt(i);

			}
			rev += ", ";
		}

		expected.add(rev);
		System.out.println(actual);
		System.out.println(expected);

	}
	
	@Test
	public void revSentence() {
		String name= "My name is geeta.";
		boolean endsWithDot = name.endsWith(".");
		if(endsWithDot) {
			name=name.replace(".", "");
		}
		System.out.println(name);
		String rev="";
		for(String s:name.split("\\s+")) {
			for(int i=s.length()-1;i>=0;i--) {
				rev+=s.charAt(i);
			}
			rev+=" ";
		}
		rev=rev.toString().trim();
		if(endsWithDot) {
			rev+=".";		}
		System.out.println(rev);

		
	}
}

package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class PrintStringFromList {

	
	@Test
	public void printEndsWithLastDigit() {
		List<String> names=new ArrayList<String>(Arrays.asList("kishor2","1M","tm","9L","Three2"));
		List<String> output=new ArrayList();
		
		for(String s:names) {
			if(Character.isDigit(s.charAt(s.length()-1))) {
				output.add(s);
			}
			
		}
		System.out.println(output);
}
	
	
@Test
public void printStartsWithNumb() {
	List<String> names = new ArrayList<String>(Arrays.asList("kishor2", "1M", "tm", "9L", "Three2"));
	List<String> output = new ArrayList();
	for (String s : names) {
		if (Character.isDigit(s.charAt(0))) {
			output.add(s);
		}

	}
	System.out.println(output);

}
@Test
public void printContainsNumb() {
	List<String> names = new ArrayList<String>(Arrays.asList("kishor2", "1M", "t12m", "9L", "Three2"));
	List<String> op = new ArrayList();
	for (String s : names) {
		for(int i=0;i<=s.length()-1;i++) {
		if (Character.isDigit(s.charAt(i))) {
			op.add(s);
		}
		}
	}
	System.out.println(op);

}
}

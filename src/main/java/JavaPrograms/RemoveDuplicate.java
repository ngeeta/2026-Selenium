package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicate {
	@Test
public void removeFromarrayList() {
	ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A", "B", "A", "C", "D", "B"));
	ArrayList<String> unq = new ArrayList<String>();
	
	Iterator<String> itr=ar.iterator();
	while(itr.hasNext()) {
		String dupWord=itr.next();
		if(unq.contains(dupWord)) {
			itr.remove();
		}else {
			unq.add(dupWord);
		}
	}
	System.out.println("Unq are "+unq);
}
	
	@Test
	public void removeUsingSet() {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Geeta", "Geeta", "A", "C", "D", "B"));
		Set<String> unq = new HashSet<String>(ar);
		System.out.println(unq);
	}
	
	@Test
	public void removeUsingSetChar() {
		ArrayList<Character> ar = new ArrayList<Character>(Arrays.asList('a','b','a','c'));
		Set<Character> unq = new HashSet<Character>(ar);
		System.out.println(unq);
	}
	
	@Test
	public void removefromArray() {
String a[]={"A","B","Z","Y","X","C","Z","B"};
ArrayList<String> ar = new ArrayList<String>(Arrays.asList(a));
Set<String> unq = new HashSet<String>(ar);

System.out.println(unq);	
	}
}

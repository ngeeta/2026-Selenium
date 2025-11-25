package JavaPrograms;

import org.testng.annotations.Test;

public class AddNoFromString {

	@Test
	public void addUsingIsDigit() {
		String s="1Hello2jbdh3jghg4";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(Character.isDigit(s.charAt(i))) {
				sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(sum);
	}
	
	@Test
	public void addWithouUsingIsDigit() {
		String s="1Hello2jbdh3jghg4";
		int sum=0;
		String ss=s.replaceAll("[^0-9]", "");
		System.out.println(ss);
		char a[]=ss.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			sum=sum+Integer.parseInt(String.valueOf(a[i]));
			
		}
System.out.println("Sum "+sum);
	}
	
	@Test
	public void removeDigit() {
		String s="1Hello2world3nagpur4";
		String n="";
	for(int i=0;i<s.length();i++) {
		if(!Character.isDigit(s.charAt(i))) {
			n=n+s.charAt(i);
		}
	}
	System.out.println(n);
	}
}

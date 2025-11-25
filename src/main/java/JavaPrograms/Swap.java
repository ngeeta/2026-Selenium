package JavaPrograms;

import org.testng.annotations.Test;

public class Swap {
	@Test
	public static void swapString() {
		String a="Hello";//5
		String b="Worldd";//6
		
	
	System.out.println( "a : "+a+" b: "+b);
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length())
;	System.out.println( "a : "+a+" b: "+b);

	
	}
	@Test
	public static void withTempVar() {
		int a = 1, b = 2, c;
		System.out.println("a " + a + " b " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("a " + a + " b " + b);
	}
	@Test
	public static void withoutTemp() {
		int a = 1, b = 2;
		System.out.println("\na " + a + " b " + b);
		a = a + b;//3
		b = a - b;//3-1=2
		a = a - b;//3-2=1
		System.out.println("\na " + a + " b " + b);

	}
}

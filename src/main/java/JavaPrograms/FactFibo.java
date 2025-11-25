package JavaPrograms;

import org.testng.annotations.Test;

public class FactFibo {

	@Test
	public void fact() {
		//5=1*2*3*4*5
		int num=5;
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+num +" is "+fact);
	}
	
	@Test
	public void fibonacci() {
		//1,2,3,5,8,13,21,34,55,89		
		int num=10;
		int a=1,b=2,c=0;
		System.out.print(a+","+b+",");
		for(int i=2;i<num;i++) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}
}

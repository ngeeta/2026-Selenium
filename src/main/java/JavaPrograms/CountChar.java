package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountChar {

	@Test
	public void count() {
		String name="My@@name.is.Geeta";
		String newS=name.replaceAll("\\s+", "").toLowerCase();
		System.out.println(newS);
		
	}
}

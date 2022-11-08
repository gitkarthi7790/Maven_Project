package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;







public class Parametrized_test {
	@Test
	@Parameters({"name","name2","n"})
	public void details(String name,String name2, int n) {
		System.out.println("First name is   "+name);
		System.out.println("last name is   "+ name2);
        System.out.println("age is   "+n);		
	}

}

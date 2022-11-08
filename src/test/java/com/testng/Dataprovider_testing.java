package com.testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_testing {

	@Test(dataProvider = "input")

	public void top_it_companys(String name, int a, float b) {
		System.out.println("name is:" + name);
		System.out.println("int value is:" + a);
		System.out.println("float value is:" + b);

	}

	@DataProvider
	public Object[][] input() {
		return new Object[][] { { "karthick", 10, 10.6 }, { "vijay", 5, 5.2 } };

	}
}

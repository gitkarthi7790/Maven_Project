package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider = "input")
	public void mobile(String mobile,long a) {
		
	System.out.println("mobile brand name:"+mobile);	
	
	System.out.println("mobile price :"+a);	
	}
	
	@DataProvider
	public Object[][] input() {
		return new Object[][] {{"apple",40000},{"vivo",15000},{"nokia",3000}};
	
	}
}


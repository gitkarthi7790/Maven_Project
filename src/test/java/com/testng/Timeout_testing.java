package com.testng;

import org.testng.annotations.Test;

public class Timeout_testing {
	
	
	
	
	
	
	@Test(timeOut = 8000)
public void names() throws InterruptedException {
	Thread.sleep(2000);	
	System.out.println("aaaaaaa");
	
	Thread.sleep(1000);
	System.out.println("bbbbbbb");
	
	Thread.sleep(3000);
	System.out.println("ccccccc");
	
		
	}
}

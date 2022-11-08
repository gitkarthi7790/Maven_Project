package com.testng;

import org.testng.annotations.Test;

public class gift {
	@Test(priority=0)
	public void givefirststudent() {
System.out.println("first student name:mukil");

	}

	@Test(priority=1)

	public void givesecondstudent() {
System.out.println("second student name:arun");

	}

	@Test(priority=2)
	public void givethirdstudent() {
System.out.println("third student name:ramu");

	}
	
	@Test(priority=3)
	public void giveforthtudent() {
System.out.println("forth student name:vijay");

	}

}

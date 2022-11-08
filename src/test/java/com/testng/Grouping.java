package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"apple"})
	public void apple1() {
		System.out.println("i am apple1");

	}

	@Test(groups= {"apple"})

	public void apple2() {
		System.out.println("i am apple2");

	}

	@Test(groups= {"vivo"})

	public void vivo1() {
		System.out.println("i am vivo1");

	}

	@Test(groups= {"vivo"})

	public void vivo2() {
		System.out.println("i am vivo2");

	}

	@Test(groups= {"nokia"})

	public void nokia1() {
		System.out.println("i am nokia1");

	}

	@Test(groups= {"nokia"})

	public void nokia2() {
		System.out.println("i am nokia2");

	}

	@Test(groups= {"samsung"})

	public void samsung1() {
		System.out.println("i am samsung1");

	}

	@Test(groups= {"samsung"})

	public void samsung2() {
		System.out.println("i am samsung2");

	}
}
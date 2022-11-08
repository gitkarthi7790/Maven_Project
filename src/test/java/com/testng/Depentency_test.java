package com.testng;

import org.testng.annotations.Test;

public class Depentency_test {
	@Test(enabled = false)
	public void grandfather() {
		System.out.println("grand father properties");
		
	}
	@Test(dependsOnMethods ="grandfather" )
	public void father() {
		System.out.println("father properties");
		
	}
	@Test(dependsOnMethods ="father" )
	public void son() {
		System.out.println("son properties");
		
	}

}

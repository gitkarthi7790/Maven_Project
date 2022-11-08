package com.testng;

import org.testng.annotations.Test;

public class Skip_test_case {
	@Test(priority=0)
	public void morning_veg() {
		System.out.println("MORNING VEG: IDLY,PONGAL,DOSA");
		
	}
	
	@Test(priority=1,enabled = false)
	public void morning_nonveg() {
		System.out.println("MORNING NONVEG:KARIDOSA,OMLET");
		
	}
	
@Test(priority=2)
public void afternoon_veg() {
	System.out.println("AFTERNOON VEG:RICE,RASAM,SAMBAR,PORIYAL");
	
}
@Test(priority=3)
public void afternoon_nonveg() {
	System.out.println("AFTERNOON VEG: BRIYANI,CHICKEN FRY");
	
}
}
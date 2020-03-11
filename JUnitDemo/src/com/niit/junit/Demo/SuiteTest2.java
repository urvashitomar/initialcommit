package com.niit.junit.Demo;

import org.junit.*;


public class SuiteTest2 {
	@Test		
    public void createAndSetName() {					
      				
        String actual= "Y";
        String expected = "Y";					
        				

        Assert.assertEquals(expected, actual);					
        System.out.println("Suite Test 2 is successful " + actual);	
}
}

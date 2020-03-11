package com.niit.junit.Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {

	public String message = "Raj";							

    JunitMessage junitMessage = new JunitMessage(message);							

    @Test//(expected = ArithmeticException.class)	//junit exception test				
    public void testJUnitMessage() {					

        System.out.println("Junit Message is printing ");					
        junitMessage.printMessage();			

    }		

    @Test		
    public void testJUnitHiMessage() {					
        message = "Hi!" + message;							
        System.out.println("Junit Hi Message is printing ");					
        assertEquals(message, junitMessage.printHiMessage());					
        System.out.println("Suite Test 1 is successful " + message);
}
}

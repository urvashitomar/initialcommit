package com.niit.junit.Demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SuiteTest1.class, SuiteTest2.class })
public class AllTests {
	//This class remains empty, it is used only as a hholder 
	//for the above annotations
}

package com.niit.junit.Demo;

public class JunitMessage {
	String m;
	JunitMessage(String msg)
	{
		m=msg;
	}
String printMessage()
{
	return m;
}

String printHiMessage()
{
	return "Hi!"+m;
}
}

package com.nwt.webproject;

public class Test {
private static String MESSAGE_NEW = "SOME TESTING"; 
private static String MESSAGE_OLD = "SOME TESTING"; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello!!!   "+MESSAGE_NEW);
	}
	public static int someAddMethod(){
		int a = 0;
		int b = 0;
		int c = 0;
		
		c = a+b;
		//a test comment that I'll push to git for jenkins testing - 10/8/14

		return c;
		
	}
}

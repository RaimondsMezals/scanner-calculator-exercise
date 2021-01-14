package com.qa.main;

public class Calculator {
	
	private int c;
	
	public int addition(int input) {
		
		int a = 10;
		int b = input;
		
		
		c = a + b;
		return c;
	}
	
	public int subtraction(int input) {
		
		int a = 10;
		int b = input;
		
		
		c = a - b;
		return c;
	}
	
	public int multiplication(int input) {
		
		int a = 10;
		int b = input;
		
		
		c = a * b;
		return c;
	}
	public void division(int input) {
		
		int a = 10;
		int b = input;
		
		if(a >= b) {
			
			c = a / b;
			System.out.println(c);
			
		}else {
			System.out.println("division cannot be performed");
		}
		
		
	}
	
		

}

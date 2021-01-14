package com.qa.main;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please write which function you would like to use.\n 1. addition 2. subtraction 3. multiplication 4. division");
		
		String result = input.nextLine();
		
		Calculator c = new Calculator();
		
		switch(result) {
		case "addition":
			System.out.println("Please enter an int for calculation");
			result = input.nextLine();
			System.out.println(c.addition(Integer.parseInt(result)));
			break;
		case "subtraction":
			System.out.println("Please enter an int for calculation");
			result = input.nextLine();
			System.out.println(c.subtraction(Integer.parseInt(result)));
			break;
		case "multiplication":
			System.out.println("Please enter an int for calculation");
			result = input.nextLine();
			System.out.println(c.multiplication(Integer.parseInt(result)));
			break;
		case "division":
			System.out.println("Please enter an int for calculation");
			result = input.nextLine();
			c.division(Integer.parseInt(result));
			break;
		default:
			System.out.println("Unexpected input");
			break;
		
		}
		
		
		input.close();
		System.out.println("input has been closed!\n\t- Exit!");
		
	}

}

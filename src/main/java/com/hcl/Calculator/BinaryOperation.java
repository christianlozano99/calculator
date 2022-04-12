package com.hcl.Calculator;

import java.util.Scanner;

public class BinaryOperation {
	char operation;
	double num1;
	double num2;
	
	// Constructor calls method to set values
	public BinaryOperation(Scanner myObj)
	{
		setValues(myObj);
	}
	
	private void setValues(Scanner myObj)
	{
		try {
		System.out.print("\n _____________\n|             |\n|New Operation|\n|_____________|\n");
		System.out.print("\nEnter Number 1: ");
		double num1 = myObj.nextDouble();
		
		System.out.print("\nEnter Number 2: ");
		double num2 = myObj.nextDouble();

		System.out.print("\nChoose an Operation:  +, -, *, /, ^ , or % : ");
		char operator = myObj.next().charAt(0);

		System.out.print("\nResult: ");
		
		this.operation = operator;
		this.num1 = num1;
		this.num2 = num2;
		
		} catch(Exception e) {
			System.out.println("Invalid number, please try again!");
			myObj.nextLine();
			setValues(myObj);
		}
	}

	// all of the possible operations
	
	public void multiply() {
		double result = this.num1 * this.num2;
		System.out.println(this.num1 + " * " + this.num2 + " = " + result);
	}
	
	public void add() {
		double result = this.num1 + this.num2;
		System.out.println(this.num1 + " + " + this.num2 + " = " + result);
	}
	
	public void substract() {
		double result = this.num1 - this.num2;
		System.out.println(this.num1 + " - " + this.num2 + " = " + result);
	}
	
	public void mod() {
		double result = this.num1 % this.num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
	}

	public void power() {
		double result = Math.pow(this.num1, this.num2);
		System.out.println(this.num1 + " ^ " + this.num2 + " = " + result);
	}

	public void divide() {
		double result = this.num1 / this.num2;
		
		if(Double.isNaN(result) || Double.isInfinite(result)) {
			System.out.println("Operation " + this.num1 +"/" + this.num2 + " is undefined!");
		}
		else {
			System.out.println(num1 + " / " + num2 + " = " + result);
		}
	}
	
	public void invalidOperator() {
		System.out.println("Invalid Operator!");
	}
	
}

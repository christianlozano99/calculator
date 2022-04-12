//Never have default package, always have a class under a package com.hcl.***
package com.hcl.Calculator;

//Never have wildcard package names like java.util.* something like that
import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		//Refactored the banner
		printSplashBanner();

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		while (true) {
			//Created a BinaryOperation class and are getting multiple 
			//return values from a function
			BinaryOperation binaryOperation = new BinaryOperation(myObj);
			
			// Used Switch case and made the code more readable
			switch (binaryOperation.operation) {
			case '*':
				binaryOperation.multiply();
				break;
			case '+':
				binaryOperation.add();
				break;
			case '-':
				binaryOperation.substract();
				break;
			case '/':
				binaryOperation.divide();
				break;
			case '^':
				binaryOperation.power();
				break;
			case '%':
				binaryOperation.mod();
				break;
			default:
				binaryOperation.invalidOperator();
				break;
			}

			//Footer with a boolean to exit
			if(footer(myObj)) {
				break;
			}

		}
	}



	private static boolean footer(Scanner myObj) {
		System.out.print("\nWould you like to continue? (Y/N): ");
		char doneKey = myObj.next().charAt(0);

		if (doneKey == 'N' || doneKey == 'n') {
			System.out.println(" ____________________________________");
			System.out.println("|                                    | ");
			System.out.println("|Thank you for using Java Calculator!|");
			System.out.println("|____________________________________| ");

			return true;
		}
		
		else if(doneKey == 'Y' || doneKey == 'y') {
			return false;
		}
		
		else {
			System.out.println("\nInvalid Option!");
			return footer(myObj);
		}
	}

	private static void printSplashBanner() {
		System.out.println(" _____________________________ ");
		System.out.println("|                             | ");
		System.out.println("| Welcome to Java Calculator! |");
		System.out.println("|_____________________________|");
	}

}
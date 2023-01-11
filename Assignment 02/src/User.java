/*
* Student Name: Alexandre Valiquette
* Lab Professor: Professor Fedor Litchev
* Due Date: July 22, 2022 
* Modified: July 17, 2022.
* Description: Assignment 02
*
*/

import java.util.Scanner;

// user 
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	// method inputInteger for the bag options
	public int inputInteger() {
		int value = keyboard.nextInt();
		keyboard.nextLine();
		return value;
	}
	
	// method inputInteger with parameter
	public int inputInteger(String message) {
		System.out.println(message);
		int value = inputInteger();
		return value;
	}
	
	// method inputDouble for the bag's weight
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	// method inputDouble  with parameters 
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
}
/*
 * Student Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: 'The Due Date (22S)'
 * Description: Sample Solution Exercise02 (22S)
 */

import java.util.Scanner;

/*
 * This class contains a main method to run the program.
 */
public class Exercise02 {

	/*
	 * The program in method main is used to perform tests against class
	 * Cabbage, it asks for inputs from the user, sets them into a cabbage
	 * object's fields, retrieves the values and utilizes the worker methods.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Cabbage cabbage = new Cabbage();
		double weight;
		double costPerKilogram;
		double price;
		
		System.out.print("Enter weight: ");
		weight = keyboard.nextDouble();
		
		System.out.print("Enter cost per kilogram: ");
		costPerKilogram = keyboard.nextDouble();
		
		cabbage.setWeight(weight);
		cabbage.setCostPerKilogram(costPerKilogram);
		
		weight = cabbage.getWeight();
		costPerKilogram = cabbage.getCostPerKilogram();
		price = cabbage.calculatePrice();
		
		System.out.println("cabbage.getWeight() is: " + weight);
		System.out.println("cabbage.getCostPerKilogram() is: " + costPerKilogram);
		System.out.println("cabbage.calculatePrice() is: " + price);
		
		System.out.println("cabbagge.printReport() is: ");
		cabbage.printReport();
		
		System.out.println("Testing overloaded constructor with anotherCabbage");
		System.out.println("weight 3.5, cost per kilogram 2.50");
		Cabbage anotherCabbage = new Cabbage(3.5, 2.50);
		System.out.println("anotherCabbage.printReport() is: ");
		anotherCabbage.printReport();
		
		System.out.println("Program implemented by Stanley Pieda");

	}

}

/*
* Student Name: Alexandre Valiquette
* Lab Professor: Professor Fedor Litchev
* Due Date: June 24, 2022 
* Modified: June 19, 2022.
* Description: This 
*/

import java.util.Scanner;


public class Ecercise03 {

/*
 * This class is responsible for running the program.
 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		RightAngleTriangle triangle = new RightAngleTriangle();
		double adjacent;
		double opposite;	
	
		System.out.print("Enter length of adjacent angle: ");
		adjacent = keyboard.nextDouble();
			
		System.out.print("Enter length of opposite angle: ");
		opposite = keyboard.nextDouble();
			
		triangle.setAdjacent(adjacent);
		triangle.setOpposite(opposite);
		
		System.out.println(triangle.createReport());		
		
		//prints the calculations done for finding the hypotenuse
		System.out.print("Hypotenuse: ");
		System.out.println(String.format("%.4f", triangle.calculateHypotenuse()));
		
		//prints the calculations done for the perimeter
		System.out.print("Perimeter: ");
		System.out.println(String.format("%.4f", triangle.calculatePerimeter()));
		
		//prints the calculations done for the area
		System.out.print("Area: ");
		System.out.println(String.format("%.4f", triangle.calculateArea()));
		
		System.out.println("Program by Alexandre Valiquette");
		keyboard.close();
		
	}
	
}

/*
* Student Name: Alexandre Valiquette
* Lab Professor: Professor Fedor Litchev
* Due Date: July 22, 2022 
* Modified: July 17, 2022.
* Description:  This class will output a menu that will have 4 options,
* some of the options are not within the main method and 
* will be within MeterStick. Like verify and toString.
*
*/
import java.util.Scanner;

/*
 * main class, will execute the program and holds the menu
 */
public class Exercise04 {

	
	public static void main(String[] args) {
        // constants for the menu
		final int OPTION_1 = 1;
		final int OPTION_2 = 2;
		final int OPTION_3 = 3;
		final int OPTION_4 = 4;
		
		Scanner keyboard = new Scanner(System.in);
		MeterStick stick = new MeterStick();
		double userLength;
		int option;
		String output;

		System.out.println("Meter stick checker program.");
		System.out.print("Enter measured length in meters: ");
		userLength = keyboard.nextDouble();
		keyboard.nextLine();
		stick.setLength(userLength);

		// output the menu here, using constants
		System.out.printf("Please select one of the following:%n");
		System.out.printf("1 to validate meter stick%n",
				OPTION_1);
		System.out.printf("2 to show meter stick length in centimeters%n",
				OPTION_2);
		System.out.printf("3 to show meter stick lentgh in milimeters%n",
				OPTION_3);
		System.out.printf("4 to show meter stick report%n",
				OPTION_4);
		
		// below accepts input for user option
		option = keyboard.nextInt();
		keyboard.nextLine();
		
        //
		switch(option) {
		case OPTION_1:
			output = stick.verify();
			break;
		case OPTION_2:
			output = String.format("Centimeters: %.5f", stick.toCentimeters());
		    break;
		case OPTION_3:
			output = String.format("Millimeters: %.5f", stick.toMillimeters());
		case OPTION_4:
			output = stick.toString();
			break;
		default:
			output = "Not a valid option";
		}
		
		System.out.println(output);
		System.out.println("Program by Alexandre Valiquette"); 
	}
}

//ToDo: Supervisor wants programmer comments (use /* */ comment)

import java.util.Scanner;

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	// method inputInteger for the guess
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
	
	// method inputDouble for the guess
	public double inputDouble() {
		double value = keyboard.nextDouble();
		keyboard.nextLine();
		return value;	
	}
	
	// method inputDouble with parameter
	public double inputDouble(String message) {
		System.out.println(message);
		double value = inputDouble();
		return value;
	}
	// method inputString for the restart option (yes/no)
	public String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
    // method inputString with parameter
	public String inputString(String message) {
		System.out.println(message);
		String value = inputString();
		return value;
	}
}
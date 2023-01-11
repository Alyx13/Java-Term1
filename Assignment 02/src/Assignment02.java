/*
* Student Name: Alexandre Valiquette
* Lab Professor: Professor Fedor Litchev
* Due Date: July 22, 2022 
* Modified: July 17, 2022.
* Description: Assignment 02
*
*/
import java.util.Scanner;

// class assignment 02
public class Assignment02 {

	/*
	 *  this method will output and get the information
	 *  needed to complete the task. It will add up the bags 
	 *  and keep track of the total. It will keep track of the total,
	 *  good and bad bags.
	 */	
	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		PotatoChipBag bag = new PotatoChipBag();
		User user = new User();
		int total = 0;
		int correctbags = 0; 
		int incorrectbags = 0;
		//String userinput = keyboard.nextLine();
		//String yes = userinput;
		//String no = userinput;
		
		
		while(true) {
			// bag size will be inputed using Integers
			bag.setSize(user.inputInteger("Enter bag size: \n" 
		+ "Press 1 for regular size \n" 
		+ "Press 2 for large size"));
			
			// ask for weight of the bag in the decimal values
			if (bag.getSize() == 1 
					|| bag.getSize() == 2) {
				
				// input weight
				bag.setWeight(user.inputDouble("Enter weight: "));
				
				// will find out if the bags are good and will add up both 
			    // the total good bags and the total bags
			    if (bag.isBagCorrectWeight() == true) {
			    	correctbags++;
			    	total = correctbags + incorrectbags;}
			    
			    // will find out if the bags are bad and will add up both 
			    // the total bad bags and the total bags
			    else {incorrectbags++;
			    total = correctbags + incorrectbags;}
			    
			    // print results of bags
			    System.out.println("Number of Good bags: " + correctbags);
			    System.out.println("Number o Bad bag: " + incorrectbags);
			    System.out.println("Number of Total bags: " + total);
			}
			    else {System.out.println("Incorrect bag size entered");}
			
			System.out.println("Programmed by Alexandre Valiquette");
			
			// ask if you would like to restart program
			System.out.println("Would you like to Continue? (yes/no)");
			
			Scanner keyboard = new Scanner(System.in);
			String userinput = keyboard.nextLine();
			String yes = userinput;
			String no = userinput;
			
			// restarts the loop
			if (yes.equalsIgnoreCase("Yes")) {
				continue;}
			
			// stops the program
			else {System.out.println("Program has finished");
			break;}
			
			}
			    }

			    
			}
			
			
			
		
		

	

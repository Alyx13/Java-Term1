/*
 * Student Name: Alexandre Valiquette
 * Lab Professor" Professor Fedor Litchev
 * Due Date: June 17, 2022
 * Description: Responsible for running the program
 */
import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		TableTop_Worker Worker = new TableTop_Worker();
		TableTop_Worker Tables = new TableTop_Worker();
		
		double coatsvarnish;
		double diameter;
		double surfacetable;
		double TotalTables;
		
		System.out.print("Enter diameter in inches only: ");
		diameter = keyboard.nextDouble();
		
		System.out.print("Enter number of coats required : ");
		coatsvarnish = keyboard.nextDouble();
		
		Tables.setDiameter(diameter);
		surfacetable = Tables.computeSurfaceTable();
		
		TotalTables = Worker.computeTotalTables(surfacetable, 
				coatsvarnish);
		
		System.out.println("There is enough varnish for " + 
		TotalTables + " tables to be done with 4 coats each");
	

	}

}

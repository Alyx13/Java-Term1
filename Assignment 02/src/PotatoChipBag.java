/*
* Student Name: Alexandre Valiquette
* Lab Professor: Professor Fedor Litchev
* Due Date: July 22, 2022 
* Modified: July 17, 2022.
* Description: Assignment 02
*
*/

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class PotatoChipBag {
	private int size; // Regular or Large (use constants below)
	private double weight; // oz
	public static final int REGULAR = 1;
	private static final double REGULAR_WEIGHT = 9.25; // oz
	public static final int LARGE = 2;
	private static final double LARGE_WEIGHT = 15.75; // oz
	private static final double EPSILON = 0.01; // value 0/01
	
	// default constructor
	public PotatoChipBag() {
		this(REGULAR, REGULAR_WEIGHT);
	}
	
	// constructor with parameters
	public PotatoChipBag(int size, double weight) {
		this.size = size;
		this.weight = weight;
	}
	
	// getter for size
	public int getSize() {
		return size;
	}
	
	// setter for size
	public void setSize(int size) {
		this.size = size;
	}
	
	// getter for weight
	public double getWeight() {
		return weight;
	}
	
	// setter for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// this method with verify if the bag is within range of 0.01 oz
	public boolean isBagCorrectWeight() {
		boolean result = false;
		// if 1 is inputed, it equates to regular size bag
		if (size == 1) {
			
			// if value is within range
			if (REGULAR_WEIGHT - weight <= EPSILON && weight - REGULAR_WEIGHT <= EPSILON)
			    {result = true;}
			
			// if value is out of range
			else {result = false;}
		}
		// if 2 is inputed, it equates to large size bag
		else if (size == 2) {
		
			// if value is within range
			if (LARGE_WEIGHT - weight <= EPSILON &&  weight - LARGE_WEIGHT <= EPSILON)
		{result = true;}
			
		// if value is out of range
			else {result = false;}
		}
		return result;
	}

}
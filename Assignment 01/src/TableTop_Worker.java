/*
 * Student Name: Alexandre Valiquette
 * Lab Professor" Professor Fedor Litchev
 * Due Date: June 17, 2022
 * Description: This class is responsible for the diameter of the table top and 
 * the Wood Worker
 */

 //This class will have both worker methods in the same class.
 
public class TableTop_Worker {
	
	//private double tabelediameter;
	private double diameter;
	
	//this so the value can be input
	public TableTop_Worker() 
		{this(0);}
	
	//the diameter can be set by an input
	public TableTop_Worker(double diameter) 
		{this.diameter = diameter;}
	
	//set method for diameter
	public void setDiameter(double diameter) 
		{this.diameter = diameter;}
	
	//get method for diameter
	public double getDiameter() 
		{return diameter;}
	
	
public TableTop_Worker(int i) {
		
	}


/*
 * r stands for radius
 */
	public double computeSurfaceTable() {
		double surfacetable = 0, r = 0;
		//r = tablediameter / 2;
		r = diameter / 2;
		surfacetable = Math.PI * Math.pow(r, 2);
		return surfacetable;
	}
	
	/*
	 * This part of the code is the Worker, it only has one worker
	 * method. This method is in charge of calculating the inputs 
	 * for the diameter and coats. The surfacearea calculations 
	 * are made above this comment.
	 */
	public double computeTotalTables(double surfacetable, double coatsvarnish) {
		double TotalTables;
		TotalTables = 46800 / (surfacetable * coatsvarnish);
		return TotalTables;
	}
	
}

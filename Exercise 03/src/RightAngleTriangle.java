/*
 * Student Name: Alexnadre Valiquette
 * Student Number: 040998420
 * Professor Name: Professor Fedor Litchev
 * Due Date: June 24, 2022 
 * Modified: June 24, 2022
 * Description: This class will be responsible for all the 
 * triangles information such as the hypotenuse,perimeter and area.
 * There will also be a report that will print all of this into the
 * main method.  
 */

public class RightAngleTriangle {

	//
	private double adjacent;
	private double opposite;
	
	public RightAngleTriangle() {
		this(0,0);
		}
	
	public RightAngleTriangle(double adjacent, 
			double opposite) {
		this.adjacent = adjacent;
		this.opposite = opposite;
	}
	
	public double getAdjacent(){
		return adjacent;
	}
	
	public void setAdjacent(double adjacent){
		this.adjacent = adjacent;
	}
	
	public double getOpposite(){
		return opposite;
	}
	
	public void setOpposite(double opposite){
		this.opposite = opposite;
	}
	
	public double calculateHypotenuse() {
		double hypotenuse = 0;
		hypotenuse = Math.sqrt((adjacent*adjacent)+
				(opposite*opposite));
		return hypotenuse;
	}
	
	public double calculatePerimeter(){
		double perimeter = 0;
		perimeter = (adjacent + opposite + 
				calculateHypotenuse());
		return perimeter;
	}
	
	public double calculateArea(){
		double area = 0;
		area = (adjacent * opposite) / 2;
		return area;
	}
	
	public String createReport(){
		double hypotenuse; 
		hypotenuse = calculateHypotenuse();
		String printReport  = String.format("%s : %.4f, %s : %.4f, %s : %.4f",
				"adjacent", adjacent, "opposite", opposite, "hypotenuse", hypotenuse);
		
		return printReport;
			
	}

}
	
	
	





	
	
	
	



	

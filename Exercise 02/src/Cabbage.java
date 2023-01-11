/*
 * Student Name: Stanley Pieda
 * Lab Professor: Professor Stanley Pieda
 * Due Date: 'The Due Date (22S)'
 * Description: Sample Solution Exercise02 (22S)
 */

/*
 * This class models a Cabbage for a grocery
 * store, with attributes of weight and cost-per-kilogram
 * with a worker method to calculate the price
 * i.e. price = weight * costPerKilogram, and a
 * worker method to output a report to the console
 * that represents the values in the cabbage object in
 * memory.
 */
public class Cabbage {
    private double weight;
	private double costPerKilogram;
	
	/*
	 * no-argument constructor, calls
	 * overloaded constructor passing zero for all
	 * fields.
	 */
	public Cabbage() {
		this(0,0);
	}
	
	/*
	 * overloaded constructor, parameters are in order
	 * of weight, then costPerKilogram.
	 */
	public Cabbage(double weight, double costPerKilogram) {
		this.weight = weight;
		this.costPerKilogram = costPerKilogram;
	}

	/*
	 * accessor for weight
	 */
	public double getWeight() {
		return weight;
	}

	/*
	 * mutator for weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * accessor for costPerKilogram
	 */
	public double getCostPerKilogram() {
		return costPerKilogram;
	}

	/*
	 * mutator for costPerKilogram
	 */
	public void setCostPerKilogram(double costPerKilogram) {
		this.costPerKilogram = costPerKilogram;
	}

	/*
	 * worker method to return price of this cabbage
	 * based on price = weight * costPerKilogram
	 */
	public double calculatePrice() {
		double price;
		price = weight * costPerKilogram;
		return price;
	}

	/*
	 * worker method that outputs a report to console
	 * in format of "Cabbage: weight x, cost per kilogram y"
	 * Note that is adds a line return on the end
	 * of the output.
	 */
	public void printReport() {
		System.out.println("Cabbage: weight " + weight + 
				", cost per kilogram " + costPerKilogram);
	}
	
}

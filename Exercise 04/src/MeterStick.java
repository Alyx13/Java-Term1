/*
* Student Name: Alexandre Valiquette
* Lab Professor: Professor Fedor Litchev
* Due Date: July 22, 2022 
* Modified: July 17, 2022.
* Description: This class will convert lengths, verify if length is within the set length
* and have strings that are all formated to 5 decimals
*/

/*
 * This class is responsible of vrifying the meter stick length  
 */
public class MeterStick {
	public static final double EXPECTED_LENGTH = 1.0; // meters
	public static final double EPSILON = 0.0001;
	private double length;
	
	/*
	 * overload constructor, accepts length in meters 
	 */
	public MeterStick() {
		this(EXPECTED_LENGTH);
	}
	
	/*
	 * overload constructor, accepts length 
	 */
	public MeterStick(double length) {
		this.length = length;
	}
	
	/*
	 * accessor for length, in meters
	 */
	public double getLength() {
		return length;
	}
	
	/*
	 * mutator for length, in meters
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/*
	 * method for converting length in centimeters
	 */
	public double toCentimeters() {
		double centimeters;
		centimeters = length * 100;
		return centimeters;
	}
	
	/*
	 * method for getting length in millimeters
	 */
	public double toMillimeters() {
		double millimeters;
		millimeters = length * 1000;
		return millimeters;
	}
	
	/*
	 * toString method will output length formated at 5 decimals
	 */
	public String toString() {
		String report;
		report = String.format("MeterStick length of %.5f", length);
		return report;
	}
	
	/*
	 * String method that has if else within, and is responsible for
	 * for verifying that the length is within tolerance.
	 */
	public String verify() {
		double gap;
		boolean tolerable;
		String report;
		
		gap = Math.abs(length - EXPECTED_LENGTH);
		tolerable = gap <= EPSILON;
		
		if(tolerable) {
			report = String.format(
					"Meter stick is within tolerance of %.5f", EPSILON);
		}
		else {
			report = String.format(
					"meter stick is not within tolerance of %.5f", EPSILON);
		}
		return report;
	}

}

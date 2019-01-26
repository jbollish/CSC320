/**
 * A class representing car attributes 
 * make, model, color, year, mileage. 
 * @author Joseph Bollish
 */
public class car {
	private String carMake;
	private String carModel;
	private String carColor;
	private int carYear;
	private int carMileage;
	
	// constructor
	public car() {
		carMake = "";
		carModel = "";
		carColor = "";
		carYear = 0;
		carMileage = 0;
	}
	
	 /**
	    * Sets parameters to private variables
	    * @param make, model, color, year, mileage
	   */
	public void setCar(String make, String modle, String color, int year, int mileage) {
		this.carMake = make;
		this.carModel = modle;
		this.carColor = color;
		this.carYear = year;
		this.carMileage = mileage;
		return;
	}
	
	//@return a String value representing the make
	public String getMake() {
		return carMake;
	}
	
	//@return a String value representing the model
	public String getModle() {
		return carModel;
	}
	
	//@return a String value representing the color
	public String getColor() {
		return carColor;
	}
	
	//@return an int value representing the year
	public int getYear() {
		return carYear;
	}
	
	//@return an int value representing the mileage
	public int getMileage() {
		return carMileage;
	}
	
	// Converts to Strings
	public String toString() {
		return new String(carMake + " " + carModel + " " + carColor  + " " + carYear + " " + carMileage + " ");
	}

	// Prints object
	public void print() {
		System.out.println(carColor  + " " + carYear + " " + carMake + " " + carModel);
		System.out.println("mileage: " + carMileage);
		System.out.println("");
	}
}

/************************
 * Programming 1
 * WINTER17-C-8-CSC320-1
 *@author Joseph Bollish
 * Module 2
 * Option 1
 * 1/20/2018
 ************************/

import java.util.Scanner;
public class Program2_JosephBollish {

	public static void main(String[] args) {
		
		String carMake;
		String carModle;
		int carYear;
		double carStartOdometer;
		double carEndOdometer;
		double MPG;
		
		// Input information for vehicle
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter car brand: ");
		carMake = scnr.next();
		
		System.out.println("Enter car modle: ");
		carModle = scnr.next();
		
		System.out.println("Enter year: ");
		carYear = scnr.nextInt();
		
		System.out.println("Enter starting odometer: ");
		carStartOdometer = scnr.nextDouble();
		
		System.out.println("Enter ending odometer: ");
		carEndOdometer = scnr.nextDouble();
		
		System.out.println("Enter estimated miles per gallon: ");
		MPG = scnr.nextDouble();
		
scnr.close();
		
		// output text
		System.out.print(carYear+ " ");
		
		System.out.print(carMake + " ");
		
		System.out.println(carModle);
		
		double totalMiles = carEndOdometer - carStartOdometer;
		double gasTotal = totalMiles / MPG;
		
		System.out.println("Total miles traveled: " + totalMiles);
		System.out.println("Total gas consumed: " + gasTotal + " gallons");
		
		return;

	}

}

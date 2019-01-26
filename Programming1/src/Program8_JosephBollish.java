import java.util.Scanner;
import java.util.ArrayList;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/************************
 * Programming 1
 * WINTER17-C-8-CSC320-1
 *@author Joseph Bollish
 * Module 8
 * option 1
 * 03/11/2018
 ************************/

public class Program8_JosephBollish {
	
	/**method for inputing car attributes into arrayList
	 * @param arrayList and Scanner************************************************/
	
	public static void addInventory(ArrayList<car> cars, Scanner scnr) {
		String makeCar, modleCar, colorCar;
		int yearCar = 0;
		int mileageCar = 0;
		car newCar = new car();
		
		System.out.println("NEW CAR");
		
		System.out.println("Enter car make: ");
		makeCar = scnr.next();
		
		System.out.println("Enter car model: ");
		modleCar = scnr.next();
		
		System.out.println("Enter car color: ");
		colorCar = scnr.next();
		
		System.out.println("Enter car year: ");
		yearCar = scnr.nextInt();
		
		System.out.println("Enter car mileage: ");
		mileageCar = scnr.nextInt();
		
//		newCar = new car();
		newCar.setCar(makeCar, modleCar, colorCar, yearCar, mileageCar);
		cars.add(newCar);
		return;
	}
	
	/**method for showing Inventory
	 * @param arrayList*************************************************************/
	
	public static void showInventory(ArrayList<car> cars) throws Exception {
	    for (int i = 0; i < cars.size(); ++i) {
//	    	if(cars.size() <= 0) {
//    		throw new Exception("Inventory is empty");
//    	}
	    	System.out.print(i + ": ");
	    	cars.get(i).print();
	   
	    }
	    return;
	}
	
	/**method for removing a vehicle
	 * @param arrayList and int
	 * @throws Exception*************************************************************/
	
	public static void removeCar(ArrayList<car> cars, int carNum) throws Exception {
		if(cars.isEmpty()) {
			throw new Exception("No such vehicle.\n");
		}
		cars.remove(carNum);
		return;
	}
	
	/**method for editing a vehicle attributes
	 * @param arrayList and int and Scanner
	 * @throws Exception  **********************************************************/
	
	public static void editCar(ArrayList<car> cars, int carNum, Scanner scnr) throws Exception {
		if(cars.isEmpty()) {
			throw new Exception("No such vehicle.\n");
		}

		System.out.print("Edit vehicle: ");
		cars.get(carNum).print();
		cars.remove(carNum);
		addInventory(cars,scnr);
		cars.add(carNum, cars.get(cars.size()-1));
		cars.remove(cars.size()-1);
		System.out.print("Edit complete ");
		return;

	}
	
	/**method for printing Inventory to text file
	 * @param arrayList 
	 * @throws IOException ************************************************************/
	
	public static void printInventory(ArrayList<car> cars) throws IOException {
		FileWriter fw = new FileWriter("Inventory.txt");
		Writer output = new BufferedWriter(fw);
		int size = cars.size();
		for(int i = 0; i < size; i++) {
			output.write(cars.get(i).toString() + "\n");
		}
		output.close();
		return;
	}
	
	/************************************************************************************/
	

//	public static void readFile(ArrayList<car> cars) throws Exception {
//		BufferedReader input = new BufferedReader(new FileReader("Inventory.txt"));
//		String make ="";
//		String model = "";
//		String color = "";
//		int year = 0;
//		int mileage = 0;
//		car newCar;
////		if(input.ready()) {
////			throw new Exception("No previous file created");
////		}
//		while((input.readLine()) != null) {
//			for(int i = 0; i < 5; i++) {
//				if(i == 0) {
//					 make = input.readLine();	
//				}
//				else if(i == 1) {
//					 model = input.readLine();
//				}
//				else if(i == 2) {
//					 color = input.readLine();
//				}
//				else if(i == 3) {
//					 year = input.read();
//				}
//				else {
//					 mileage = input.read();
//				}
//			}
//			newCar = new car();
//			newCar.setCar(make, model, color, year, mileage);
//			cars.add(newCar);
//			
//		}
//		input.close();
//		return;
//	}

	
	/********Main Method*****************************************************************/

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		int invNum = 0;
		ArrayList<car> allCar = new ArrayList<car>();
		
		System.out.printf("Car Inventory\n\n");
		
		
		// while loop for commands
		while(!(userInput.equals("Quit"))) {
		try {
	        System.out.println("Commands: Add, Show, Edit, Remove, Quit\nEnter command: ");
	        userInput = scnr.next();
	        
	        // Add vehicle
	        if(userInput.equals("Add")) {	
	        	addInventory(allCar,  scnr);
	        	System.out.println("Complete.\n ");
	        }
	        
	     // Remove vehicle
	        else if (userInput.equals("Remove")) {
	        	System.out.println("Enter car number");
	        	invNum = scnr.nextInt();
	        	removeCar(allCar, invNum);
	        }
	        
	     // Show vehicles
	        else if (userInput.equals("Show")) {
	        	showInventory(allCar);
	        }
	        
	     // Edit vehicle attributes
	        else if (userInput.equals("Edit")) {
	        	System.out.println("Enter car number");
	        	invNum = scnr.nextInt();
	        	editCar(allCar, invNum, scnr);
	        }
	        
	     // Exit vehicle commands and option to print inventory to text file
	        else if (userInput.equals("Quit")) {
	        	System.out.println("Would you like to save inventory to file? (Yes or No)");
	        	userInput = scnr.next();
	        	if(userInput.equals("Yes")) {
	        		printInventory(allCar);
	        		System.out.println("File Created");
	        		System.out.println("Quit Inventory");
	        		userInput = "Quit";
	        	}
	        	else if(userInput.equals("No")) {
	        		System.out.println("Quit Inventory");
	        		userInput = "Quit";
	        	}
	        	else {
	        		System.out.println("Invalid command, enter Quit\n");
	        	}

	        }
	        
	        // Invalid input from user
	        else {
	        	System.out.println("Invalid command");
	        }
		} catch (Exception Except) {
			System.out.println(Except.getMessage());
	}
		
		}
		
	}

}

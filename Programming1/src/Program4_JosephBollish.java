import java.util.Scanner;
/************************
 * Programming 1
 * WINTER17-C-8-CSC320-1
 *@author Joseph Bollish
 * Module 4
 * Option 1
 * 02/11/2018
 ************************/
public class Program4_JosephBollish {

	public static void main(String[] args) {
		double myNum;
		double numtotal = 0;
		double maxNum = 0;
		double minNum = 0;
		double valOne = 0, valTwo = 0, valThree = 0, valFour = 0, valFive = 0;
		Scanner input = new Scanner(System.in);
		
		// input loop.
		System.out.println("Enter a set of five numebers:");
		for (int i = 0; i <= 4; i++) {
			myNum = input.nextDouble();
			numtotal = numtotal + myNum;				// Finding the total.
			
			// Finding the interest of each value.
			switch (i) {
			case 0: valOne = myNum + myNum *(0.2);
			break;
				
			case 1: valTwo = myNum + myNum *(0.2);
			break;
			
			case 2: valThree = myNum + myNum *(0.2);
			break;
			
			case 3: valFour = myNum + myNum *(0.2);
			break;
			
			default: valFive = myNum + myNum *(0.2);
			break;
			}
			
			// Finding Maximum and Minimum values.
			if(i == 0) {
				maxNum = myNum;
				minNum = myNum;
			}
			else if(myNum > maxNum) {
					maxNum = myNum;
				}
			else if(myNum < minNum) {
					minNum = myNum;
					}
			else {
				continue;
			}
		
		}
		input.close();
		// input print out.
		System.out.println ("Total: " + numtotal);
		System.out.println ("Average: " + numtotal/5);   // Finding the average.
		System.out.println ("Maximum: " + maxNum);
		System.out.println ("Minimum: " + minNum);
		System.out.println ("Interest on value one: " + valOne);
		System.out.println ("Interest on value two: " + valTwo);
		System.out.println ("Interest on value three: " + valThree);
		System.out.println ("Interest on value four: " + valFour);
		System.out.println ("Interest on value five: " + valFive);
	}

}

import java.text.DecimalFormat;
import java.util.Scanner;

/************************
 * Programming 1
 * WINTER17-C-8-CSC320-1
 *@author Joseph Bollish
 * Module 3
 * Option 1
 * 02/03/2018
 ************************/

public class Program3_JosephBollish {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double  weeklyIncome = 0;
		
		// Input
		System.out.println("Enter weekly income:");
		weeklyIncome = scnr.nextDouble();
		
		scnr.close();
		
		// branching for different incomes for tax rates
		if (weeklyIncome < 500.0) {
			 weeklyIncome = weeklyIncome*0.1;
		}
		else if(weeklyIncome >= 500.0 && weeklyIncome < 1500.0 ) {
			 weeklyIncome = weeklyIncome*0.15;
			
		}
		else if(weeklyIncome >= 1500.0 && weeklyIncome < 2500.0 ) {
			 weeklyIncome = weeklyIncome*0.2;
			
		}
		else {
			 weeklyIncome = weeklyIncome*0.3;
			
		}
		// Rounding and setting decimals /output
		weeklyIncome = Math.round(weeklyIncome* 100.0)/100.0;
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.println("Weekly tax withholding: $"+format.format(weeklyIncome));
	
	
		return;
	}

}

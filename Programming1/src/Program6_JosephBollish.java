import java.util.Scanner;

/************************
 * Programming 1
 * WINTER17-C-8-CSC320-1
 * Joseph Bollish
 * Module 6
 * option 2
 * 03/04/2018
 ************************/

public class Program6_JosephBollish {
	

	public static void main(String[] args) {
		  Scanner scnr = new Scanner(System.in);
	      final int NUM_ELEMENTS = 7;                       
	      String [] daysWeek = new String[NUM_ELEMENTS];
	      int [] numWeek = new int[NUM_ELEMENTS];
	      int [] numTemp = new int[NUM_ELEMENTS];
	      int i = 0;
	      int theDay = 0;
	      int totalTemp = 0;
	   
	      // Array for the days of the week
	      daysWeek[i] ="Monday"; i++;
	      daysWeek[i] ="Tuesday"; i++;
	      daysWeek[i] ="Wednesday"; i++;
	      daysWeek[i] ="Thurday"; i++;
	      daysWeek[i] ="Friday"; i++;
	      daysWeek[i] ="Saturday"; i++;
	      daysWeek[i] ="Sunday"; i++;
	      
	      // for loop for entering the days of the weeks from the user
	      System.out.println("Enter the number for the day of the week (Monday is 1, Tuesday is 2,...): ");
	      for(i =0; i < NUM_ELEMENTS; i++){
	          
	          System.out.println("Day number: ");  
	          theDay = scnr.nextInt();
	            numWeek[i] = theDay-1; 
	            if( theDay > 7 || theDay < 1) {		// checking for a valid day
	            	System.out.println("Not a valid day. Please try again. ");
	            	i--;
	            }
	      }
	      
	      // for loop checking for repeating days
	      for(i =0; i < NUM_ELEMENTS; i++){
	    	  for(int j =i+1; j< NUM_ELEMENTS; j++){
	    		  if( (numWeek[i] == numWeek[j])&& (i!=j) )
	    		  {
	    			  System.out.print("Repeating days: EXIT");
	    			  System.exit(0);
	              }	                
	          }
	      }
	      
	      // entering the temperature for each day
	      System.out.println("Now please enter the Average temperature for each day of the week.");
	      System.out.println("");
	      
	      for(i =0; i < NUM_ELEMENTS; i++) {
	    	  System.out.println("Enter the average temperature for " + daysWeek[numWeek[i]]);
	    	  numTemp[i] = scnr.nextInt();
	      }
	      for(i =0; i < NUM_ELEMENTS; i++) {	// calculate the total temperature
	    	  totalTemp = totalTemp + numTemp[i];
	      }
	      for(i =0; i < NUM_ELEMENTS; i++) {	// showing temperature entered for each day
	    	  {
	    		  System.out.println(daysWeek[numWeek[i]] +": " + numTemp[i] + " degrees.");
	    	  }
	    	 
	      }
	     
	      // output for weekly temperature 
	     System.out.println( "Average tempature for the week is " + Math.round((double)totalTemp/7) + " degrees");
	    
	      return;
	    }
	   }

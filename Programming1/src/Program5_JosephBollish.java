import java.util.Scanner;

/************************
 * Programming 1
 * WINTER17-C-8-CSC320-1
 *@author Joseph Bollish
 * Module 5
 * option 2
 * 03/11/2018
 ************************/


public class Program5_JosephBollish {
	
	public static String getTheWord() {			// Grab a string from the user.
		String theWord = "";
		Scanner scnr = new Scanner(System.in);	
		theWord = scnr.nextLine();
		return theWord;
	}
	
	/********************************************************************************/
	
	// Method to reverse the word.
	public static String reverseTheWord(String reverseWord) {
		String text = reverseWord;
		String newText ="";
		for(int i = 1; i <= text.length(); i++) 
			{
			newText = newText + text.charAt(text.length()-i);	
			}
		return newText;
		}
	
	/********************************************************************************/
	
	// Method output.
	public static void printTheWord(String printWord, String printWord2, String printWord3) {
		System.out.println(printWord +" "+ printWord2 + " "+ reverseTheWord(printWord3));
		return;
	}
	
	/********************************************************************************/
	
	public static void main(String[] args) {
		String firstWord = "";
		String secondWord = "";
		String thirdWord = "";
		
		System.out.println("Enter the first String:");		// Input statement for string.
		firstWord = getTheWord();	
	
		System.out.println("Enter the second String:");		// Second input statement for string.
		secondWord = getTheWord();
		
		System.out.println("Enter the third String:");		// Third input statement for string.
		thirdWord = getTheWord();
		printTheWord(firstWord,secondWord,thirdWord);
	}

}

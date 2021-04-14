/**
 * Corey HArold
 * 2/19/2021
 * cmsy -166
 * Lab 2
 */
package java_1;
import java.util.*;
import java.text.*;
public class Lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declares all vairables
		int userInput = 0;
		double matArea = 0;
		int runFactor = 0;
		char letterResponse ='Y';
		int userQuant = 0;
		double totalCost = 0;
		//formatter for 2 spots down from the decimial
		DecimalFormat decimal = new DecimalFormat("#.##"); 
		
		//welcome print
		System.out.println("Welcome to Tables R Us - Your One Stop Table Shop");
		System.out.println("Corey Harold - Master Table Builder \n");

		
		// wherever this is used, it breaks the outer do while loop
		
		final int SENTINEL = -1; 
		while (runFactor != SENTINEL) {
			
			System.out.println(" What shape of table would you like to build?"
					+ "\n 1. Rectangular"
					+ "\n 2. Square"
					+ "\n 3. Circular"
					+ "\n 4. End Program \n");
			userInput = input.nextInt(); 
			//invalid entry detector
			while (userInput != 1 && userInput != 2 && userInput != 3 
					&& userInput != 4) { 
				System.out.println("That was an invalid entry. Try again.");
				System.out.println(" What shape of table would you like to build?"
						+ "\n 1. Rectangular"
						+ "\n 2. Square"
						+ "\n 3. Circular"
						+ "\n 4. End Program \n");
				userInput = input.nextInt();
			} 
			
			if (userInput == 1 || userInput == 2 || userInput == 3) {
				System.out.println("How many?: ");
				userQuant = input.nextInt(); 
				
				while (userInput < 1) { 
					System.out.println("That was an invalid entry. Try again.");
					System.out.println("How many?: ");
					userQuant = input.nextInt();
				}
			
			}
			
			// now that user has chosen a valid table type, time to move to specs
			
			if (userInput == 1 || userInput == 2 || userInput == 3) {
			
				{ // start gaining dimension information
				
						double userInputLength = 0;
						double userInputWidth = 0;
						double userInputDiameter = 0;
					//if statment for number 1 choice
					if (userInput == 1) {
						System.out.println("You have chosen to build"
								+ " a rectangular table.");
							
						System.out.println("Enter the length of"
								+ " the table in inches:");
						userInputLength = input.nextDouble();
						//invalid entry prompt
						while (userInputLength <= 0) {
							System.out.println("You have entered an invalid length."
									+ " Please try again.");
							System.out.println("Enter the length of the "
									+ "table in inches:");
							userInputLength = input.nextDouble();
						}
							
						System.out.println("Enter the width"
								+ " of the table in inches:");
						userInputWidth = input.nextDouble();
						while (userInputWidth <= 0) {
							System.out.println("You have entered an "
									+ "invalid width. Please try again.");
							System.out.println("Enter the width of the "
									+ "table in inches:");
							userInputWidth = input.nextDouble();
						}
							
						matArea = (userInputWidth * userInputLength);
							
					}
					//prompt for #2 entry
					if (userInput == 2) {
						System.out.println("You have chosen to build"
								+ " a square table.");
						System.out.println("Enter the length of the"
								+ " table in inches:");
						userInputLength = input.nextDouble();
						while (userInputLength <= 0) {
							System.out.println("You have entered an"
									+ " invalid length. Please try again.");
							System.out.println("Enter the length of"
									+ " the table in inches:");
							userInputLength = input.nextDouble();
						}
						
						matArea = (userInputLength * userInputLength);
						
					}
					//prompt for circular entry
					if (userInput == 3) {
						System.out.println("You have chosen to"
								+ " build a circular table.");
						System.out.println("Enter the diameter of"
								+ " the table in inches:");
						userInputDiameter = input.nextInt();
						while (userInputDiameter <= 0) {
							System.out.println("You have entered an invalid"
									+ " diameter. Please try again.");
							System.out.println("Enter the diameter of"
									+ " the table in inches:");
							userInputDiameter = input.nextInt();
						}
						
						double radius = (userInputDiameter / 2);
						
						matArea = (Math.PI * radius * radius);
						
					}
					
				} // end gaining dimension information
				
				
				
				{ // setting the monatary value of supplies
					
					final double COST_OF_OAK = 0.25;
					final double COST_OF_LAMINATE = 0.125 ; 
					double cost = 0;
					//prompt for supplies
					System.out.println("what material would you"
							+ " like to use?"
							+ "\n 1. Oak"
							+ "\n 2. Laminate");
					System.out.println("Enter menu entry: ");
					userInput = input.nextInt();
					//wrong number sequence
					while (userInput != 1 && userInput != 2) { 
						System.out.println("That was an invalid"
								+ " entry. Try again.");
						System.out.println("what material would"
								+ " you like to use?"
								+ "\n 1. Oak"
								+ "\n 2. Laminate");
						System.out.println("Enter menu entry: ");
						userInput = input.nextInt();
					} 
					//ending prompt and formatting 
					//displays all calculations and requirements
					if (userInput == 1) {
						cost = (COST_OF_OAK * matArea);
			
						System.out.println("~~~~~~~~~~~~~ Estimate of"
								+ " Your Current Build ~~~~~~~~~~~~~");
						System.out.println("Calculated Area: "
								+ decimal.format(matArea) + " Square Inches");
						System.out.println("Type of Material: Oak");
						System.out.println("Cost of Table: $"
						+ decimal.format(cost));
						totalCost = (userQuant * cost);
						System.out.println("Cost to build " + userQuant + " tables: $" + decimal.format(totalCost));
					}
					//ending prompt and formatting 
					//displays all calculations and requirements
					if (userInput == 2) { 
						cost = (COST_OF_LAMINATE * matArea);	
						
						System.out.println("~~~~~~~~~~~~~ Estimate of Your"
								+ " Current Build ~~~~~~~~~~~~~");
						System.out.println("Calculated Area: "
								+ decimal.format(matArea) + " Square Inches");
						System.out.println("Type of Material: Laminate");
						System.out.println("Cost of Table: $" 
						+ decimal.format(cost));
						totalCost = (userQuant * cost);
						System.out.println("Cost to build " + userQuant + " tables: $" + decimal.format(totalCost));
					}
				
				}
				System.out.println("---------------------");
				System.out.println("Would you like to build another table?");
				System.out.println("Enter Y or y for yes, or"
						+ " N or n for no...");
				//get a letter from user
				letterResponse = input.next().charAt(0); 
		        letterResponse = Character.toUpperCase(letterResponse); 
		        //yes and no functions for ending the program
		        while (letterResponse != 'Y' && letterResponse != 'N') {
		        	System.out.println("You have entered an invalid entry.");
		        	System.out.println("Would you like to"
		        			+ " build another table?");
					System.out.println("Enter Y or y for yes,"
							+ " or N or n for no...");
					//this if so lower and upper case can be accepted
					letterResponse = input.next().charAt(0); 
			        letterResponse = Character.toUpperCase(letterResponse); 
		        }
		        //displays a message when the loop starts again
		        if (letterResponse == 'Y') {
					runFactor = 0;
					System.out.println("Awesome!");
				}
				//displays message and breaks the loop
		        else if (letterResponse == 'N') {
					runFactor = SENTINEL;
				}
			}
			//cuts off the program when user enters 4
			if (userInput == 4) {
				runFactor = SENTINEL;
			}
			
		} 
		//statment for ending the program
		System.out.println("You have chosen to terminate the program."
				+ " Thank you for choosing Tables R Us!");
		input.close();
	}	
}	


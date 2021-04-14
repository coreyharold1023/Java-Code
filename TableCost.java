/**
 * Corey Harold
 * 3/12/2021
 * CMSY-166
 * Code for a table building project 
 */
package java_1;
//import Scanner class form the util library

import java.util.Scanner;

//class named TableCost
public class TableCost {
	//   statically declared objects
	  
static Scanner s = new Scanner(System.in);
static double cost = 0;
static int count = 0;
	  
	//   main method
	  
public static void main(String[] args) {
	      
//	       using methods
	      
 displayWelcome();
	      
displayMenu();
	      
mainmenu();
	      

	   }
	  
	//   main menu method
	  
public static void mainmenu() {
	      
//	       using switch take entry
	      
	System.out.print("\nEnter menu Entry : ");
	      
		int choice = s.nextInt();
	      
double area = 0;
double tablecost = 0;
	      
switch(choice) {
	      
//	       for rectangle
	      
case 1 :
	          
 {System.out.println();
	              
 			System.out.print("Enter the length of Table (in inches) : ");
	          
			double length = s.nextDouble();
	          
		while(length < 0 ) {
            //error for wrong input           
	System.out.print(" Error : Length should be geater than 0 "
			+ ": Please Re enter again : ");
	                  
 length = s.nextDouble();
	                  
	               }
	          
	          
System.out.print("Enter the width of Table (in inches) : ");
	          
	     double width = s.nextDouble();
	          
	      while(width < 0 ) {
              //error for wrong input         
	        System.out.print(" Error : width should be geater than 0"
	        		+ " : Please Re enter again : ");
	                  
	           width = s.nextDouble();
	                  
	          }
	          
	      area = Area(length, width);
	          
	  count++;
	          
 break;
	       }
	          
//	           for Circular
	          
	       case 2 :
	          
	       { System.out.println();
	          
	           System.out.print("Enter the Diameter of Table (in inches) : ");
	          
	           double dia = s.nextDouble();
	          
	while(dia < 0 ) {
	              
	   System.out.print(" Error : Diameter should be geater than 0 : Please Re enter again : ");
	              
	               dia = s.nextDouble();
	              
	           }
	          
	           area = Area(dia);
	             
	           count++;
	             
	           break;
	       }
	          

//	       for Trapezoid
	             
	       case 3 :
	          
	{
	   System.out.println();
	  
	   System.out.print("Enter the short base of Table (in inches) : ");
	          
	           double short_ = s.nextDouble();
	          
	           while(short_ < 0 ) {
	              //error for wrong input
	               System.out.print("Error : Shortbase should be geater than 0 : Please Re enter again : ");
	              
	               short_ = s.nextDouble();
	              
	           }
	          
	System.out.print("Enter the long base of Table (in inches) : ");
	          
	           double long_ = s.nextDouble();
	          
	while(long_ < 0 ) {
        //error for wrong input  
	   System.out.print(" Error : Long base should be geater than 0 : Please Re enter again : ");
	              
	               long_ = s.nextDouble();
	              
	           }
	                    
	       System.out.print("Enter the height of Table (in inches) : ");
	              
	               double height = s.nextDouble();
	              //makes it so the user has to input a value greater than zero
	               while(height < 0 ) {
	                      
	                   System.out.print("Error : Height should be geater than 0 : Please Re enter again : ");
	                      
	                       height = s.nextDouble();
	                      
	                   }
	              
	          
	           area = Area(short_, long_, height);
	             
	           count++;
	             
	           break;
	             
	}
	             
	// for ending program
	             
	   case 4 :
	          
	           {
	               double dis = discount(cost);
	          
	           System.out.println("The total cost"
	           		+ " of table "+count+" you estimated is : $"+cost);
	          
	           if(dis > 0 ) {
	              
	               System.out.println("The Discount price is : $"+dis);
	              
	               System.out.println("Your Final Total is : $"+(cost- dis));
	              
	              
	           }
	          
	           displayend();
	          
	           return;
	           }
	          
//	           default
	          
	       default :
	              
	           {displayerror();
	          
	           mainmenu();
	           }
	          
	       }
	      
//	       calculated and print
	      
	       displayTabletype();

	       System.out.print("\nEnter menu Entry : ");

	       int tablechoice = s.nextInt();

	       while(tablechoice < 0 || tablechoice >2) {
	          
	           displayerror();
	          
	           System.out.print("\nEnter menu Entry : ");
	             
	           tablechoice = s.nextInt();
	          
	       }

	       tablecost = calculateCost(area,tablechoice);

	       cost += tablecost;

	       displayOutput(area,tablecost,tablechoice);
	      
	       displayMenu();
	      
	       mainmenu();
	      
	      
	   }
	  
	//   method for displayWelcome
	  
	   public static void displayWelcome() {
	      
	       System.out.println("\nWelcome to Tables are Us :"
	       		+ " Your one Stop Table Shop ");
	       System.out.println("Corey Harold - Master Table Builder");
	      
	   }
	  
	  
	   public static void displayMenu() {
	      
	       System.out.println();
	       System.out.println("What Shape of table do you wish to build?");
	       System.out.println("\t1. Rectangular");
	       System.out.println("\t2. Circular");
	       System.out.println("\t3. Trapeziod");
	       System.out.println("\t4. End the Program.");
	      
	      
	   }
	  
	//   methods for calculated areas
	  
	   public static double Area(double length, double width) {
	      
	       return (length*width);
	      
	   }
	  
	public static double Area(double diameter) {
	  
	   double radius = diameter/2;
	      
	       return (3.14 * radius * radius);
	      
	   }
	  
	public static double Area(double short_, double longe, double height) {
	      
	       return ((short_ + longe)/2) * height;
	      
	   }

	//   methods for display table types

	public static void displayTabletype() {
	     //prompts for the 
	   System.out.println("\nWhat type of material you want to use ? ");
	   System.out.println("\t1.Laminate ($0.125 per square inch");
	   System.out.println("\t2.Oak ($0.25 per square inch");
	     
	}

	// method that display error
	  
	   public static void displayerror() {
	      
	       System.out.println("\nError - Invalid Entry. Please Enter"
	       		+ " a Valid menu option. ");
	      
	   }
	  
	// method that calculates the  cost
	  
	   public static double calculateCost(double area, int type) {
	      
	       if(type == 1) {
	          //mutplies area times .125
	           return area *0.125;
	          
	       }
	      
	       else if(type == 2) {
		          //mutplies area times .125
	           return area*0.25;
	       }
	      
	       else {
	          
	           return 0;
	          
	       }
	      
	   }
	  
	  
	//   displayOutput method
	  
	   public static void displayOutput(double area,double cost, int type) {
	      
	    System.out.println("\nOutput Report : ");
	      
	    System.out.println("The Area of the table is "+area+" square inches.");
	      
	       if(type == 1) {
	          
	           System.out.println("The table is made of Laminate.");
	          
	       }
	      
	       else {
	          
	           System.out.println("The table is made of Oak.");
	       }
	      
	       System.out.println("The cost of table is $"+cost);
	      
	   }
	  
	//   this calculates the discounted prices
	  
	   public static double discount(double cost) {
	      
	       double discount= 0 ;
	      
	       if(cost > 3000) {
	          
	           discount = (cost * 10) /100;
	          
	       }
	      
	       else if(cost > 1000) {
	          
	           discount = (cost * 5) /100;
	          
	       }
	      
	       return discount;
	      
	   }
	  
	//  this is for the ending message for choseing to quit the program
	  
	   public static void displayend() {
	      
	       System.out.println("\nThank you for using the table cost"
	       		+ "Estimation program!");
	       System.out.println("Good Bye!!");
	      
	   }
	  
	  
	}


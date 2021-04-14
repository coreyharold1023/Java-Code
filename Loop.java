/**
 * Author- Corey Harold
 * 2/16/2021
 * CE_Loops
 * Cmsy java1-166
 */
package java_1;
import java.util.Scanner;
public class Loop {
	public static void main (String[] args) {
		//declaring a variable
       int var1;
       int var2;
       double vard1;
       double vard2;
       int decision = 0;
       Scanner input = new Scanner(System.in);
       
       char letterResponse;
       //the do loop runs the code from CE DECISION
       do {
      
    	   System.out.print("Input integer value 1:");
           
           var1 = input.nextInt();
   //asks for value
           System.out.print("Input integer value 2:");
           
           var2 = input.nextInt();
   //asks for value
           System.out.print("Input double value 1:");
           
           vard1 = input.nextDouble();
   //asks for value
           System.out.print("Input double value 2:");
           
           vard2 = input.nextDouble();



           //addition being inported
System.out.println("\n\nInteger output:");
           
           int addition = var1 + var2;
           
 System.out.printf ("Adding %d and %d =  %d %n", var1, var2, addition);


           
           int subtraction = var1 - var2;
           
   // if num 1 is bigger than var2 it flips it 
           //so there will not be a negitive answer
           if(var1 > var2) {
           	
 System.out.printf("Subtracting %d and %d = %d %n", var2, var1, subtraction);
           }
           if(var1 < var2) {
System.out.printf("Subtracting %d and %d = %d %n", var1, var2, subtraction);
               
               }    else if (var2  == var1) {
               	
                 System.out.printf("Subtracting ", var1);
                 
                 System.out.printf("from itself = 0 %n");
                 
                   }
           int multiply = var1 * var2;
           
           if (var1 != var2)
           	
    System.out.printf("Multiplying %d and %d = %d %n", var1, var2, multiply);

          if (var1 == var2) {
          }
   System.out.printf("Squaring %d and %d = %d %n", var1, var2, multiply);
              
   //error in if there is a 0 it will give a prompt
          if (var2 != 0) {
              int moding = var1 % var2;
              
     System.out.printf("Moding %d and %d = %d %n", var1, var2, moding);
              
              int divde = var1/var2;
              
     System.out.printf("Dividing %d and %d = %d %n", var1, var2, divde);
              
                  } else {
               	   
               	   System.out.printf("Error: You cannot divide or mod by 0");
                  }
              

           //adding space
           System.out.println(" ");
           
           System.out.println(" ");
           
          //values for addition 
           double addDouble = vard1 + vard2;
           
 System.out.printf ("Adding %.2f and %.2f =  %.2f %n", vard1, vard2, addDouble);
           

           double subtractdouble = vard1 - vard2;
    //if var 1 is bigger than var2 it flips them
           if(vard1 > vard2) {
           }
 System.out.printf("Subtracting %.2f and %.2f = %.2f %n", vard1, vard2, subtractdouble);
               
           if(vard1 > vard2) {
           	
 System.out.printf("Subtracting %.2f and %.2f = %.2f %n", vard1, vard2, subtractdouble);
               
               }    else if (vard2 == vard1) {
               	
                 System.out.printf("Subtracting ", vard1);
                 
                 System.out.printf("from itself = 0 %n");
           }

           double multiplydouble = vard1 * vard2;
           //if var1 does not equal var2 for mutplication
           if (var1 != vard2) {
 }System.out.printf("Multiplying %.2f and %.2f = %.2f %n", vard1, vard2, multiplydouble);
           
          if (vard1 == vard2) {
System.out.printf("Squaring %.2f and %.2f = %.2f %n", vard1, vard2, multiplydouble);
              
          }
          // if var2 does not equal 0 divide var by var2
          if (var2 != 0) {
       double divideDouble = vard1/vard2;
 System.out.printf("Dividing %.2f and %.2f = %.2f %n", vard1, vard2, divideDouble);
              
          } else {
       	   
               System.out.printf("You cannot divide by 0!!!");
               
               
          }
          
 int loopFactor = 1; //if this is not 1, the following do while loop will terminate   
        do {
 System.out.println("Would you like to re-run this program again? "
 		+ "Please enter Y or y for yes, and N or n for no."); //prompt user
	        letterResponse = input.next().charAt(0); //get a letter from user
	        letterResponse = Character.toUpperCase(letterResponse); 
	        //capitalize to compare to capital Y or N
	          
	          
	        	
	          if (letterResponse == 'Y') {
	        	 loopFactor = 0; 
	 // yes means to get out of the do while and start repetition of the code
	        	 decision = 0; // decision stays 0 to loop the main do while
	          }
	          
	          else if (letterResponse == 'N') {
	        	  loopFactor = 0; 
	        	  decision = 1; // decision switches to one to break the outer
	        	  //do while loop to terminate the running of the program
 System.out.println("Program has been terminated.");
 // informs user of program termination
	          }
	          
	          else if (letterResponse != 'Y' || letterResponse != 'Y') {
	        	  loopFactor = 1; //loop factor stays at 1 to repeat this
	        	  //current do while loop as the user entered incorrect 
	        	  //entry and needs a correct entry
	        	  System.out.println("Invalid entry. Please enter Y or y for"
	        	  		+ " yes, and N or n for no."); 
	        	  // prompts user of their mistake
	          }
          
       } while (loopFactor == 1); // if this changes from the inner do
          //while loop, a selection for repition or termination has been
//made and the inner do while loop is not needed anymore,
        //unless the user comes to the end of a second
          //repetition of the main program code segment
          
       } while (decision == 0); // if this changes from the inner do while loop,
       //the whole repetition segment terminates and the program is over
    input.close();
	}

       
}
	
	
               
               
         
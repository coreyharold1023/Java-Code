/**
 * Corey Harold
 * 3/11/2021
 * CMSY-166
 * creating a redimentary calculator
 */
package java_1;
import java.util.*;
public class ReturnAndOverload {
Scanner input = new Scanner(System.in);

//the method of addition
public static int add(int Intiger1,int Intiger2){
	//stores value when program calls for it and lets 
	//program exit the method body

  return Intiger1 + Intiger2;
}
//the method for subtraction
public static int subtract(int Intiger1,int Intiger2){
//stores value when program calls for it and lets program exit the method body
  return Intiger1 - Intiger2;
}
//the method for subtraction
public static int multiply(int Intiger1,int Intiger2){

  return Intiger1 * Intiger2;
   //stores value when program calls for it and lets program 
  //exit the method body

}
//method for division
public static int divide(int Intiger1,int Intiger2){

     if(Intiger2==0){

          return 0;

     }

   return Intiger1 / Intiger2;
  //stores value when program calls for it and
   //lets program exit the method body

}
//inserts new method
public static int mod(int Intiger1,int Intiger2){

     if(Intiger2==0){
          return 0;
     }
     return Intiger1 % Intiger2;
}
//inserts new method
public static double add(double Intiger1,double Intiger2){
     return Intiger1 + Intiger2;
}
//inserts new method
public static double subtract(double Intiger1,double Intiger2){
     return Intiger1 - Intiger2;
}
//inserts new method
public static double multiply(double Intiger1,double Intiger2){

     return Intiger1 * Intiger2;
}
//inserts new method
public static double divide(double Intiger1,double Intiger2){

     if(Intiger2==0){

          return 0;
     }
     return Intiger1 / Intiger2;
}
//inserts new method
public static void display(double double1,double double2,
		double double3,double double4){
//prints outputs
   System.out.println("\nAnswers");

   System.out.format("\tAddition: %.2f ",double1);

   System.out.format("\n\tSubtraction: %.2f",double2);

   System.out.format("\n\tMultiplication: %.2f ",double3);

   System.out.format("\n\tDivision: %.2f ",double4);

   System.out.println();

}


//inserts new method
public static void display(int integer,int integer2,int integer3,
		int integer4,int integer5){
//prints outputs
     System.out.println("\nAnswers");

     System.out.println("\tAddition: "+integer);

     System.out.println("\tSubtraction: "+integer2);

     System.out.println("\tMultiplication: "+integer3);

     System.out.println("\tDivision: "+integer4);

     System.out.println("\tModulus: "+integer5);

}


public static boolean end(){

     Scanner sc = new Scanner(System.in); 

     String response;

     while(true){
//asks for selection
System.out.print("do you want to exit this program?"
		+ " (Y/y/N/n): ");
//if respose y and Y then exit the program
         response = sc.nextLine();

         if(response.equalsIgnoreCase("Y")){

              goodbye();

              return false;

         }else if(response.equalsIgnoreCase("N")){
           return true;
          }

          System.out.print("Error - please try again. \n");

       }

}

//inserts new method
public static void goodbye(){

     System.out.println("\nThank you for using"
     		+ " the program. Goodbye!");

}

//inserts new method
public static void main(String[] args) {


   Scanner sc = new Scanner(System.in);

//vairable list
   int int1,int2;

   double dub1,dub2;

   int selection;

   boolean flag = true;

while(flag){


//prompt
System.out.println("Menu options");
 System.out.println("\t1 - Integer Math\n\t2 -"
 		+ "Double Math\n\t3 - Exit Program");


  System.out.print("please sclect 1, 2, or 3: ");

selection = sc.nextInt();

//conditional if user enters a wrong input
while(selection<1 || selection>3){


System.out.print("invalid entry,try again! : ");

selection = sc.nextInt();

     }


  switch (selection) {

       case 1:

//propmts user for input
          System.out.print("\nPlease enter the first integer number: ");

          int1 = sc.nextInt();
//propmts user for input
          System.out.print("\nPlease enter the second integer number: ");

          int2 = sc.nextInt();
        //calls add method
          int iv1 = add(int1,int2);  
        //calls subtraction method
          int iv2 = subtract(int1,int2); 
        //calls multiply method
          int iv3 = multiply(int1,int2); 
       // calls divide method
          int iv4 = divide(int1,int2);  
       // calls mod method
          int iv5 = mod(int1,int2); 
       // calls display method
           display(iv1,iv2,iv3,iv4,iv5);// called display() method

           flag = end();// called end() method for exit the program

              break;

          case 2:
//ask user to enter in any two double numbers.

      System.out.print("\nPlease enter the first double number: ");

      dub1 = sc.nextDouble();

      System.out.print("\nPlease enter the second double number: ");

      dub2 = sc.nextDouble();
   // calling method
      double doubble1 = add(dub1,dub2);
   // calling method      
      double doubble2 = subtract(dub1,dub2);
   // calling method
      double doubble3 = multiply(dub1,dub2);
   // calling method
      double doubble4 = divide(dub1,dub2);

       display(doubble1,doubble2,doubble3,doubble4);// called display() method
//ends program
       flag = end();

    break;
  // calling method end
 case 3:flag = end();
   break;

    default:
  // prints out an error message
      System.out.print("Error!!");
 break;

     }

   }

}

}
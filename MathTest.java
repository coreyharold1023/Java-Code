package java_1;
import java.util.Scanner;
public class MathTest {
	public static void main(String[] args) {
//declaring a variable
		int var1;
//declaring a variable
		int var2;
//declaring a double		
		double varb1;
		//declaring a double		
		double varb2;
// inputing a scanner		
		Scanner input = new Scanner(System.in);
//prompts the user for a value
		System.out.println("Input integer value 1");
//Input for the user
		var1 = input.nextInt();
//prompt for the user
		System.out.println("Input integer value 2");
//Input for the user
		var2 = input.nextInt();

//asking for a double
		System.out.println("Input double value 1");
//input for double
		varb1 = input.nextDouble();
//asking for a double
		System.out.println("Input double value 2");
//input for double
		varb2 = input.nextDouble();

		System.out.println("Integer output: ");
		System.out.println("  ");
		
//these are variables for the different equations
//addition
		int varadd = var1 + var2;
//subtraction
		int varsub = var1 - var2;
//multiply 
		int varmult = var1 * var2;
//divide
		int vardivide = var1/var2;
//modulus division		
		int varmod = var1 % var2;

//double add
		double varbadd = varb1 + varb2;
//double subtract
		double varbsub = varb1 - varb2;
//double multiply
		double varbmult = varb1 * varb2;
//double divide
		double varbdivide = varb1/varb2;
		
		System.out.println("Integer output: ");
//Prints out the answers using printf for var1 and var2
		System.out.printf ( "Adding   %d   and  %d   =  %d %n", var1, var2, varadd);
		System.out.printf ("Subtracting   %d   and   %d = %d %n",var1, var2, varsub);
		System.out.printf ("Multiplying   %d  and %d = %d  %n ",var1, var2, varmult);
		System.out.printf ("Dividing  %d   and   %d  = %d %n", var1, var2,  vardivide);
		System.out.printf("Moding %d and %d = %d %n", var1, var2,varmod);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
//prints out the answers using printf for the double
		System.out.printf ("Double output: ");
		System.out.printf ("Adding   %f   and   %f = %.1f %n ",varb1, varb2,  varbadd);
		System.out.printf ("Subtracting   %f   and   %f = %.1f %n ",varb1, varb2,  varbsub);
		System.out.printf ("Multiplying   %f  and   %f  = %.1f %n",varb1, varb2,    varbmult);
		System.out.printf ("Dividing   %f   and   %f  = %.1f %n",varb1, varb2,  varbdivide);		
		
		input.close();
}
}
package java_1;
import java.io.*;
import java.util.Scanner;
public class quadraticFormulaSolver {
	public static void main(String[] Strings)   
	{ 
		
	int a;
	int b;
	int c;
	double resultFirst = 0;
	double resultSecond = 0;
	Scanner input = new Scanner(System.in);  
	System.out.println("Enter the value for a: ");
	a = input.nextInt();
	System.out.println("Enter the value for b: ");
	b = input.nextInt();
	System.out.println("Enter the value for c: ");
	c = input.nextInt();
	
	double discriminant = ((b*b)-(4*a*c));
	
	if (discriminant > 0) {
		System.out.println("There are two zeroes to this quadratic function.");
		resultFirst = ((b*(-1)) + (Math.sqrt((b*b)-(4*a*c))))/(2*a);
		resultSecond = ((b*(-1)) - (Math.sqrt((b*b)-(4*a*c))))/(2*a);
		System.out.println(resultFirst + " and " + resultSecond);
	}
	
	if (discriminant == 0) {
		System.out.println("There is one zero to this quadratic function.");
		resultFirst = ((b*(-1)) + (Math.sqrt((b*b)-(4*a*c))))/(2*a);
		System.out.println(resultFirst);
	}
	
	if (discriminant < 0) {
		System.out.println("There are no real solutions to this quadratic function.");
	}
		
	
	}	
}
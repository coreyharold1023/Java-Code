package java_1;
// setting the class
public class Output {
	
    public static void main (String[] args) {
 //prints, the string using the /n 
System.out.println("This is my first program\nThis prints two lines\nusing an escape sequence.");
// this makes the text indented
System.out.println("\tThis string tests the tab sequence");
//this is used with formatting and it allows the characters \ and " to be displayed in a string
System.out.println("this string prints a \\ and a \" character");
//using the print f command
System.out.printf("this is a test of the printf output");
//prints the outputs into different sections
System.out.printf("%s%s%n", "this prints the integer value", " 10");
//prints the value to a different section
System.out.printf("%s%n%s", "This prints a floating point value", "3.14");

    }
}
/**
 * Corey Harold
 * 3/23/2021
 * CMSY-166
 * This program makes an array list of hall of fame soccer players
 */
package java_1;
//inports the arraylist class
import java.util.ArrayList;
import java.util.*;

public class arrayList {

//object of arraylist to store the players name
static ArrayList<String> names = new ArrayList();

public static void main(String[] args) {
	//stores input for the number of names
Scanner sc = new Scanner(System.in);
System.out.println("Master Hall of Fame Recorder: Corey Harold");

//prompts the user for amount of names
System.out.println("enter the amount of names that you want to list");
//stores the number entered
int selection = sc.nextInt();
//
for (int i = 1; i <= selection; i++) {
//prints a prompt for where the name of the player is entered	
System.out.println("Hall of fame member #" + i);
//stores value
sc = new Scanner(System.in);

String name = sc.next();
//adds names
names.add(name);

}
//keep track of grand total of the names
System.out.println("Size of the ArrayList:" + names.size());
//print all the names
//range based for loop that will print all of the names back out on the screen
for (int i = 0; i < names.size(); i++) {
	
System.out.println((i + 1) + ". " + names.get(i));
}
//adds a name hamm
names.add("Hamm");

System.out.println("There are " + names.size() + " hall of fame"
		
		+ " players recorded");
//remove last name from the list
names.remove("Rooney");
System.out.println("There are now " + names.size() + " hall of"
		
		+ " fame players recorded");
//clear all the names
names.clear();
//tells you the status of the arraylist
System.out.println("After clearing all data"
		+ ", there are " + names.size() + " hall of fame"
				+ " players recorded");
//closing prompt
System.out.println("Thanks for your opinion of hal"
		+ "l of fame worthy soccer players.");
//adding a close
}}
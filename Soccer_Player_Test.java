/**
 * Corey Harold
 * 4/11/2021
 * CMSY-166
 * Making a test program for Soccer Player program with arrays and loops
 */
package java_1;
import java.util.*;
public class Soccer_Player_Test {
	
	public static void main(String[] args) {	
		//imports the new scanner
		Scanner input = new Scanner(System.in);	
	//creats the array	
	SoccerPlayer array[] = new SoccerPlayer[3];
		//conditional for the player amount
		for (int PlayerInfo = 0; PlayerInfo < 3; PlayerInfo++) {
			//all of the inputs and storing options 
	System.out.println ("Enter the first"
			+ " name of player"  + (PlayerInfo + 1) + ":");	
	String FirstName = input.next();
	
	System.out.println ("Enter the last "
			+ "name of player" + (PlayerInfo + 1) + ":");
	String LastName = input.next();
	
	System.out.println ("Enter the number"
			+ " of games played for player"  + (PlayerInfo + 1) + ":");
	int numGames = input.nextInt();
// a while statment for games input so a user 
	//does not enter a number less that zero
	while (numGames <= 0) {
		//prompt
		System.out.println("number has to"
				+ " be greater than zero");
		System.out.println ("Enter the number of games played"
				+ " for player"  + (PlayerInfo + 1) + ":");
		numGames = input.nextInt();		
		}
	System.out.println("enter the number of goal"
			+ "s for player" + (PlayerInfo + 1) + ":");
	int numGoals = input.nextInt();
	// a while statment for games input so a
	//user does not enter a number less that zero	
	while (numGoals <= 0) {
		//prompt
		System.out.println("number has to be greater than zero");
		System.out.println ("Enter the number of goals"
				+ " played for player"  + (PlayerInfo + 1) + ":");
		numGoals = input.nextInt();	
		}	
SoccerPlayer num = new SoccerPlayer(FirstName, LastName, numGames, numGoals);
        array[PlayerInfo] = num;
        
		}
		for(int PlayerInfo = 0; PlayerInfo < array.length; PlayerInfo++) {
		SoccerPlayer num = array[PlayerInfo];
// displays the names and stats out of the array	
	System.out.println(num.getFirstName()+ " " + num.getLastName() +" played"
				+ " " + num.getGames() + " games");
          System.out.println("They Scored " + num.getGoals() + ""
          		+ " goals for an average of "
          		+ "" + num.calcAvgGoals());
		}}}
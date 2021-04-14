/**
 * Corey Harold
 * 3/29/2021
 * CMSY-166
 * CE-Soccer 
 */
package java_1;

public class SoccerPlayer {

    private String FirstName;
    //get
    public String getFirstName() {    	
    	return FirstName;
    }
    //set
    public void setFirstName(String name) {
    	FirstName = name;
    }
    private String LastName;
    //get
    public String getLastName() {
    	return LastName;
    }
    //set
    public void setLastName(String LName) {
    	LastName =LName;
    }
    public int numGames = 0; 
    //get
    public int getGames() {
    	return numGames;
    }
    //set
    public int setGames(int Games) {
    	return numGames;
    }
    
    public int numGoals = 0;
    public int getGoals() {
    	return numGoals;
    }
    //set
    public int setGoals(int Goals) {
    	return numGoals;
    }
    public SoccerPlayer() {
            FirstName="NONE"; 
            LastName="NONE";
            numGames=0;
            numGoals=0;
    }
    public SoccerPlayer(String Fname, String Lname, int games, int goals) {
    	FirstName= Fname ;
        LastName=Lname;
        numGames=games;
        numGoals=goals;
    }     
    //shows an error message
        public double calcAvgGoals () {
            double average;

            if (numGames == 0) {
                System.out.println("Error");
                   average = 0;
                   return average;
               }
//divides goals and games to get average
            else {
            average = (double)numGoals/numGames;
            return average;
	  
	 
   }

}
}
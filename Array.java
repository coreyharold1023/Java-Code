/**
 * Corey Harold
 * 3/17/2021
 * CMSY-166
 * Code for a table building project 
 */
package java_1;
	import java.util.*;
	public class Array {
	    //Declaring two static variables as shown
	    static final int days = 7;
	    static final double priceofPizza= 8.50;
	    //If the number is greater than zero returns true or else false
	    public static boolean GreaterThanZero(int num){
	        return num>0?true:false;
	    }
	    //Displays the Pizza Report by accepting array as parameter
	    public static void DisplayTitle(int[] arr){
	        System.out.println();
	        System.out.println("Pizza Calculator");
	        System.out.println("Sales Report");
	        System.out.println();
	    //day counter
	        for(int i=0;i<days;i++){
	            System.out.println("Day "+(i+1)+": "+arr[i]);
	        }
	        System.out.println();
	    }
	    //This function accepts the arr as parameter and return total
	    public static int total(int[] arr){
	        int sum=0;
	        for(int i=0;i<arr.length;i++) sum+=arr[i];
	        return sum;
	    }
	    //This function accepts array as parameter and return average
	    public static double average(int[] arr){
	    	//declairs sum
	        int sum=total(arr);
	        double average = (double)sum/arr.length;
	        return average;
	    }
	    
	    
	    public static void main(String args[]){
	        //Array declaration
	        int Pizza[] = new int[days];
	        int totalPizzaSold=0;
	        double averagePizzaSold;
	        
	        //Scanner declaration
	        Scanner scan = new Scanner(System.in);
	        //Recieveing input from the user
	        System.out.println("Please enter the number"
	        		+ " of pizzas sold for");
	        for(int i=1;i<=days;i++){
	            System.out.print("Day "+i+": ");
	            //Take input into temp variable
	            int num = scan.nextInt();
	            //While a no smaller than 0 is entered keep taking the input 
	            //makes it so there is no negitive numbers in the input
	            while(!GreaterThanZero(num))
	            {
	                System.out.println("Invalid Value. "
	                		+ "Please enter valid value");
	                System.out.print("Day "+i+": ");
	                num=scan.nextInt();
	            }
	            //Assign the no to array
	            Pizza[i-1]=num;
	        }
	        //Display the details 
	        DisplayTitle(Pizza);
	        //calling the functions to find values of 
	        //pizza sold and pizza average
	        totalPizzaSold = total(Pizza);
	        averagePizzaSold= average(Pizza);
	        //Displaying results using print f
	        System.out.println("Total Pizzas Sold for the Week:"
	        		+ " "+totalPizzaSold);
	        System.out.printf("Average Pizza Sold for the week:"
	        		+ " %-5.2f\n\n",averagePizzaSold);

	        System.out.printf("Total Revenue for the week"
	        		+ ": $%-5.2f\n",totalPizzaSold*priceofPizza);
	        System.out.printf("Average Revenue per day:"
	        		+ " $%-5.2f\n\n",averagePizzaSold*priceofPizza);
	        System.out.println("Thank You for using Pizza Counter. Goodbye! ");

	        scan.close();
	    }


	}
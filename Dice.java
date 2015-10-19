
import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      Random randGen = new Random();
	      int i = 0;          // Loop counter iterates numRolls times
	      int numRolls = 0;   // User defined number of rolls
	      int numTwos = 0;
	      int numThrees = 0;
	      int numFours = 0;
	      int numFives = 0;
	      int numSixes = 0;
	      int numSevens = 0;
	      int numEights = 0;
	      int numNines = 0;
	      int numTens = 0;
	      int numElevens = 0;
	      int numTweleves = 0;
	      int numBW = 0; //Track number of # b/w 2 and 12
	      int die1 = 0;       // Dice values
	      int die2 = 0;       // Dice values
	      int rollTotal = 0;  // Sum of dice values
	      int [] anArray; //Declare the array
	      anArray = new int[13]; // Puts in memory for 13 intergers
	      anArray[0] = 2;
	      anArray[1] = 3;
	      anArray[2] = 4;
	      anArray[3] = 5;
	      anArray[4] = 6;
	      anArray[5] = 7;
	      anArray[6] = 8;
	      anArray[7] = 9;
	      anArray[8] = 10;
	      anArray[9] = 11;
	      anArray[10] = 12;
	      

	      System.out.println("Enter number of rolls: ");
	      numRolls = scnr.nextInt();
	      while (numRolls >=1){
	      if (numRolls >= 1) {
	         // Roll dice numRoll times
	         for (i = 0; i < numRolls; ++i) {
	            die1 = randGen.nextInt(6) + 1;
	            die2 = randGen.nextInt(6) + 1;
	            rollTotal = die1 + die2;

	           
	            }
	            if (rollTotal == 2) {
		               numTwos +=  1;
		            }
	            if (rollTotal == 3) {
		               numThrees +=  1;
		            }
	            if (rollTotal == 4) {
		               numFours +=  1;
		            }
	            if (rollTotal == 5) {
		               numFives +=  1;
		            }
	            if (rollTotal == 6) {
		               numSixes +=  1;
		            }
	            if (rollTotal == 7) {
		               numSevens +=  1;
		            }
	            if (rollTotal == 8) {
		               numEights +=  1;
		            }
	            if (rollTotal == 9) {
		               numSixes +=  1;
		            }
	            if (rollTotal == 10) {
		               numTens +=  1;
		            }
	            if (rollTotal == 11) {
		               numElevens +=  1;
		            }
	            if (rollTotal == 12) {
		               numTweleves +=  1;
		            }
	            if (rollTotal == anArray[1] || rollTotal == anArray[2] || rollTotal == anArray[3]|| rollTotal == anArray[4] || rollTotal == anArray[5] ||rollTotal == anArray[6] || rollTotal == anArray[7] || rollTotal == anArray[8] || rollTotal == anArray[9] || rollTotal == anArray[10] || rollTotal == anArray[11] || rollTotal == anArray[12]) {
		               numBW += + 1;
		            }
	            
	            System.out.println("Roll " + (i+1) + " is " + 
	                  rollTotal + " (" + die1 + 
	                  "+" + die2 + ")");
	      }
	            else {
	   	         System.out.println("Invalid rolls. Try again.");
	   	         return;
	         }

	         // Print statistics on dice rolls
	         System.out.println("\nDice roll statistics:");
	         System.out.println("6s: " + numSixes);
	         System.out.println("7s: " + numSevens);
	         System.out.println("B/W 1 and 12: " + numBW);
	         
	         
	         System.out.println("Dice roll Histrogram: ");
	         System.out.print("2s: ");
	         for (int a = 0; a <= numTwos; a++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("3s: ");
	         for (int b = 0; b <= numThrees; b++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         
	         System.out.print("4s: ");
	         for (int c = 0; c <= numFours; c++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("5s: ");
	         for (int d = 0; d <= numFives; d++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");

	         System.out.print("6s: ");
	         for (int e = 0; e <= numSixes; e++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("7s: ");
	         for (int f = 0; f <= numSevens; f++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("8s: ");
	         for (int g = 0; g <= numEights; g++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("9s: ");
	         for (int h = 0; h <= numNines; h++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("10s: ");
	         for (int z = 0; z <= numTens; z++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("11s: ");
	         for (int j = 0; j <= numElevens; j++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         System.out.print("12s: ");
	         for (int k = 0; k <= numTweleves; k++ ){
	        	 System.out.print("*");
	         }
	         System.out.println("");
	         
	         
	         System.out.println("Enter number of rolls: ");
		      numRolls = scnr.nextInt();
		      
	      } 
	   
	      }
	      }
	   
	



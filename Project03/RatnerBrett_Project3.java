/**
 * Brett Ratner 
 * CSC220-02
 * Project 3 
 */

/**This program reads a random word from a file created separately called words.txt.
 * The program then scrambles the word by swapping random letters a
 * 100 times. The scrambled word is displayed with character indexes on top.
 * Then the user is prompted to type in a 1,2 or 3.if user selects 1 to swap a pair of letters,
 *  2 to print the unscrambled word and quit, and 3 to simply quit. When the word is scrambled 
 *  correctly, the computer congratulates the user, repeats the unscrambled word, and the number
 *  of steps it took to solve. An error message appears if invalid indexes are input by the user 
 *  depending on the error the program will either quit or ask the user to do try again and type 
 *  in a valid input.
 */


import java.util.Scanner;
import java.io.*;

public class RatnerBrett_Project3 {

	public static void main(String[] args) throws IOException {
		
		Scanner fileScan = new Scanner(new File("words.txt")); /** reads the text file named words.txt */
		Scanner input = new Scanner(System.in);
		int randomnum = (int) (Math.random() * 10 + 1);
		
		String selectedWord = "";  /** string variable taken from the text file */
		int randomindex1; /** creates the first variable to randomize the word */
		int randomindex2; /** creates the second variable to randomize the word */
		char randomMixup; /** the variable to scramble the order or the letters */
		char swap;        /** the variable for the user to swap the letters around */
		char words[];     /** get one of the words from the character array */
		int firstNum;     /** this is the variable for the user to input the first index */
		int secondNum;    /** this is the variable for the user to input the first index */
		int counter = 0;  /** counts how many times you have tried*/
		
		
		/**picks a random word from the words.txt file */
		for (int i = 1; i <= randomnum; i++) {
			selectedWord = fileScan.next();
		}
		int wordlength = selectedWord.length();
		 words = selectedWord.toCharArray();
		 /**reorders the characters one at a time randomly and repeats it 100 times so that the word is scrambled */
		for (int j = 0; j < 100; j++) {
			randomindex1 = (int) (Math.random() * wordlength);
			randomindex2 = (int) (Math.random() * wordlength);
			randomMixup = words[randomindex1];
			words[randomindex1] = words[randomindex2];
			words[randomindex2] = randomMixup;
		}
		String scramboWord = String.valueOf(words);
		/** the while loops will run as long as the word is unscrambled and once the word matches the original word it
		 * will stop the while loop*/
		while (!selectedWord.equals(String.valueOf(words))) {
			for (int k = 0; k < wordlength; k++) {
				System.out.print(k); /** prints out the index values*/
			}
			/** asks the user to type in a 1, 2, or 3*/
			System.out.println("");
			System.out.println(String.valueOf(words));
			System.out.println("Enter 1 to swap a pair of letters");
			System.out.println("Enter 2 to show the solution and quit");
			System.out.println("Enter 3 to quit");
			int option = 0;
			/** takes in what number the user input and than depending on what the user typed will will run a certain if statement*/
			if (input.hasNextInt()) {
				option = input.nextInt(); 
				counter++;
			} else { /** if the user does not type in a number than the program will end */
				option = 3;
			}
			System.out.println("");
			/** if the number 1 was pressed it will than prompt the user to type in the two indices wich will be stored 
			 * in the firstNum variable and secondNum variable. As long as the user picks types in 1 they can keep 
			 * rearranging the letters by switching two letters at a time*/
			if (option == 1) {
				System.out.println("Enter the indices separated by spaces");
				firstNum = 0;
				secondNum = 0;
				if (input.hasNextInt()) {
					firstNum = input.nextInt();
				} else {
					/** if the user types in something that is not a number than it will end the program*/
					System.out.println("Use numbers only");
					break;
				}
				if (input.hasNextInt()) {
					secondNum = input.nextInt();
				} else {
					/** if the user types in something that is not a number than it will end the program*/
					System.out.println("Use numbers only");
					break;
				}
			/**will swap the two letters */	
				swap = words[firstNum];
				words[firstNum] = words[secondNum];
				words[secondNum] = swap;
				/** if the number 2 was entered than the program will tell the user what the correct answer is and exit the program*/
			} else if (option == 2) {
				System.out.println("The correct answer is: " + selectedWord);
				System.out.println("Thanks for playing the game");
				System.exit(0);
				/** if the number 3 was entered than the program will just exit*/
			} else if (option == 3){
				System.out.println("Thanks for playing the game");
				System.exit(0);
			} else{
				/** if the user entered in a number that is not a 1,2,or 3 it will prompt them again to type in a 1,2, or 3 */
				System.out.println("Pleases type in a 1 or 2 or 3 ");
				

			}
		}
		/**displays to the user that they successfully unscrambled the word and how many steps it took them in. */
		if (selectedWord.equals(String.valueOf(words))) {
			System.out.println("Congratulations! You unscrambled the word " + selectedWord + " in " + counter + " steps.");
		
		}
	}
}
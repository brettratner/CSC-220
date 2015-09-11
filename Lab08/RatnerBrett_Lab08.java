/**
 * Brett Ratner
 * CSC220-02
 * Lab 8
 */
/** 
 * This program will ask the user to type in as many strings as they want. 
 * even if they hit the enter button they can still type in more strings.
 * Not until they hit the enter button with out entering a string will the
 * program than put all the words the user inputed onto one line and than 
 * as long if the the total amount of characters they have entered is more
 * than 5 characters long than they program will display the smallest value 
 * and largest value String of a length of 5 characters in lexicographic order.
 * But if the string they entered was not at least a total of 5 characters 
 * than the program will display and error message. 
 */
import java.util.Scanner;

public class RatnerBrett_Lab08 {

	public static void main(String[] args) {

		/**
		 * create variables. Scanner, strings, counters,...
		 * 
		 * Ask the user for input. let the user know that an empty line ends the
		 * input.
		 * 
		 * while the sting is not empty { append the new line to the whole input
		 * 
		 * ask for another line }
		 */

		String text;
		String text2 = "";

		Scanner brett = new Scanner(System.in);
		/**
		 * asks the user for a string.
		 */

		System.out
				.println("Please enter in text and to finish hit the enter key without any text");
		text = brett.nextLine();

		/**
		 * if the user entered text and hit the enter key than it will keep
		 * waiting for the user to enter in text.
		 */
		while (text.isEmpty() == false) {

			text2 = text2 + text;

			text = brett.nextLine();

		}
		System.out.println(text2);

		if (text2.length() < 5) {
			System.out
					.println("Error you need to print out more than 5 characters");
		} else {

			/**
			 * for every substring of length 5 in the whole input { check if
			 * current substring is smaller in lex order than Smallest_so_far {
			 * if yes, than Smallest_so_far is the current substring (the one i
			 * am looking at right now) } check if current substring is smaller
			 * in lex order than Smallest_so_far { if yes, than Smallest_so_far
			 * is the current substring (the one i am looking at right now) }
			 * 
			 * } for every substring of length 5 { check if the substring is the
			 * same as the first_in_lex_order. if yes, count one more of that. }
			 */
			String smallString = "";
			String largeString = "";
			int countSmall = 1;
			int countLarge = 1;

			/**
			 * makes sure that there are at least 5 chars left in the string to
			 * use. than the second for statement checks 5 chars at a time.
			 */
			for (int i = 0; i < text2.length() - 4; i++) {
				String current = "";
				for (int j = i; j < i + 5; j++) {
					current = current + text2.charAt(j);
				}
				/**
				 * counts to see if the smallest string is repeated once or more
				 * than once.
				 */
				if (current.compareTo(smallString) == 0) {
					countSmall++;
				}
				/**
				 * counts to see if the largest string is repeated once or more
				 * than once.
				 */
				if (current.compareTo(largeString) == 0) {
					countLarge++;
				}
				/**
				 * finds the smallest substring of 5 characters long.
				 */
				if (current.compareTo(smallString) < 0
						|| smallString.equals("")) {
					smallString = current;
					countSmall = 1;
				}
				/**
				 * finds the largest substring of 5 characters long.
				 */
				if (current.compareTo(largeString) > 0
						|| largeString.equals("")) {
					largeString = current;
					countLarge = 1;
				}
			}
			System.out.println(smallString + "\t" + countSmall); /** Displays the smallest substring */
			System.out.println(largeString + "\t" + countLarge); /** Displays the largest substring */

		}
	}
}

/** Brett Ratner
 * CSC220-02
 * Lab 06 part 2
 * October 9, 2013
 */
import java.util.Scanner;

/**
 * This program will ask the user for a year and it will let the user know if
 * the year they typed in is a leap year or not, and will give the user an error
 * message is the year is beofre 1582.
 * 
 */

public class BrettRatner_Lab06_Part2 {

	public static void main(String[] args) {
		/**
		 * the year variable will be a number that will be given by the user
		 */
		int year;
		/**
		 * naming my scanner brett
		 */
		Scanner brett = new Scanner(System.in);
		/**
		 * asking the user to enter in a year
		 */
		System.out.print("Enter a Year: ");
		year = brett.nextInt();

		/**
		 * this if stamtent is checking to see if the year is greater than
		 * 1582 and
		 */
		if (year < 1582) {
			System.out.println("ERROR: The year must be 1582 or later");
		}
		/**
		 * the else if statement is checking to see if the year a multiple of 4 and
		 * not a multiple of 100 if it meets those requirements than it will
		 * display that it is a leap year. if it does not meet those
		 * requiremtents than it gets passed to the next else if statment
		 */
		else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year");

		}
		/**
		 * this else if statement is checking to see if the year is a multiple
		 * of 400, and if it is than if will display that it is a leap year and
		 * if it is not than it will go to the next else if statement.
		 */
		else if (year % 400 == 0) {
			System.out.println(year + " is a leap year");
		}
		/**
		 * this else statment is displaying the text saying that 
		 * the year is not a leap yaer if none of the previuos 
		 * requirements were meet. 
		 */
		else {
			System.out.println(year + " is not a leap year");
		}
	}
}

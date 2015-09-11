/**
 * Brett Ratner
 * CSC220-02
 * Final 
 */
/**
 * This program will take multiple lines of numbers whcih are serperated 
 * by white space and it will than display the numbers in the opposite order
 * so the first number that was entered will be the last number showed in 
 * the output. however all the numbers will stay in their respected row just
 * in the revsere order.
 */

import java.util.*;

public class RatnerBrett_ReverseLines {

	public static void main(String[] args) {

		/**
		 * Initializing the scanner.
		 */
		Scanner scan = new Scanner(System.in);

		/**
		 * Initializing my array.
		 */

		int[][] array = new int[100][100];

		
		while (scan.hasNextLine()) {
			String num = scan.nextLine();
			Scanner numberScan = new Scanner(num);
			while (numberScan.hasNext()) {
				int number = scan.nextInt();
			array[100][100] = number;
			}
			System.out.println(numberScan);

		}

	}

	



}

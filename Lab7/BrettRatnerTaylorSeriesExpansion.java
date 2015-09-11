/** Brett Ratner 

 *   CSC220-02

 *   Lab 7           

 */
/**
 * This program asks the user to input a value for x and than it will
 * use that number that was put in for x and Taylor series expansion
 * to solve the sign function of the first 50 terms.  
 * 
 */
import java.util.*;

public class BrettRatnerTaylorSeriesExpansion {

	public static void main(String[] args) {
 /**
  * Creates a scanner called brett.
  */
		Scanner brett = new Scanner(System.in);
		/**
		 * The x variable has a value of what ever the user typed in 
		 * when running the program.
		 */
		double x;
		double n;
		double answer = 0.0;
		double num = 0;
		double fact = 1;
		System.out.print("Enter a value for x: ");
		x = brett.nextDouble();
		/**
		 * The n variable is the exponent and the number that we
		 * are dividing by in the taylor series expansion, 
		 * this variable is always odd.the num variable gets multiplied
		 * by the fact variable and it will determine if that term is
		 * being added or subtracted. The fact variable makes the number
		 * that we are dividing by a factorial.
		 * 
		 */
		for (int i = 0; i < 50; i++) {
			n = i * 2 + 1;
			if (i % 2 == 0) { /** checking to see if the number has a 
			 					  remainder of 0 when divided by 2 to
			 					  see if the number will get added or 
			 					  subtracting*/
				num = 1;
			} else {
				num = -1;
			}
			for (int j = 1; j <= n; j++) {
				fact *= (x / j);

			}
			/**
			 * the answer valuable holds the sine of the first 50 terms
			 * of x.
			 */
			answer += num*fact;
			fact = 1; /** resets the fact variable to 1 so when it loops
			 			  again it wont have the value from the previous
			 			  loop.*/
		}
		/**
		 * displays the Sine of x using the Taylor series expansion
		 * and than on the next line will display the actual Sine
		 * of x.
		 */
		System.out.println("My Sine of " + x + " is = " + answer);
		System.out.println("Actual Sine of " + x + " is = " + Math.sin(x));

	}

}
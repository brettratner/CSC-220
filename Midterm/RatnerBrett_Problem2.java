/** Brett Ratner 

 *   CSC220-02

 *   Midterm            

 */
/**
 This program does will ask the user to type in a value 
 for the initial deposite and than ask the user to enter 
 in the number of years. from that the program will 
 find the total amount of money by adding the intrest and 
 subtracting the fee. 
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class RatnerBrett_Problem2 {
	public static void main(String[] args) {
		double initialDeposit;
		/** this variable  take in the number of the 
		 * initial Deposit */
		int years;
		/** this variable takes in the number of years that the
		 * user enters in */
		double interest = 0.04;
		/** this variable  the 4% interest rate*/
		double fee = 25;
		/** this variable is the 25 dollar fee */
		double total;
		/** this variable is the total amount after adding the interst
		 * and subtracting the fee */
		Scanner brett = new Scanner(System.in);
		
	    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		 
		System.out.print("Please enter the initial Deposite: ");
		initialDeposit = brett.nextFloat();
		System.out.print("Please enter the number of years: ");
		years = brett.nextInt();
		
		total = initialDeposit + ((initialDeposit * interest) - fee);
				
		System.out.println("Your total is: " +fmt1.format(total));
	}
}

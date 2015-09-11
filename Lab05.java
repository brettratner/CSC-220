/*
 Brett Ratner
 CSC 220-02
 Lab 5
 */
/*
 * this program will display the first 80 Fibonacci numbers with a space between 
 * each number and underneath that it will display degrees fahrenheit between
 * -30F to 120F and its conversion into celsius will be to the right of the 
 * fahrenheit with a tab space between them.
 * 
 */
public class Lab05 {

	public static void main(String[] args){
		
		long previous1 = 0;  //this is the first previous variable holder
		long previous2 = 1; // this is the second previous variable holder
		long current = 0;   // this the the current varaible holder
		long fahrenheit = -30; // this is the variable for degrees fahrenheit
		long celsius = -34;  //this is the variable degrees celsius
		 System.out.print( "0" + " ");  // prints out the number 0
		for(long i = 1; i < 80; i++){  // runs the loop 79 times
			current = previous1 + previous2; // sets the current value equal to the first previous value plus the second previous value 
			System.out.print(current + " "); // dislpays the current value
			previous2 = previous1;  // changes the value of the second previous number to the value of the first previous number
			previous1 = current;  // changes the value of the first previous number to the value of what the current number was
			
			
		}	
		System.out.println("");
		for(long i = 0; i <= 16; i++){ //runs this loop 17 times
			
			System.out.println(fahrenheit + " F \t" + celsius + " C"); // displays the fahrenheit and than a tab space and than its equvlent in celsius
			fahrenheit = fahrenheit + 10;// increses the fahrenheit by 10
			celsius = (int)((fahrenheit - 32) * (5.0/9.0)); // this the the conversion from fahrenheit to celsius
		}
		
	}
	
	
}

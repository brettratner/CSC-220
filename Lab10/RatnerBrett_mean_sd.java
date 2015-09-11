/**
 * Brett Ratner
 * CSC220-02
 * Lab 10
 */
/**
 * This program starts off by asking the user how many integers they would like to enter in. Than after the
 * user gives a number they are then asked to enter in all the integers one at a time. It will than compute 
 * the mean and standard deviation of the numbers that were entered. It will display both the mean and 
 * standard deviation.
 */
import java.util.*;
import java.text.DecimalFormat;

public class RatnerBrett_mean_sd {

    public static void main(String[] args){
       
        Scanner brett = new Scanner(System.in);
        int n; /** this variable takes in how many numbers the user will input */
        double [] integers; /** this variable is the array of integers that the user inputs*/
        double mean; /** this variable will hold the mean of all the numbers*/
        double sd = 0; /** this variable holds the standard deviation*/
        double sum1 = 0; /** holds the sum of the medium */
        double sum2 = 0; /** holds the sum of the standard deviation */
        
        /** asks the user on how  many numbers they will enter into the array*/
        System.out.println("how many integers do you want?");
        n = brett.nextInt();
        
        /** asks the user to type each number into the array one at a time, After each number hit enter to type in the next number*/
        integers = new double[n];
        System.out.println("what integers would you like to find the mean and standard deviation of? \nAfter each number hit enter to type in the next number.");

        /** the for loop will allow the user to keep typing in the integers until they have reached the
         *  number of integers that the user has set. and it will keep track of all the numbers entered
         *  and finds the sum of all the numbers*/
        for(int x=0;x < n; x++){
        integers[x] = brett.nextInt();
        brett.nextLine();
        sum1 =  sum1 + integers[x];
        }
        /** finds the mean and than displays the mean rounded to two decimal places*/
        mean = sum1 / n;
        System.out.println("The mean is: " + roundTwoDecimals(mean));
        
        /** finds the sum that is used for the standard deviation*/
        for(int j=0; j<n; j++){
            sum2 += (integers[j] - mean)* (integers[j] - mean);
            
        }
        /**finds the standard deviation and than is displayed rounded to two decimal places. */
        sd = Math.sqrt(sum2/(n-1));
        System.out.println("The Standard deviation is: " + roundTwoDecimals(sd));
        
        
        
    }
    /**
     * This method takes a double that has a decimal and rounds it to only two decimal places
     */
    public static double roundTwoDecimals(double d) {      
        DecimalFormat twoDForm = new DecimalFormat("#.##");
    return Double.parseDouble(""+(twoDForm.format(d)));
}
    
}
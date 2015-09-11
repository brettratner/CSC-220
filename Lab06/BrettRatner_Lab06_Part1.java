/** Brett Ratner
 * CSC220-02
 * Lab 06 part 1
 * October 9, 2013
 */
import java.util.Scanner;

/**
 * This program computes the volume and surface area of a sphere, after the user
 * gives the value for the radius. It will ask the user for the radius in the
 * begging of the prgram and than print out the volume on one line and the
 * surface area on the next.
 */
public class BrettRatner_Lab06_Part1 {

	public static void main(String[] args) {
		double volume;
		/** this variable has the equation to find the volume of a sphere */
		double surfaceArea;
		/** this variable has the equation to find the surface area of a shpere */
		double radius;
		/** this variable is be defined by what ever number the user sets it as */
		double pi = 3.14159;
		/** this variable is the value of pi */
		Scanner brett = new Scanner(System.in);
		System.out.print("Please enter the radius of the Sphere: ");
		radius = brett.nextDouble();
		/**
		 * this is the equation that is used to find the volume of the sphere.
		 * Than it will do the equation and display the volume of the sphere to
		 * the user.
		 */
		volume = (4.0 / 3.0) * pi * radius * radius * radius;
		System.out.println("Volume = " + volume);
		/**
		 * this is the equation that is used to find the surface area of the
		 * sphere. Than it will do the equation and display the surface area of
		 * the sphere to the user.
		 */
		surfaceArea = 4.0 * pi * radius * radius;
		System.out.println("Surface Area =  " + surfaceArea);
	}
}

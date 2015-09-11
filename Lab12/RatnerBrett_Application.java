/**                                                                                                                                          /**
 *Brett Ratner
 *CSC220-02
 *Lab12
 */
/**
 * this program asks the user to type the x-point, y-point, radius and height three times over.
 * it will than calculate the value for each shape. for the point it will display the x and y point. 
 * for the circle it will display the x and y point as well as the area of the circle. for the cylinder 
 * it will display the x and y point, the area as well as the volume of the cylinder. 
 */
import java.util.*;

public class RatnerBrett_Application {

	public static void main(String[] args) {

		/**
		 * Initializing the scanner.
		 */
		Scanner scan = new Scanner(System.in);

		/**
		 * Initializing both of my arrays.
		 */
		
		RatnerBrett_Point[] array = new RatnerBrett_Point[9];  
		String[] array2 = new String[12];
		int idx = -1;

		/**
		 * asks the user to enter the 4 numbers for the first set and when they hit enter than it will prompt the user 
		 * to enter in the 4 numbers  for the 2nd set and than when they hit enter again than it will prompt the user to enter the 4 
		 * numbers in for the 3rd set. 
		 */
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out
						.println("Enter in the x-point, y-point radius and height for the first set: ");
			}
			if (i == 1) {
				System.out
						.println("Enter in the x-point, y-point radius and height for the second set: ");
			}
			if (i == 2) {
				System.out
						.println("Enter in the x-point, y-point radius and height for the third set: ");
			}

			String set = scan.nextLine();

			boolean emptySpace = true;
			
			/**
			 * checks to see if there is empty space this allows the user to put as many spaces 
			 * between each number as they want. 
			 */
			for (int j = 0; j < set.length(); j++) {
				if (set.charAt(j) == ' ') {
					emptySpace = true;
				}
				if (set.charAt(j) != ' ' && emptySpace == true) {
					emptySpace = false;
					idx++;
					array2[idx] = "";
				}
				if (set.charAt(j) != ' ' && emptySpace == false) {
					array2[idx] = array2[idx] + set.charAt(j);
				}
			}

		}
		/**
		 * prints out the to x and y points than the x and y points plus the area for the circle than 
		 * the x and y points and area plus the volume for the cylinder, and that happens three times. 
		 */
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				array[i] = new RatnerBrett_Point(
						Integer.parseInt(array2[4 * (i / 3)]),
						Integer.parseInt(array2[4 * (i / 3) + 1]));
			}
			if (i % 3 == 1) {
				array[i] = new RatnerBrett_Circle(
						Integer.parseInt(array2[4 * (i / 3)]),
						Integer.parseInt(array2[4 * (i / 3) + 1]),
						Double.parseDouble(array2[4 * (i / 3) + 2]));
			}
			if (i % 3 == 2) {
				array[i] = new RatnerBrett_Cylinder(
						Integer.parseInt(array2[4 * (i / 3)]),
						Integer.parseInt(array2[4 * (i / 3) + 1]),
						Double.parseDouble(array2[4 * (i / 3) + 2]),
						Double.parseDouble(array2[4 * (i / 3) + 3]));
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}


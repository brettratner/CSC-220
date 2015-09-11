/**
 * Brett Ratner 
 * CSC220-02
 * Project 3 
 */

/**This program reads a line from a  text file created separately called name_data.txt.
 * The program than prompts the user to pick one of the 5 options by typing 1-5 to pick 
 * the option. once the user picks the option if the user typed in a 1,2, or 3 than 
 * the user is prompted to type in a name they want to look up. for the first option
 * it will tell the user the best year for the name they typed in was. for the second
 * option it will tell them the best rank for the name they typed in was. for the third
 * option it will display a scatter plot graph of that years rank for each decade and each
 * point will be a random color pick from 12 colors given from the StdDraw.java. if they
 * user typed in a 4 than that will clear the plotted graph and for the user to quit the 
 * user would press type in 5. 
 */
import java.util.*;
import java.io.*;

public class RatnerBrett_NameSurfer {
	/**
	 * creates an array that holds all the namerecords.
	 */
	private static RatnerBrett_NameRecord[] arrayNameRecord = new RatnerBrett_NameRecord[5000];
	private static int numOfNames = 0; /** the index of how many names there are*/

	/**
	 * User Options.
	 */
	private static final int USER_BEST_YEAR =  1;
	private static final int USER_BEST_RANK =  2;
	private static final int USER_PLOT =	   3;
	private static final int USER_CLEAR_PLOT = 4;
	private static final int USER_QUIT = 	   5;
	
	/**
	 * calls the text file called name_data.txt
	 */
	private static String FILENAME = "name_data.txt";
	/**
	 * loads the file
	 * @throws IOException
	 */
	private static void loadFile() throws IOException {
		int idx = 0;
		Scanner fileScan = new Scanner(new File(FILENAME));
		while (fileScan.hasNext()) {
			arrayNameRecord[idx] = new RatnerBrett_NameRecord(fileScan.next(),
					fileScan.nextInt(), fileScan.nextInt(), fileScan.nextInt(),
					fileScan.nextInt(), fileScan.nextInt(), fileScan.nextInt(),
					fileScan.nextInt(), fileScan.nextInt(), fileScan.nextInt(),
					fileScan.nextInt(), fileScan.nextInt());
			idx++;
		}

		numOfNames = idx;

	}
	/**
	 * finds the appropriate name the user typed in and returns the index of that name
	 * @param pName
	 * @return
	 */
	private static int findNameRecordIndex(String pName) {
		int returnValue = -1;

		for (int i = 0; i < RatnerBrett_NameSurfer.numOfNames; i++) {
			if (RatnerBrett_NameSurfer.arrayNameRecord[i].getName()
					.equalsIgnoreCase(pName)) {
				returnValue = i;
				break;
			}
		}
		return returnValue;
		
	}
	/**
	 * the list of options the user can choose from
	 */
	private static void listPrompts() {
		System.out.println("1-Find best year for name.");
		System.out.println("2-Find best rank for a name.");
		System.out.println("3-Plot popularity of name.");
		System.out.println("4-Clear plot.");
		System.out.println("5-Quit.");
		System.out.print("Enter your selection: ");
	}
	/**
	 * prompts the user to enter in a name and depending on what case is 
	 * exicuted it will display either the best year for the name or the 
	 * best rank for the name or plot the points on the graph for that name.
	 * @param input
	 * @param command
	 */
	private static void processNameRecord(Scanner input, int command) {
		int curNameRecord;

		System.out.print("Enter a name: ");
		curNameRecord = RatnerBrett_NameSurfer
				.findNameRecordIndex(input.next());
		if (curNameRecord >= 0) {
			switch (command) {
			case USER_BEST_YEAR:
				System.out
						.println("Best year for "
								+ RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord]
										.getName()
								+ " is "
								+ RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord]
										.bestYear(RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord]
												.bestYear()) + ".");
				System.out.println("");
				break;
			case USER_BEST_RANK:
				System.out
						.println("Best rank for "
								+ RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord]
										.getName()
								+ " is "
								+ RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord]
										.getRank(RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord]
												.bestYear()) + ".");
				System.out.println("");
				break;
			case USER_PLOT:
				RatnerBrett_NameSurfer.arrayNameRecord[curNameRecord].plot();
				System.out.println("");
				break;
			}
		}
	}
		/**
		 * asks the user to type in a number 1-5 and will respond accordingly 
		 */
	private static void promptUser() {
		Scanner input = new Scanner(System.in);

		do {
			RatnerBrett_NameSurfer.listPrompts();
			switch (input.nextInt()) {
			case USER_BEST_YEAR:
				processNameRecord(input, USER_BEST_YEAR);
				break;
			case USER_BEST_RANK:
				processNameRecord(input, USER_BEST_RANK);
				break;
			case USER_PLOT:
				processNameRecord(input, USER_PLOT);
				break;
			case USER_CLEAR_PLOT:
				RatnerBrett_NameRecord.clearPlot();
				break;
			case USER_QUIT:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a number between 1-5.");
				break;
			}

		} while (true);
	}

	public static void main(String[] args) {
		/**
		 * runs the promptuser and as long as there are no errors
		 * it will run the program correctly but if there is an
		 * error than it will catch that error and stop the program.
		 */
		try {
			RatnerBrett_NameSurfer.loadFile();
			RatnerBrett_NameSurfer.promptUser();

		}

		catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.err);
		}

	}

}

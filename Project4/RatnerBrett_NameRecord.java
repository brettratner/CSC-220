/** Brett Ratner 
 *   CSC220-02
 *   Project 4           
 */
/**
 *  This program is called in RanterBrett_NameSurfer.java and
 *  this class has the name and the rank over the years. this 
 *  has the methods for the plots on the graph and the best year 
 *  and the best rank.
 */
import java.util.Random;

public class RatnerBrett_NameRecord {

	private String name; /**the name that the user types in */
	
	private int[] decadeRank; /** the array for the decade rank */

	/**
	 * Various Static variable used for generating the axis & legends of the
	 * chart
	 */
	private static int X_LEGEND_BASE = 1915;
	private static int Y_LEGEND_BASE_BOT = 20;
	private static int Y_LEGEND_BASE_TOP = 1100;

	public static String DECADES[] = { "1900", "1910", "1920", "1930", "1940",
									   "1950", "1960", "1970", "1980", "1990", "2000" };

	/**
	 * Constructor Name and eleven decade Ranks always in order of decade.
	 */
	public RatnerBrett_NameRecord(String pName, int pD0, int pD1, int pD2,
			int pD3, int pD4, int pD5, int pD6, int pD7, int pD8, int pD9,
			int pD10) {
		name = pName;
		int[] a1 = { pD0, pD1, pD2, pD3, pD4, pD5, pD6, pD7, pD8, pD9, pD10 };
		decadeRank = a1;
		
	}
	/**
	 * Getter function for name, returns the name
	 */
	public String getName() {
		return (this.name);
	}

	/**
	 * Getter function for decadeRank - the array of Ranks through the Decades, returns the decade rank.
	 */
	public int[] getDecadeRank() {
		return (this.decadeRank);
	}

	
	/**
	 * getRank - returns the rank of a name for a specific decade, positioned by
	 * index.
	 */

	public int getRank(int idx) {
		return (decadeRank[idx]);
	}

	/**
	 * getRank - returns the rank of a specific decade - Not Used 
	 */

	/*public int getRank(String decade) {
		int returnValue = 0;

		for (int i = 0; i <= 10; i++) {
			if (decade.equals(RatnerBrett_NameRecord.DECADES[i])) {
				returnValue = decadeRank[i];
			}
		}
		return (returnValue);
	}*/

	/**
	 * bestYear - returns the positional index of the highest ranking decade in
	 * the array.
	 */

	public int bestYear() {
		int returnValue = 0;

		for (int i = 0; i <= 10; i++) {
			if (decadeRank[i] == 0)
				continue;
			if (decadeRank[returnValue] == 0)
				returnValue = i;
			if (decadeRank[i] < decadeRank[returnValue]) {
				returnValue = i;
			}
		}

		return returnValue;
	}

	/**
	 * bestYear - returns the highest ranking decade
	 */

	public String bestYear(int i) {
		return RatnerBrett_NameRecord.DECADES[i];
	}
/**
 * clearPlot - clears the information of the plot
 */
	public static void clearPlot() {
		StdDraw.clear();
	}
/**
 * plot - draws the x and y axis and sets the size of the canvas 
 * titles the chart with the name that was typed in at the top
 * puts the years on the x-axis and the ranking on the y-axis.
 */
	public void plot() {
		StdDraw.setCanvasSize(800, 512);
		StdDraw.setYscale(0, 1100);
		StdDraw.setXscale(1900, 2000);
		StdDraw.line(1910, 20, 1910, 1100);   /** y-axis */
		StdDraw.line(1910, 20, 2000, 20);   /** x-axis */
		StdDraw.text(X_LEGEND_BASE + 40, Y_LEGEND_BASE_TOP, getName());  /** Label the Chart */

		/** Draw X-LEGEND */
		for (int i = 0; i <= 10; i++) {
			StdDraw.text(X_LEGEND_BASE + (8 * i), 0,
					RatnerBrett_NameRecord.DECADES[i]);
		}

		/** Draw Y-LEGEND */
		for (int i = Y_LEGEND_BASE_TOP; i > Y_LEGEND_BASE_BOT; i -= 100) {
			if ((Y_LEGEND_BASE_TOP - i) == 0)
				StdDraw.text(1905, i, "1");
			else
				StdDraw.text(1905, i, (Y_LEGEND_BASE_TOP - i) + "");
		}

		/**
		 * Choose a Random Color, then chart the point.
		 */
		Random randy = new Random();
		for (int i = 0; i <= 10; i++) {
			switch (randy.nextInt(12)) {
			case 1:
				StdDraw.setPenColor(StdDraw.BLACK);
				break;
			case 2:
				StdDraw.setPenColor(StdDraw.BLUE);
				break;
			case 3:
				StdDraw.setPenColor(StdDraw.CYAN);
				break;
			case 4:
				StdDraw.setPenColor(StdDraw.DARK_GRAY);
				break;
			case 5:
				StdDraw.setPenColor(StdDraw.GRAY);
				break;
			case 6:
				StdDraw.setPenColor(StdDraw.GREEN);
				break;
			case 7:
				StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				break;
			case 8:
				StdDraw.setPenColor(StdDraw.MAGENTA);
				break;
			case 9:
				StdDraw.setPenColor(StdDraw.ORANGE);
				break;
			case 10:
				StdDraw.setPenColor(StdDraw.PINK);
				break;
			case 11:
				StdDraw.setPenColor(StdDraw.RED);
				break;
			case 12:
				StdDraw.setPenColor(StdDraw.YELLOW);
				break;

			}
			/**
			 * sets the radius of each point and plots the appropriate points
			 * on the chart for that name. if that name did not make the top
			 * 1000 for a certain year than the point will be drawn on the 
			 * x-axis.
			 *
			 */
			StdDraw.setPenRadius(.02);
			if (decadeRank[i] == 0) {
				StdDraw.point(X_LEGEND_BASE + (8 * i), Y_LEGEND_BASE_BOT);
			} else {
				StdDraw.point(X_LEGEND_BASE + (8 * i), Y_LEGEND_BASE_TOP
						- (decadeRank[i] - 1));
			}
		}
		StdDraw.show();
	}
	
	/**
	 * main procedure used for unit testing the NameRecord class
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * RatnerBrett_NameRecord test = new RatnerBrett_NameRecord("Brett",
	 * 58,69,99,131,8,236,278,380,467,408,466); System.out.println
	 * (test.toString()); test.plot(); }

		public String toString() {
		String returnValue;
		returnValue = "Name: " + this.getName() + " {";
		for (int i = 0; i <= 10; i++) {
			returnValue += (RatnerBrett_NameRecord.DECADES[i] + ":" + this
					.getRank(i));
			if (i != 10) {
				returnValue += (",");
			}
		}
		returnValue += "}";
		returnValue += "\nBestYear (index): " + bestYear();
		returnValue += "\nBestYear: " + bestYear(bestYear());
		return returnValue;
	}*/

}



/**
 * Brett Ratner CSC220-02 Lab11
 */
public class RatnerBrett_Rectangle {

	protected int height;
	protected int width;
	private static int recCount = 0;

	/**
	 * Constructor
	 */
	public RatnerBrett_Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		recCount++;
	}

	/** width mutator. sets a value for the width with variable x. */
	public void setWidth(int x) {
		width = x;
	}

	/** width accessor. returns the width. */
	public int getWidth() {
		return width;
	}

	/** height mutator. sets a value for the height with variable y. */
	public void setHeight(int y) {
		height = y;
	}

	/** height accessor. returns the height */
	public int getHeight() {
		return height;
	}

	/**
	 * returns the Surface area of the rectangular prism with the equation
	 * width*height
	 */
	public int computeSurfaceArea() {
		return width * height;
	}

	/**
	 * returns the number of times there were of all rectangles.
	 */
	public int getCount() {
		return recCount;
	}

	public String toString() {
		return "Width: " + width + "Height: " + height + "SurfaceArea: "
				+ width * height;
	}
}
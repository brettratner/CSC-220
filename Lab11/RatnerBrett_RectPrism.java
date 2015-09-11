/**
 * Brett Ratner CSC220-02 Lab11
 */
public class RatnerBrett_RectPrism extends RatnerBrett_Rectangle {

	int depth;
	static int prismCount = 0;

	/**
	 * Constructor
	 */
	public RatnerBrett_RectPrism(int width, int height, int depth) {
		super(width, height);
		this.depth = depth;
		prismCount++;
	}

	/**
	 * depth mutator. sets a value for the Depth with variable z.
	 */
	public void setDepth(int z) {
		depth = z;
	}

	/** depth accessor. returns the depth */
	public int getDepth() {
		return depth;
	}

	/**
	 * returns the volume of the rectangular prism. with the equation of
	 * width*height*depth.
	 */
	public int computeVolume() {
		return width * height * depth;
	}

	/**
	 * returns the Surface area of the rectangular prism with the equation
	 * 2(WD)+2(DH)+2(WH)
	 */
	public int computeSurfaceArea() {
		return 2 * width * depth + 2 * depth * height + 2
				* super.computeSurfaceArea();
	}

	public String toString() {
		return "Width: " + width + "Height: " + height + "Volume: " + width
				* height * depth + "SurfaceArea: " + 2 * width * depth + 2
				* depth * height + 2 * width * height;
	}

	/**
	 * returns the number of times there were of the rectangular prism.
	 */
	public int getCount() {
		return prismCount;
	}
}
/**                                                                                                                                       /
 *Brett Ratner
 *CSC220-02
 *Lab12
 */

/**
 * this class calls the class RatnerBrett_Circle and it adds the private double
 * of the height.
 */
public class RatnerBrett_Cylinder extends RatnerBrett_Circle {

	private double height;

	/**
	 * Constructor
	 */
	public RatnerBrett_Cylinder(int pointX, int pointY, double radius,
			double height) {
		super(pointX, pointY, radius);
		this.height = height;

	}

	/** height mutator. */
	public void setHeight(int h) {
		if (height < 0) {

			this.height = h;
		}
	}

	/** height accessor. */
	public double getHeight() {
		return this.height;
	}

	/**
	 * 
	 * method that has the equation to calculate the volume of the cylinder
	 */
	public double computeVolume() {
		return super.computeArea() * height;
	}

	/**
	 * returns the string from RatnerBrett_Circle plus the volume.
	 */
	public String toString() {

		return super.toString() + "\tVolume " + computeVolume();
	}

}

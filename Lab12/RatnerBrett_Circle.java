/**                                                                                                                                          /**
 *Brett Ratner
 *CSC220-02
 *Lab12
 */
/**
 * this class calls the class RatnerBrett_Point and it add the private double of
 * the radius. and if the radius is negative than it will be set to the value of
 * zero.
 */

public class RatnerBrett_Circle extends RatnerBrett_Point {

	private double radius;

	/**
	 * Constructor
	 */
	public RatnerBrett_Circle(int pointX, int pointY, double radius) {
		super(pointX, pointY);
		if (this.radius < 0) {
			this.radius = 0;

		} else {
			this.radius = radius;

		}

	}

	/** radius mutator. */
	public void setRadius(int r) {
		if (radius < 0) {
			System.out.println("ERROR: you can not have a negative radius");
		} else {
			this.radius = r;
		}
	}

	/** radius accessor. */
	public double getRadius() {
		return this.radius;
	}

	/**
	 * 
	 * method that has the equation to calculate the area of the circle
	 */
	public double computeArea() {
		return Math.PI * radius * radius;
	}

	/**
	 * returns the string from RatnerBrett_Point plus the area.
	 */

	public String toString() {

		return super.toString() + "\tarea: " + computeArea();
	}

}
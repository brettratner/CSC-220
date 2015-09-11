/**
 *Brett Ratner
 *CSC220-02
 *Lab11
 */
/**
 * This program will display the width, height, and surface are of a rectangle
 * along with telling the user on how many rectangles there are. than it will
 * display the width, height, depth, volume, and surface area of a rectangular
 * prism, along with telling the user on how many rectangular prisms there are.
 */
public class RatnerBrett_Demo {

	public static void main(String[] args) {

		/**
		 * This creates a rectangle and a rectangular prism.
		 */
		RatnerBrett_Rectangle rect = new RatnerBrett_Rectangle(0, 0);
		RatnerBrett_RectPrism prism = new RatnerBrett_RectPrism(0, 0, 0);

		/**
		 * where the values for the rectangle are set.
		 */
		rect.setHeight(10);
		rect.setWidth(10);

		/**
		 * where the values for the rectangular prism are set
		 */
		prism.setDepth(11);
		prism.setHeight(10);
		prism.setWidth(10);

		/**
		 * This displays the rectangles width, height, surface are and how many
		 * there are.
		 */
		System.out.println("Rectangle:" + "\nWidth: " + rect.getWidth()
				+ "\nHeight: " + rect.getHeight() + "\nSurface Area: "
				+ rect.computeSurfaceArea() + " \nThere are " + rect.getCount()
				+ " Rectangle(s)");

		System.out.println();

		/**
		 * This displays the rectangular prisms width, height, depth, volume,
		 * surface are and how many there are.
		 */
		System.out.println("Rectangular Prism:" + "\nWidth: "
				+ prism.getWidth() + "\nHeight: " + prism.getHeight()
				+ "\nDepth: " + prism.getDepth() + "\nVolume: "
				+ prism.computeVolume() + "\nSurface Area: "
				+ prism.computeSurfaceArea() + " \nThere are "
				+ prism.getCount() + " Rectangluar Prism(s)");

	}
}

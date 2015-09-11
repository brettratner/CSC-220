/**
 * Brett Ratner
 * CSC220-02
 * Lab 09
 */
/**
 * This program will display the Systolic blood pressure, diastolic blood
 * pressure, the HDL cholesterol, and the LDL cholesterol of two different
 * patients. Both blood pressures and cholesterols will be displayed on their
 * own line. Than it will display the ratio of the LDL cholesterol and the HDL
 * cholesterol. Than is will inform the user that HDL cholesterol is the good
 * cholesterol and what a good ratio is.
 */
public class RatnerBrett_TestCheckup {

	public static void main(String[] args) {

		/**
		 * this creates two patients named p1 and p2.
		 */
		RatnerBrett_Checkup p1 = new RatnerBrett_Checkup(1);
		RatnerBrett_Checkup p2 = new RatnerBrett_Checkup(2);

		p1.setSystolicPressure(150);
		p1.setDiastolicPressure(130);
		p1.setcholesterolHDL(42);
		p1.setcholesterolLDL(110);

		p2.setSystolicPressure(120);
		p2.setDiastolicPressure(125);
		p2.setcholesterolHDL(37);
		p2.setcholesterolLDL(119);
		/**
		 * This displays the patients both blood pressures and both
		 * cholesterols, and the cholesterol ratio.
		 */
		System.out.println("patient 1 systolic blood pressure is: "
				+ p1.getSystolicPressure()
				+ "\npatient 1 diastolic blood pressure is: "
				+ p1.getDiastolicPressure()
				+ "\npatient 1 LDL cholesterol is: " + p1.getcholesterolLDL()
				+ "\npatient 1 HDL cholesterol is: " + p1.getcholesterolHDL()
				+ "\npatient 1 ratio is: " + p1.computeRatio() + "\n"
				+ p1.toString() + "\n\npatient 2 systolic blood pressure is: "
				+ p2.getSystolicPressure()
				+ "\npatient 2 diastolic blood pressure is: "
				+ p2.getDiastolicPressure()
				+ "\npatient 2 LDL cholesterol is: " + p2.getcholesterolLDL()
				+ "\npatient 2 HDL cholesterol is: " + p2.getcholesterolHDL()
				+ "\npatient 2 ratio is: " + p2.computeRatio() + "\n"
				+ p2.toString());
	}
}

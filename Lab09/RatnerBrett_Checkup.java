public class RatnerBrett_Checkup {

	private int patientNumber;
	private int systolicPressure;
	private int diastolicPressure;
	private int cholesterolLDL;
	private int cholesterolHDL;

	
	public RatnerBrett_Checkup(int patientID) {
		patientNumber = patientID;
	}

	/**
	 * sets a value for the patientNumber with variable patientNum.
	 */
	public void setPatientNumber(int patientNum) {
		patientNumber = patientNum;
	}

	/**
	 * returns the patient number
	 */
	public int getPatientNumber() {
		return patientNumber;
	}

	/**
	 * sets a value for the SystolicPressure with variable systolic.
	 */
	public void setSystolicPressure(int systolic) {
		systolicPressure = systolic;
	}

	/**
	 * returns the Systolic blood pressure of the patient.
	 */
	public int getSystolicPressure() {
		return systolicPressure;
	}

	/**
	 * sets a value for the DiastolicPressure with variable diastolic.
	 */
	public void setDiastolicPressure(int diastolic) {
		diastolicPressure = diastolic;
	}

	/**
	 * returns the Diastolic blood pressure of the patient.
	 */
	public int getDiastolicPressure() {
		return diastolicPressure;
	}

	/**
	 * sets a value for the cholesterolLDL with variable ldl.
	 */
	public void setcholesterolLDL(int ldl) {
		cholesterolLDL = ldl;
	}

	/**
	 * returns the LDL cholesterol of the patient.
	 */
	public int getcholesterolLDL() {
		return cholesterolLDL;
	}

	/**
	 * sets a value for the cholesterolHDL with variable hdl.
	 */
	public void setcholesterolHDL(int hdl) {
		cholesterolHDL = hdl;
	}

	/**
	 * returns the HDL cholesterol of the patient.
	 */
	public int getcholesterolHDL() {
		return cholesterolHDL;
	}

	/**
	 * returns the ratio of the patients LDL cholestol over their HDL
	 * cholesterol.
	 */
	public double computeRatio() {
		return (double) cholesterolLDL / cholesterolHDL;
	}

	public String toString() {
		return "Systolic blood pressure:"
				+ systolicPressure
				+ " Diastolic blood pressure:"
				+ diastolicPressure
				+ " LDL Cholesterol:"
				+ cholesterolLDL
				+ " HDL Cholesterol:"
				+ cholesterolHDL
				+ " Ratio:"
				+ (double) cholesterolLDL
				/ cholesterolHDL
				+ " HDL is know as good cholesterol and that a ratio of 3.5 or lower is considered optimum";
	}

}
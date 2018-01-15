/**
 * 
 * @author
 *
 */
public class Grade9 extends Student {

	int mathEQAO;

	public Grade9(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int mEQAO) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.mathEQAO = mEQAO;

	}

	/**
	 * Returns -1 if parameter has greater EQAO score
	 * Returns +1 if parameter has less EQAO score
	 * Returns 0 if parameter has equal EQAO score
	 * 
	 * @param s1
	 */
	public int compareTo(Student s1) {
		if (this.mathEQAO > ((Grade9)s1).mathEQAO) {
			return +1;
		} else if (this.mathEQAO < ((Grade9)s1).mathEQAO) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		String s = super.toString();
		s += "Math EQAO score: " + mathEQAO + "\n";
		s += "Grade 9";
		return s;
	}

}

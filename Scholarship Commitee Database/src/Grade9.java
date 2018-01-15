/**
 * 
 * @author
 *
 */
public class Grade9 extends Student {

	static int mathEQAO;

	public Grade9(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int mEQAO) {

		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);

		Grade9.mathEQAO = mEQAO;

	}
	
	public String toString() {

		String s = super.toString();

		s += "Math EQAO score: " + mathEQAO + "\n";

		s += "Grade 9";

		return s;

	}

}

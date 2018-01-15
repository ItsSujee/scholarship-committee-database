/**
 * 
 * @author 
 *
 */
public class Grade11 extends Student {

	public Grade11(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp) {

		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);

	}

	public String toString() {

		String s = super.toString();

		s += "Grade 11";

		return s;

	}

}

/**
 * 
 * @author
 *
 */
public class Grade12 extends Student {

 static String topPostChoice;

	public Grade12(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, String tPC) {

		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);

		Grade12.topPostChoice = tPC;

	}

	public String toString() {

		String s = super.toString();

		s += "Top university choice: " + topPostChoice + "\n";

		s += "Grade 12";

		return s;

	}

}

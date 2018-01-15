/**
 * 
 * @author
 *
 */
public class Grade10 extends Student {
	
	int osslt;

	public Grade10(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int osslt) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.osslt = osslt; 
	}

	public String toString() {
		String s = super.toString();
		s += "OSSLT score: " + osslt + "\n";
		s += "Grade 10";
		return s;
	}

	/**
	 * Returns -1 if parameter has greater OSSLT score
	 * Returns +1 if parameter has less OSSLT score
	 * Returns 0 if parameter has equal OSSLT score
	 * 
	 * @param s1
	 */
	public int compareTo(Student s1) {
		if (this.osslt > ((Grade10)s1).osslt) {
			return +1;
		} else if (this.osslt < ((Grade10)s1).osslt) {
			return -1;
		} else {
			return 0;
		}
	}

}

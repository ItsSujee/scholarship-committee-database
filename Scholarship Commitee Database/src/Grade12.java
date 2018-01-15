/**
 * 
 * @author
 *
 */
public class Grade12 extends Student {

	int topPostChoice;

	public Grade12(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int topPost) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.topPostChoice = topPost;
	}


	/**
	 * Returns -1 if parameter has greater topPostChoice score
	 * Returns +1 if parameter has less topPostChoice score
	 * Returns 0 if parameter has equal topPostChoice score
	 * 
	 * @param s1
	 */
	public int compareTo(Student s1) {
		if (this.topPostChoice > ((Grade12)s1).topPostChoice) {
			return +1;
		} else if (this.topPostChoice < ((Grade12)s1).topPostChoice) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		String s = super.toString();
		s += "Top university choice enterence average: " + topPostChoice + "\n";
		s += "Grade 12";
		return s;
	}

}

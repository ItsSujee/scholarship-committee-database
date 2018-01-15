/**
 * 
 * @author 
 *
 */

public class Grade11 extends Student {

	int mathContestScore;	
	
	public Grade11(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int mathScore) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.mathContestScore = mathScore;
	}

	/**
	 * Returns -1 if parameter has greater mathContest score
	 * Returns +1 if parameter has less mathContest score
	 * Returns 0 if parameter has equal mathContest score
	 * 
	 * @param s1
	 */
	public int compareTo(Student s1) {
		if (this.mathContestScore > ((Grade11)s1).mathContestScore) {
			return +1;
		} else if (this.mathContestScore < ((Grade11)s1).mathContestScore) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		String s = super.toString();
		s += "Grade 11";
		return s;
	}
	
}

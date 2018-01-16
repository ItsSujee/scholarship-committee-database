/**
 * Class Name: Grade11
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *
 */
public class Grade11 extends Student {

	/**
	 * new field that is only for Grade11 Students, mathContestScore
	 */
	int mathContestScore;
	
	/**
	 * Constructor for Grade11
	 * 
	 * @param stuNumber //integer that is the student number
	 * @param fNme //String that is the first name
	 * @param lNme //String that is the last name
	 * @param DOB //String that is the date of birth format (DD/MM/YY)
	 * @param avgMrks //double that is the average of the marks
	 * @param vlHrs //integer that is the number of volunteer hours completed
	 * @param nmECs //integer that is number of extra curricular activities
	 * @param hrsEmp //integer that is number of hours employed
	 * @param mathScore //integer that is the math contest score
	 */
	public Grade11(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int mathScore) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.mathContestScore = mathScore;
	}

	/**
	 * Returns -1 if parameter has greater mathContest score
	 * Returns +1 if parameter has less mathContest score
	 * Returns 0 if parameter has equal mathContest score
	 * 
	 * @param s1 //parameter is a student, must be an instanceOf Grade9
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
	
	/**
	 * toString method, prints out the super from Student, adds the Math Contest and the Grade
	 */
	public String toString() {
		String s = super.toString();
		s += "Math Contets score: " + mathContestScore + "\n";
		s += "Grade 11";
		return s;
	}
	
}

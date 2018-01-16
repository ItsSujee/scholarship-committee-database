/**
 * Class Name: Grade10
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *
 */
public class Grade10 extends Student {
	
	/**
	 * new field that is only for Grade10 Students, OSSLT score
	 */
	int osslt;

	/**
	 * Constructor for Grade10
	 * 
	 * @param stuNumber //integer that is the student number
	 * @param fNme //String that is the first name
	 * @param lNme //String that is the last name
	 * @param DOB //String that is the date of birth format (DD/MM/YY)
	 * @param avgMrks //double that is the average of the marks
	 * @param vlHrs //integer that is the number of volunteer hours completed
	 * @param nmECs //integer that is number of extra curricular activities
	 * @param hrsEmp //integer that is number of hours employed
	 * @param osslt //integer that is the score of the OSSLT
	 */
	public Grade10(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int osslt) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.osslt = osslt; 
	}

	/**
	 * Returns -1 if parameter has greater OSSLT score
	 * Returns +1 if parameter has less OSSLT score
	 * Returns 0 if parameter has equal OSSLT score
	 * 
	 * @param s1 //parameter is a student, must be an instanceOf Grade9
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
	
	/**
	 * toString method, prints out the super from Student, adds the OSSLT and the Grade
	 */
	public String toString() {
		String s = super.toString();
		s += "OSSLT score: " + osslt + "\n";
		s += "Grade 10";
		return s;
	}

}

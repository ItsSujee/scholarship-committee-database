/**
 * Class Name: Grade11
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *  Grade11 class extends the Student class, it is type of Student that includes the scores for the math Contest
 *  INHERITANCE
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
	 * Prints if parameter has greater mathContest score
	 * Prints if parameter has less mathContest score
	 * Prints if parameter has equal mathContest score
	 * 
	 * @param s1 //parameter is a student, must be an instanceOf Grade9
	 */
	public void compareTo(Student s1) {
		if (this.mathContestScore > ((Grade11)s1).mathContestScore) {
			System.out.println(this.fName + " " + this.lName + " has a greater score than " + s1.fName + " " + s1.lName);
		} else if (this.mathContestScore < ((Grade11)s1).mathContestScore) {
			System.out.println(this.fName + " " + this.lName + " has a lesser score than " + s1.fName + " " + s1.lName);
		} else {
			System.out.println(this.fName + " " + this.lName + " has an equal score to " + s1.fName + " " + s1.lName);
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

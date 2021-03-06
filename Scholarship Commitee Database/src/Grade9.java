/**
 * Class Name: Grade9
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *  Grade9 class extends the Student class, it is type of Student that includes the scores for the math EQAO
 *  INHERITANCE
 */
public class Grade9 extends Student {

	/**
	 * new field that is only for Grade9 Students, EQAO score
	 */
	int mathEQAO;

	/**
	 * Constructor for Grade9 class
	 * 
	 * @param stuNumber //integer that is the student number
	 * @param fNme //String that is the first name
	 * @param lNme //String that is the last name
	 * @param DOB //String that is the date of birth format (DD/MM/YY)
	 * @param avgMrks //double that is the average of the marks
	 * @param vlHrs //integer that is the number of volunteer hours completed
	 * @param nmECs //integer that is number of extra curricular activities
	 * @param hrsEmp //integer that is number of hours employed
	 * @param mEQAO //integer that is the result of the math EQAO
	 */
	public Grade9(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int mEQAO) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.mathEQAO = mEQAO;
	}

	/**
	 * Prints if parameter has greater EQAO score
	 * Prints if parameter has less EQAO score
	 * Prints if parameter has equal EQAO score
	 * 
	 * @param s1 //parameter is a student, must be an instanceOf Grade9
	 */
	
	public void compareTo(Student s1) {
		if (this.mathEQAO > ((Grade9)s1).mathEQAO) {
			System.out.println(this.fName + " " + this.lName + " has a greater score than " + s1.fName + " " + s1.lName);
		} else if (this.mathEQAO < ((Grade9)s1).mathEQAO) {
			System.out.println(this.fName + " " + this.lName + " has a lesser score than " + s1.fName + " " + s1.lName);
		} else {
			System.out.println(this.fName + " " + this.lName + " has an equal score to " + s1.fName + " " + s1.lName);
		}
	}
	
	/*
	 * Getter for the math EQAO score
	 */
	public int getmEqao() {
		return mathEQAO	;
	}
	
	/*
	 * Setter for the math EQAO score
	 */
	public void setmEqao(int newEQAO) {
		this.mathEQAO = newEQAO;
	}

	/**
	 * toString method, prints out the super from Student, adds the EQAO and the Grade
	 */
	public String toString() {
		String s = super.toString();
		s += "Math EQAO score: " + mathEQAO + "\n";
		s += "Grade 9";
		return s;
	}
}

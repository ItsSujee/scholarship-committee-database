/**
 * Class Name: Grade12
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *
 */
public class Grade12 extends Student {

	/**
	 * new field that is only for Grade12 Students, top post secondary choice average
	 */
	int topPostChoiceAvg;

	/**
	 * Constructor for Grade12
	 * 
	 * @param stuNumber //integer that is the student number
	 * @param fNme //String that is the first name
	 * @param lNme //String that is the last name
	 * @param DOB //String that is the date of birth format (DD/MM/YY)
	 * @param avgMrks //double that is the average of the marks
	 * @param vlHrs //integer that is the number of volunteer hours completed
	 * @param nmECs //integer that is number of extra curricular activities
	 * @param hrsEmp //integer that is number of hours employed
	 * @param topPost //integer that is the top post secondary choice average
	 */
	public Grade12(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int topPost) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.topPostChoiceAvg = topPost;
	}

	/**
	 * Returns -1 if parameter has greater topPostChoiceAvg score
	 * Returns +1 if parameter has less topPostChoiceAvg score
	 * Returns 0 if parameter has equal topPostChoiceAvg score
	 * 
	 * @param s1
	 */
	public int compareTo(Student s1) {
		if (this.topPostChoiceAvg > ((Grade12)s1).topPostChoiceAvg) {
			return +1;
		} else if (this.topPostChoiceAvg < ((Grade12)s1).topPostChoiceAvg) {
			return -1;
		} else {
			return 0;
		}
	}
	
	/**
	 * toString method, prints out the super from Student, adds the Top University choice average and the Grade
	 */
	public String toString() {
		String s = super.toString();
		s += "Top university choice enterence average: " + topPostChoiceAvg + "\n";
		s += "Grade 12";
		return s;
	}

}

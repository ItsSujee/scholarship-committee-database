/**
 * Class Name: Student
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 * Abstract class that makes the "template" for the grade classes
 *
 */
public abstract class Student {

	/**
	 * protected variables that are available for every class that extends Student
	 */
	protected String fName;
	protected String lName;
	protected int studentNum;
	protected String dateOfBirth;
	protected double avgMarks;
	protected int volHrs;
	protected int numOfExtraCurr;
	protected int hrsEmplyed;

	/**
	 * Constructor for Student Class
	 * 
	 * @param stuNumber //integer that is the student number
	 * @param fNme //String that is the first name
	 * @param lNme //String that is the last name
	 * @param DOB //String that is the date of birth format (DD/MM/YY)
	 * @param avgMrks //double that is the average of the marks
	 * @param vlHrs //integer that is the number of volunteer hours completed
	 * @param nmECs //integer that is number of extra curricular activities
	 * @param hrsEmp //integer that is number of hours employed
	 */
	public Student(int stuNumber, String fNme, String lNme, String DOB,  double avgMrks, int volHrs, int nmECs, int hrsEmp) {
		this.studentNum = stuNumber;
		this.fName = fNme; 
		this.lName = lNme;
		this.dateOfBirth = DOB;
		this.avgMarks = avgMrks;
		this.volHrs = volHrs;
		this.numOfExtraCurr = nmECs;
		this.hrsEmplyed = hrsEmp;
	}

	/**
	 * Abstract compareTo method, to compare the values of the integers that is specific to the class
	 * @param s1
	 * @return 
	 */
	public abstract void compareTo(Student s1);

	/**
	 * Getter method for the Date of Birth
	 * @return dateOfBirth //returns the String date of birth in format (DD/MM/YY)
	 */
	public String getDOB() {
		return this.dateOfBirth;
	}

	/**
	 * Getter method for Student Number
	 * @return studentNum //returns the integer that is the student number
	 */
	public int getStudentNum() {
		return this.studentNum;
	}

	/**
	 * Getter method for Average Marks
	 * @return avgMarks //returns the double that is the average marks
	 */
	public double getAvg(){
		return this.avgMarks;
	}

	/**
	 * Getter method for Volunteer Hours
	 * @return volHrs //returns the integer that is the volunteer hours
	 */
	public int getVolHrs(){
		return this.volHrs;
	}

	/**
	 * Getter method for Hours Employed
	 * @return hrsEmplyed
	 */
	public int getHrsEmp(){
		return this.hrsEmplyed;
	}

	/**
	 * Getter method for Number of Extracurricular activities
	 * @return numOfExtraCurr //returns the integer that is the number of extracurricular
	 */
	public int getNumOfExtraCurr() {
		return this.numOfExtraCurr;
	}

	/**
	 * Setter method to change Average
	 * @param newAvg //input a double for the new average mark
	 */
	public void changeAvg(double newAvg){
		this.avgMarks = newAvg;
	}

	/**
	 * Setter method to change Volunteer Hours
	 * @param newHrs //input an integer for the new number of volunteer hours
	 */
	public void changeVolHrs(int newHrs){
		this.volHrs = newHrs;
	}

	/**
	 * Setter method to change the number of Extracurricular activities
	 * @param newECs //input an integer for the new number of extracurricular activities
	 */
	public void changeECs(int newECs){
		this.avgMarks = newECs;
	}

	/**
	 * Setter method to change the number of Hours Employed
	 * @param newHrs //input an integer for the new number of hours employed
	 */
	public void changeHrsEmplyed(int newHrs){
		this.hrsEmplyed = newHrs;
	}

	/**
	 * toString method, returns out all the Student information
	 */
	public String toString(){
		String s = "First name: " + fName + "\n";
		s += "Last name: " + lName + "\n";
		s += "Student Number: " + studentNum + "\n";
		s += "Date of birth: " + dateOfBirth + "\n";
		s += "Average marks: " + avgMarks + "\n";
		s += "Volunteer hours: " + volHrs + "\n";
		s += "Number of extracurriculars: " + numOfExtraCurr + "\n";
		s += "Hours employed: " + hrsEmplyed + "\n";
		return s;
	}

}

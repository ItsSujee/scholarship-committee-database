public class Student {
	private String fName;
	private String lName;
	private int studentNum;
	private String dateOfBirth;
	private double avgMarks;
	private int volHrs;
	private int numECs;
	private int hrsEmplyed;

	public Student(int stuNumber, String fNme, String lNme, String DOB,  double avgMrks, int vlHrs, int nmECs, int hrsEmp) {
		this.fName = fNme;
		this.lName = lNme;
		this.studentNum = stuNumber;
		this.dateOfBirth = DOB;
		this.avgMarks = avgMrks;
		this.volHrs = vlHrs;
		this.numECs = nmECs;
		this.hrsEmplyed = hrsEmp;
	}
	public int getStudentNum() {
		return this.studentNum;
	}
	public double getAvg(){
		return this.avgMarks;
	}
	public int getVolHrs(){
		return this.volHrs;
	}
	public int getHrsEmp(){
		return this.hrsEmplyed;
	}
	
	public void changeAvg(double newAvg){
		this.avgMarks = newAvg;
	}
	public void changeVolHrs(int newHrs){
		this.volHrs = newHrs;
	}
	public void changeECs(int newECs){
		this.avgMarks = newECs;
	}
	public void changeHrsEmplyed(int newHrs){
		this.hrsEmplyed = newHrs;
	}
	public String toString(){
		String s = "First name: " + fName + "\n";
		s += "Last name: " + lName + "\n";
		s += "Student Number: " + studentNum + "\n";
		s += "Date of birth: " + dateOfBirth + "\n";
		s += "Average marks: " + avgMarks + "\n";
		s += "volHrs: " + volHrs + "\n";
		s += "Number of extracurriculars: " + numECs + "\n";
		s += "Hours employed: " + hrsEmplyed + "\n";
		return s;
	}
}
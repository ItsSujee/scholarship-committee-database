
public class Grade10 extends Student {
	
	private int OSSLT;
	
	public Grade10(int stuNumber, String fNme, String lNme, String DOB, double avgMrks, int vlHrs, int nmECs, int hrsEmp, int osslt) {
		super(stuNumber, fNme, lNme, DOB, avgMrks, vlHrs, nmECs, hrsEmp);
		this.OSSLT = osslt; 
	}
	public String toString() {
		String s = super.toString();
		s += "OSSLT score: " + OSSLT + "\n";
		s += "Grade 10";
		return s;
	}

}
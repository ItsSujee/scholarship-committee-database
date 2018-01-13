import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {
	Scanner in = new Scanner(System.in);
	
	ArrayList<Student> stuList = new ArrayList<Student>();
	
	public void addCandidate() {
		System.out.println("Please enter student grade:");
		int stuGrade = in.nextInt();
		System.out.println("Please enter student number:");
		int stuNum = in.nextInt();
		System.out.println("Please enter average marks:");
		double avgMarks = in.nextInt();
		System.out.println("Please enter voluenteer hours:");
		int volHrs = in.nextInt();
		System.out.println("Please enter number of extracurriculars:");
		int ECs = in.nextInt();
		System.out.println("Please enter hours employed:");
		int hrsEmplyed = in.nextInt();
		System.out.println("Please enter students first name:");
		String fName = in.nextLine();
		System.out.println("Please enter students last name:");
		String lName = in.nextLine();
		System.out.println("Please enter students date of birth in format DD/MM/YY:");
		String DOB = in.nextLine();
		if(stuGrade == 9) {
			System.out.println("Please enter math EQAO score:");
			int mEQAO = in.nextInt();
			stuList.add(new Grade9(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, mEQAO));
		}
		else if(stuGrade == 10) {
			System.out.println("Please enter OSSLT score:");
			int OSSLTscore = in.nextInt();
			stuList.add(new Grade10(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, OSSLTscore));
		}
		else if(stuGrade == 11) {
			stuList.add(new Grade11(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed));
		}
		else {
			System.out.println("Please enter top post secondary choice:");
			String topPost = in.nextLine();
			stuList.add(new Grade12(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, topPost));
		}
		
	}
	
	public void removeCandidate(int stuNum) {
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getStudentNum() == stuNum) {
				stuList.remove(i);
			}
		}
	
	}
	
	public void modifyCandidate() {
		System.out.println("Enter student number: ");
		int stuNum = in.nextInt();
		boolean grade12 = false;
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getStudentNum() == stuNum) {
				if(stuList.get(i) instanceof Grade12) {
					grade12 = true;
				}
			}
		}
		System.out.println("Select would you like to modify:");
		System.out.println("1. Marks average");
		System.out.println("2. Number of volunteer hours");
		System.out.println("3. Number of extracurriculars");
		System.out.println("4. Number of hours employed");
		if(grade12){
			System.out.println("5. Top post secondary choice");
		}
		int choice = in.nextInt();
		if(choice == 1) {
			System.out.println("Enter new marks average:");
			int newAvg = in.nextInt();
			for(int i = 0; i < stuList.size(); i++) {
				if(stuList.get(i).getStudentNum() == stuNum) {
					stuList.get(i).changeAvg(newAvg);
				}
			}
		}
		else if(choice == 2) {
			System.out.println("Enter new number of voulunter hours:");
			int newHrs = in.nextInt();
			for(int i = 0; i < stuList.size(); i++) {
				if(stuList.get(i).getStudentNum() == stuNum) {
					stuList.get(i).changeVolHrs(newHrs);
				}
			}
		}
		else if(choice == 3) {
			System.out.println("Enter new number of extracurriculars:");
			int newECs = in.nextInt();
			for(int i = 0; i < stuList.size(); i++) {
				if(stuList.get(i).getStudentNum() == stuNum) {
					stuList.get(i).changeECs(newECs);
				}
			}
		}
		else if(choice == 4) {
			System.out.println("Enter new number of hours employed:");
			int newHrs = in.nextInt();
			for(int i = 0; i < stuList.size(); i++) {
				if(stuList.get(i).getStudentNum() == stuNum) {
					stuList.get(i).changeHrsEmplyed(newHrs);
				}
			}
		}
		else {
			System.out.println("Enter new top post secondary choice:");
			int newAvg = in.nextInt();
			for(int i = 0; i < stuList.size(); i++) {
				if(stuList.get(i).getStudentNum() == stuNum) {
					stuList.get(i).changeAvg(newAvg);
				}
			}
		}
	}
	
	public void highestAvg() {
		
	}
	
	public void highestVolHrs() {
		
	}
	
	public void highestEmplHrs() {
		
	}
	
	public void findCandidate() {
		
	}
	
	public void sortAvg() {
		
	}
	
	public void sortVolHrs() {
		
	}
	
	public void loadFile() {
		
	}
	
	public void saveFile() {
		
	}
	
	public String toString() {
		String s = "hi";
		return s;
	}

}

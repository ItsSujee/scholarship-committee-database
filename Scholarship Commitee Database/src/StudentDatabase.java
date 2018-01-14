import java.util.ArrayList;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;


public class StudentDatabase {

	static Scanner in = new Scanner(System.in);

	

	static ArrayList <Student> stuList;

	

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

		double avg = 0;

		int index = 0;

		// goes through the whole array list

		for(int i = 0; i < stuList.size(); i++) {

			if(stuList.get(i).getAvg() > avg){

				avg = stuList.get(i).getAvg();

				index = i;

			}

		}

		System.out.println(stuList.get(index).toString()); // print out the student info

	}

	

	public void highestVolHrs() {

		int volHrs = 0;

		int index = 0;

		for(int i = 0; i < stuList.size(); i++) {

			if(stuList.get(i).getVolHrs() > volHrs){

				volHrs = stuList.get(i).getVolHrs();

				index = i;

			}

		}

		System.out.println(stuList.get(index).toString()); 

	}

	

	public void highestEmplHrs() {

		int emplHrs = 0;

		int index = 0;

		for(int i = 0; i < stuList.size(); i++) {

			if(stuList.get(i).getHrsEmp() > emplHrs){

				emplHrs = stuList.get(i).getHrsEmp();

				index = i;

			}

		}

		System.out.println(stuList.get(index).toString()); 

	}

	

	

	public int findCandidate(int stuNum) {

		for(int i = 0; i < stuList.size(); i++) {

			if(stuList.get(i).getStudentNum() == stuNum){

				System.out.println(stuList.get(i).toString()); 

				return 0;

			}

		}

		return -1;

		

	}

	

	public void sortAvg() {

		for(int i = 1; i < stuList.size(); i++){

			double k = stuList.get(i).getAvg();

			int j = i-1;

			

			while(j >= 0 && stuList.get(j).getAvg() > k){

				stuList.set(j+1, stuList.get(j));

				j = j-1;

			}

			stuList.set(j+1, stuList.get(i));

			

		}

	}

	

	public void sortVolHrs() {

		for(int i = 1; i < stuList.size(); i++){

			double k = stuList.get(i).getVolHrs();

			int j = i-1;

			

			while(j >= 0 && stuList.get(j).getVolHrs() > k){

				stuList.set(j+1, stuList.get(j));

				j = j-1;

			}

			stuList.set(j+1, stuList.get(i));

			

		}

	}

	public void listCandidates() {

		for(int i = 0; i < stuList.size(); i++) {

			System.out.println(stuList.get(i).toString());

		}

	}

	public void clearList() {

		stuList.clear();

	}

	

	public static void loadFile(String fn) {

		// TODO Auto-generated method stub
				double avgMarks=0;
				int stuNum =0, grade =0, size=0, ECs =0, volHrs, hrsEmplyed;
				String fName=null, lName=null, DOB = null;

				Scanner s = null;
				try {

					s = new Scanner(new BufferedReader(new FileReader(fn))); //finds file name  
					//Initializes size to arrays
					size = Integer.parseInt(s.next());
					System.out.print("Loading staff from file: "+fn+" with "+size+" students.");
					System.out.println();
					for(int i = 0; i < size; i++)
					{
						//Collects required fields 
						fName = s.next();
						lName  = s.next();
						grade = Integer.parseInt(s.next());
						stuNum = Integer.parseInt(s.next());
						avgMarks = Double.parseDouble(s.next());
						volHrs = Integer.parseInt(s.next());
						ECs= Integer.parseInt(s.next());
						hrsEmplyed = Integer.parseInt(s.next());
						if(grade == 9) {
							System.out.println("Please enter math EQAO score:");
							int mEQAO = in.nextInt();
							stuList.add(new Grade9(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, mEQAO));
						}
						else if(grade == 10) {
							System.out.println("Please enter OSSLT score:");
							int OSSLTscore = in.nextInt();
							stuList.add(new Grade10(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, OSSLTscore));
						}

						else if(grade == 11) {
							stuList.add(new Grade11(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed));
						}

						else {

							System.out.println("Please enter top post secondary choice:");
							String topPost = in.nextLine();
							stuList.add(new Grade12(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, topPost));

						}

					}

					//if file is not found
				} catch( FileNotFoundException e){
					System.out.println(":( It seems like the file is missing. :(");
				} finally {
					if (s!=null){
						s.close();//closes file
					}
				}

			

	}

	

	public static void saveFile(String fn) {

		// TODO Auto-generated method stub
				System.out.println("Saving staff to file: "+fn);
				System.out.println();

				File file = new File(fn); //sets file name
				PrintWriter pw=null;
				try {
					pw = new PrintWriter(file);
					// write size to file
					pw.println(stuList.size()); //writes # students

					for(int i=0; stuList.size()>i; i++){ 
						Student st = stuList.get(i);
						//writes super fields, employee number, first name, and last name
						pw.println(st.fName); 
						pw.println(st.lName);
						pw.println(st.getDOB());
						
						if(st instanceof Grade9) {
							pw.println("Grade 9");
						}
						if(st instanceof Grade10) {
							pw.println("Grade 10");
						}
						if(st instanceof Grade11) {
							pw.println("Grade 11");
						}
						if(st instanceof Grade12) {
							pw.println("Grade 12");
						}
						pw.println(st.getStudentNum());
						pw.println(st.getAvg());
						pw.println(st.getVolHrs());
						pw.println(st.getNumECs());
						pw.println(st.getHrsEmp());
						if(st instanceof Grade9) {
							pw.println(Grade9.mathEQAO);
						}
						if(st instanceof Grade10) {
							pw.println(Grade10.OSSLT);
						}
						if(st instanceof Grade11) {
							pw.println("Grade 11: no score");
						}
						if(st instanceof Grade12) {
							pw.println(Grade12.topPostChoice);
						}

					}//end of for loop
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					if(pw != null){
						pw.close();
					}
				} 

	}

	





}

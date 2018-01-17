import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * Class Name: StudentDatabase
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *
 */
public class StudentDatabase {

	//input Scanner
	static Scanner in = new Scanner(System.in);

	//Create arrayList to store the list of Student objects
	static ArrayList <Student> stuList = new ArrayList <Student>();

	/**
	 * Add a Candidate to the arrayList, all information must filled out
	 */
	public static void addCandidate() {
		System.out.print("\n" + "Please enter student grade:");
		int stuGrade = Integer.parseInt(in.nextLine());

		System.out.print("Please enter student number:");
		int stuNum = Integer.parseInt(in.nextLine());

		System.out.print("Please enter students first name:");
		String fName = in.nextLine();

		System.out.print("Please enter students last name:");
		String lName = in.nextLine();

		System.out.print("Please enter students date of birth in format DD/MM/YY:");
		String DOB = in.nextLine();

		System.out.print("Please enter average marks:");
		double avgMarks = Double.parseDouble(in.nextLine());

		System.out.print("Please enter volunteer hours:");
		int volHrs = Integer.parseInt(in.nextLine());

		System.out.print("Please enter number of extracurriculars:");
		int ECs = Integer.parseInt(in.nextLine());

		System.out.print("Please enter hours employed:");
		int hrsEmplyed = Integer.parseInt(in.nextLine());

		if(stuGrade == 9) {

			System.out.print("Please enter math EQAO score:");

			int mEQAO = Integer.parseInt(in.nextLine());

			stuList.add(new Grade9(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, mEQAO));

			System.out.println("\n" + "Grade 9 Student Added" + "\n");

		}

		else if(stuGrade == 10) {

			System.out.print("Please enter OSSLT score:");

			int OSSLTscore = Integer.parseInt(in.nextLine());

			stuList.add(new Grade10(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, OSSLTscore));

			System.out.println("\n" + "Grade 10 Student Added" + "\n");

		}

		else if(stuGrade == 11) {

			System.out.print("Please enter Math Contest score:");

			int mathContest = Integer.parseInt(in.nextLine());

			stuList.add(new Grade11(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, mathContest));

			System.out.println("\n" + "Grade 11 Student Added" + "\n");

		}

		else {

			System.out.print("Please enter top post secondary choice average:");

			int topPost = Integer.parseInt(in.nextLine());

			stuList.add(new Grade12(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, topPost));

			System.out.println("\n" + "Grade 12 Student Added" + "\n");

		}
	}

	/**
	 * Remove a student from the database by student number
	 * Prints out if the removal was successful or not
	 * 
	 * @param stuNum //parameter must be integer of the student number
	 */
	public static void removeCandidate(int stuNum) {
		boolean flag = false;
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getStudentNum() == stuNum) {
				stuList.remove(i);
				flag = true;
				System.out.println("Student successfully removed" + "\n");
			}
		}
		if (!flag) {
			System.out.println("Student was not found" + "\n");
		}
	}

	/**
	 * Modify the contents of a student
	 */
	public static void modifyCandidate() {

		System.out.print("Enter student number: ");

		int stuNum = Integer.parseInt(in.nextLine());

		boolean grade12 = false;

		for(int i = 0; i < stuList.size(); i++) {

			if(stuList.get(i).getStudentNum() == stuNum) {

				if(stuList.get(i) instanceof Grade12) {

					grade12 = true;

				}

			}

		}

		System.out.println("Select what you would like to modify:");

		System.out.println("1. Marks average");

		System.out.println("2. Number of volunteer hours");

		System.out.println("3. Number of extracurriculars");

		System.out.println("4. Number of hours employed");

		if(grade12){

			System.out.println("5. Top post secondary choice");

		}

		System.out.println("Your choice:");
		int choice = Integer.parseInt(in.nextLine());

		if(choice == 1) {

			System.out.print("Enter new marks average:");

			int newAvg = Integer.parseInt(in.nextLine());

			for(int i = 0; i < stuList.size(); i++) {

				if(stuList.get(i).getStudentNum() == stuNum) {

					stuList.get(i).changeAvg(newAvg);

				}

			}

		}

		else if(choice == 2) {

			System.out.print("Enter new number of voulunter hours:");

			int newHrs = Integer.parseInt(in.nextLine());

			for(int i = 0; i < stuList.size(); i++) {

				if(stuList.get(i).getStudentNum() == stuNum) {

					stuList.get(i).changeVolHrs(newHrs);

				}

			}

		}

		else if(choice == 3) {

			System.out.print("Enter new number of extracurriculars:");

			int newECs = Integer.parseInt(in.nextLine());

			for(int i = 0; i < stuList.size(); i++) {

				if(stuList.get(i).getStudentNum() == stuNum) {

					stuList.get(i).changeECs(newECs);

				}

			}

		}

		else if(choice == 4) {

			System.out.print("Enter new number of hours employed:");

			int newHrs = Integer.parseInt(in.nextLine());

			for(int i = 0; i < stuList.size(); i++) {

				if(stuList.get(i).getStudentNum() == stuNum) {

					stuList.get(i).changeHrsEmplyed(newHrs);

				}

			}

		}

		else if(grade12){

			System.out.print("Enter new top post secondary choice:");

			int newAvg = Integer.parseInt(in.nextLine());

			for(int i = 0; i < stuList.size(); i++) {

				if(stuList.get(i).getStudentNum() == stuNum) {

					stuList.get(i).changeAvg(newAvg);

				}

			}

		}

	}



	public static void highestAverage() {

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



	public static void highestVolHrs() {

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

	//i must == 0
	public static void findCandidate(int stuNum, int i) {  

		if (i < stuList.size()) {

			if (stuList.get(i).getStudentNum() == stuNum) {

				System.out.println(stuList.get(i).toString()); 

			} else {
				findCandidate(stuNum, i+1);   
			}  

		} else {

			System.out.println("User not found in database.");
		}
	}

	public static void highestEmplHrs() {

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

	public static void sortAvg() {

		 int i, j;
		    for (i = 1; i < stuList.size(); i++) {
		        Student tmp = stuList.get(i);
		        j = i;
		        while ((j > 0) && (stuList.get(j - 1).getAvg() > tmp.getAvg())) {
		        	stuList.set(j, stuList.get(j - 1));
		            j--;
		        }
		        stuList.set(j, tmp);
		    }



	}

	public static void sortVolHrs() {

		 int i, j;
		    for (i = 1; i < stuList.size(); i++) {
		        Student tmp = stuList.get(i);
		        j = i;
		        while ((j > 0) && (stuList.get(j - 1).getVolHrs() > tmp.getVolHrs())) {
		        	stuList.set(j, stuList.get(j - 1));
		            j--;
		        }
		        stuList.set(j, tmp);
		    }

	}

	
	public static void listCandidates() {

		for(int i = 0; i < stuList.size(); i++) {

			System.out.println(stuList.get(i).toString());

		}

	}

	public static void clearList() {
		stuList.clear();
	}

	/**
	 * Compares the unique values for each grade: 9 = EQAO, 10 = OSSLT, 11 = Math Contest, 12 = University Average
	 *  Prints out the first and last name of the student who has a greater score than / equal score to / less score than
	 */
	public static void compareStudent() {
		//Print out the input message
		System.out.print("\n" + "Note both students must be in the same grade" + "\n" +"Please enter the student number of your first student:");
		//Get input
		int stuNum1 = Integer.parseInt(in.nextLine());
		//Print out input message
		System.out.print("\n" + "Please enter the student number of your second student");
		//Get input
		int stuNum2 = Integer.parseInt(in.nextLine());

		//Run through the entire array
		for (int i = 0; i < stuList.size(); i++) {
			
			//Find a match with the first student number and a student in the database
			if (stuNum1 == stuList.get(i).getStudentNum()) {
				
				//Run through the entire array
				for (int j = 0; j < stuList.size(); i++) {
					
					//Find a match with the second student number and a student in the database
					if (stuNum2 == stuList.get(j).getStudentNum()) {
						
						//Check if the students are in the same grade
						if (stuList.get(i) instanceof Grade9 && stuList.get(j) instanceof Grade9 || stuList.get(i) instanceof Grade10 && stuList.get(j) instanceof Grade10 || stuList.get(i) instanceof Grade11 && stuList.get(j) instanceof Grade11 || stuList.get(i) instanceof Grade12 && stuList.get(j) instanceof Grade12) {
							
							//Run the compareTo Method
							if (stuList.get(i).compareTo(stuList.get(j)) > 0) {
								
								//Print if the return is +1
								System.out.println(stuList.get(i).fName + " " + stuList.get(i).lName + " has a greater score than " + stuList.get(j).fName + " " + stuList.get(j).lName);
								
							} else if (stuList.get(i).compareTo(stuList.get(j)) == 0) {
								
								//Print if the return is 0
								System.out.println(stuList.get(i).fName + " " + stuList.get(i).lName + " has an equal score to " + stuList.get(j).fName + " " + stuList.get(j).lName);
								
							} else {
								
								//Print if the return is -1
								System.out.println(stuList.get(i).fName + " " + stuList.get(i).lName + " has a less score than " + stuList.get(j).fName + " " + stuList.get(j).lName);
							}
							
						} else {
							//If the students are not in the same grade
							System.out.println("The students are not in the same grade");
						}
					} else {
						//If no match with the second student number and a studetn in the database
						System.out.println("The second student does not exist in the database");
					}
				}
			} else {
				//If no match with the first student number and a student in the database
				System.out.println("The first student does not exist in the database");
			}
		}
	}

	public static void loadFile(String fn) {



		// TODO Auto-generated method stub

		double avgMarks=0;

		int stuNum =0, grade =0, size=0, ECs =0, volHrs = 0, hrsEmplyed = 0, special = 0;

		String fName=null, lName=null, DOB = null, topC = null;



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
				
				DOB = s.next();

				grade = Integer.parseInt(s.next());

				stuNum = Integer.parseInt(s.next());

				avgMarks = Double.parseDouble(s.next());

				volHrs = Integer.parseInt(s.next());

				ECs= Integer.parseInt(s.next());

				hrsEmplyed = Integer.parseInt(s.next());
				
				special = Integer.parseInt(s.next());

				if(grade == 9) {

					
					

					stuList.add(new Grade9(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, special));

				}

				else if(grade == 10) {

					

					

					stuList.add(new Grade10(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, special));

				}



				else if(grade == 11) {
					
					stuList.add(new Grade11(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed));

				}

				else if( grade == 12) {
				
				   
					
					stuList.add(new Grade12(stuNum, fName, lName, DOB, avgMarks, volHrs, ECs, hrsEmplyed, special));
					
				}

				else {



					
					System.out.println(":( Incorrect file format");


				}



			}



			//if file is not found

		} catch( FileNotFoundException e){

			System.out.println(":( It seems like the file is missing. :(");

		} finally {

			if (s!=null){
				System.out.println("/nDone.");
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
				pw.println(st.getNumOfExtraCurr());
				pw.println(st.getHrsEmp());
				if(st instanceof Grade9) {
					pw.println(((Grade9)st).mathEQAO);
				}
				if(st instanceof Grade10) {
					pw.println(((Grade10)st).osslt);
				}
				if(st instanceof Grade11) {
					pw.println("Grade 11: no score");
				}
				if(st instanceof Grade12) {
					pw.println(((Grade12)st).topPostChoiceAvg);
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

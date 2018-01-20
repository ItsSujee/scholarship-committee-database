import java.util.Scanner;

/**
 * Class Name: EIMDexe
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 * Main program tester file, deals with the user input and output
 *
 */
public class EIMDexe {

	public static void main(String[] args) {
		//Ask for input
		System.out.println("Welcome to the Educational Institution Management Database; Scholarship Selection Made Easy" + "\n");

		askForInput();

		//scanner for input
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		//boolean to check if needed to Close program
		boolean toClose = false;

		//runs while program is set not to Close
		while (toClose != true) {

			//case statements	
			switch (userInput) {

			case "0": //Exit program
				confirmClose();
				String exitConfirm = sc.nextLine();
				if (exitConfirm.equals("1")) {
					toClose = true;
				} else {
					toClose = false;
				}
				break;

			case "1": //Add Candidate
				StudentDatabase.addCandidate();
				break;


			case "2": //Remove Candidate
				System.out.print("Please enter your student number:");
				int inputStuNumForRemove = Integer.parseInt(sc.nextLine());
				StudentDatabase.removeCandidate(inputStuNumForRemove);
				break;


			case "3": //Modify Candidate Info
				StudentDatabase.modifyCandidate();
				break;


			case "4": //Search Highest Average
				StudentDatabase.highestAverage();
				break;


			case "5": //Search most volunteer hours
				StudentDatabase.highestVolHrs();
				break;

			case "6": //Search by Student Number
				System.out.print("Enter student number: ");
				int stuNumForFindCan = Integer.parseInt(sc.nextLine());
				StudentDatabase.findCandidate(stuNumForFindCan, 0);
				break;


			case "7": //Search by most employment hours
				StudentDatabase.highestEmplHrs();
				break;


			case "8": //Sort by average
				StudentDatabase.sortAvg();
				break;

			case "9": //Sort by volunteer hours
				StudentDatabase.sortVolHrs();
				break;

			case "10": //Load File
				System.out.print("Enter file name: ");
				String fn = sc.nextLine();
				StudentDatabase.loadFile(fn);
				break;

			case "11": //Save File
				System.out.println("Enter file name:");
				String sn = sc.nextLine();
				StudentDatabase.saveFile(sn);
				break;

			case "12": //List Candidate
				StudentDatabase.listCandidates();
				break;

			case "13": //Compare Students
				StudentDatabase.compareStudent();
				break;

			case "14": //Clear Database
				StudentDatabase.clearList();
				break;

			case "15": //Help
				aboutUs();
				break;

			default:
				error();
				break;

			}

			//check confirmation to close
			if (toClose == true) {break;}

			//ask for next command
			askForInput();

			userInput = sc.nextLine();
		}

		sc.close();

		//Exit Message
		System.out.print("\n" + "Thank you for using the Educational Institution Management Database");

	}


	/**
	 * Prints all the commands possible, and asks for the user input
	 */
	public static void askForInput() {
		//array of input messages
		String [] output = new String [16];
		output[0] = "0: Exit";
		output[1] = "1: Add Candidate";
		output[2] = "2: Remove Candidate";
		output[3] = "3: Modify Candidate Info";
		output[4] = "4: Search for Highest Average";
		output[5] = "5: Search for Most Volunteer Hours";
		output[6] = "6: Search by Student Number";
		output[7] = "7: Search by Most Employment Hours";
		output[8] = "8: Sort by Average";
		output[9] = "9: Sort by Volunteer Hours";
		output[10] = "10: Load file";
		output[11] = "11: Save file";
		output[12] = "12: List Candidates";
		output[13] = "13: Compare Students";
		output[14] = "14: Clear Database";
		output[15] = "15: Help" + "\n";

		//runs through command array
		for (int i = 0; i < output.length; i++ ) {
			//prints the messages for all the indices of the command array
			System.out.print(output[i] + "\n");
		}
		//Ask for user input
		System.out.print("Your Command:");
	}

	/**
	 * Prints the message when the input is invalid
	 */
	public static void error() {
		System.out.println("Opps, looks like you've typed an invalid command" + "\n");
	}

	/**
	 * Prints the message to confirm to close the program
	 */
	public static void confirmClose() {
		System.out.print("\n" + "Did you make sure to save?" + "\n" + "Are you sure that you still want to exit?" + "\n" + "1: Yes" + "\n" +  "2: No" + "\n" + "\n" + "Your Command:");
	}

	/**
	 * Prints information about the program, as well as instructions
	 */
	public static void aboutUs() {
		String s = "\n" + "Who are we?" + "\n" + "\n" + "We are a group of four young men who love to code:" + "\n" + "Sujeethan Vigneswaran" + "\n" + "Aarsh Patel" + "\n" + "Dhruv Bhavsar" + "\n" + "Harry Masaun";
		s += "\n\n" + "Why EIMD?" + "\n" + "EIMD was designed for a scholarship commitee to be able to sift through applicants with ease";
		s += "\n\n" + "What is EIMD?";
		s += "\n" + "EIMD is a database which has a very simplistic user interface for ease of use which you narrow down to personal ";
		s += "\npreference of the scholarship comittie.";
		s += " EIMD aims to assist scholarship comitties to select the most \ndeserving candidate for their scholarship.";
		s += "\n\nHow does EIMD work?";
		s += "\nSimilar to myBlueprint, EIMD works by getting students from various schools to fill out their information according to their grade.";
		s += "This information is then proccessed by our extensive and through code and then further narrowed down using methods which are selected \n";
		s += "the comitties using our code. ";
		s += "\n\nMethods information:";
		s += "\nExit: Exits program.";
		s += "\nAdd Candidate: Adds candidate by getting appropriate information from user and then saves it to the array list.";
		s += "\nRemove Candidate: Removes candidate from the object array list.";
		s += "\nModify Candidate Info: Modifys a specific candidates information that is allowed to be altered.";
		s += "\nSearch for Highest Average: Searches for highest average and then prints candidate.";
		s += "\nSearch for Most Volunteer Hours: Searches for most volunteer hours and then prints candidate.";
		s += "\nSearch by Student Number: Searches for student using student number and then prints.";
		s += "\nSearch by Most Employment Hours: Searches for most employed hours and then prints candidate.";
		s += "\nSort by Average: Sorts by highest average to lowest average.";
		s += "\nSort by Volunteer Hours: Sorts by highest to lowest volunteer hours.";
		s += "\nLoad file: Loads file by getting file name.";
		s += "\nSave file: Saves file using file name.";
		s += "\nList Candidates: Lists all candidates.";
		s += "\nCompare Students: Compares all students.";
		s += "\nClear Database: Deletes all candidates in the database.";
		System.out.println(s);
	}
}

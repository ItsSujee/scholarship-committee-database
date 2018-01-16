import java.util.Scanner;

/**
 * Class Name: EIMDexe
 * @Author: Sujeethan, Harry, Dhruv, Aarsh
 * Date: January 16, 2018
 * School: Lester B. Pearson C.I.
 * Purpose:
 * 
 *
 */
public class EIMDexe {

	public static void main(String[] args) {
		//Ask for input
		System.out.println("Welcome to the Educational Institution Management Database; Scholarship Selection Made Easy" + "\n");

		askForInput();

		Scanner sc = new Scanner(System.in);
		int userInput = Integer.parseInt(sc.nextLine());

		boolean toClose = false;

		while (toClose != true) {

			//case statement			
			switch (userInput) {

			case 0:
				confirmClose();
				int exitConfirm = Integer.parseInt(sc.nextLine());
				if (exitConfirm == 1) {
					toClose = true;
				} else {
					toClose = false;
				}
				break;

			case 1: //Add Candidate
				StudentDatabase.addCandidate();
				break;


			case 2: //Remove Candidate
				System.out.print("Please enter your student number:");
				int inputStuNumForRemove = Integer.parseInt(sc.nextLine());
				StudentDatabase.removeCandidate(inputStuNumForRemove);
				break;


			case 3: //Modify Candidate Info
				StudentDatabase.modifyCandidate();
				break;


			case 4: //Search Highest Average
				StudentDatabase.highestAverage();
				break;


			case 5: //Search most volunteer hours
				StudentDatabase.highestVolHrs();
				break;

			case 6: //Search by Student Number
				int stuNumForFindCan = Integer.parseInt(sc.nextLine());
				StudentDatabase.findCandidate(stuNumForFindCan, 0);
				break;


			case 7: //Search by most employment hours
				StudentDatabase.highestEmplHrs();
				break;


			case 8: //Sort by average
				StudentDatabase.sortAvg();
				break;

			case 9: //Sort by volunteer hours
				StudentDatabase.sortVolHrs();
				break;

			case 10: //Load File
				System.out.println("Enter file name: ");
				String fn = sc.nextLine();
				StudentDatabase.loadFile(fn);
				break;

			case 11: //Save File
				System.out.println("Enter file name:");
				String sn = sc.nextLine();
				StudentDatabase.saveFile(sn);
				break;

			case 12: //List Candidate
				StudentDatabase.listCandidates();
				break;

			case 13: //Compare Students
				
				break;

			case 14: //Clear Database
				StudentDatabase.clearList();
				break;

			case 15: //Help
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

			userInput = Integer.parseInt(sc.nextLine());

		}



		sc.close();

		//input == 0, say exit message

		System.out.print("\n" + "Thank you for using the Educational Institution Management Database");



	}



	public static void askForInput() {

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



		for (int i = 0; i < output.length; i++ ) {

			System.out.print(output[i] + "\n");

		}

		System.out.print("Your Command:");

	}


	public static void error() {

		System.out.println("Opps, looks like you've typed an invalid command");

	}

	public static void confirmClose() {

		System.out.print("\n" + "Did you make sure to save?" + "\n" + "Are you sure that you still want to exit?" + "\n" + "1: Yes" + "\n" +  "2: No" + "\n" + "\n" + "Your Command:");

	}

	public static void aboutUs() {
		String s = "\n" + "Who are we?" + "\n" + "\n" + "We are a group of four young men who love to code:" + "\n" + "Sujeethan Vigneswaran" + "\n" + "Aarsh Patel" + "\n" + "Dhruv Bhavsar" + "\n" + "Harry Masaun";
		String d = "\n" + "\n" + "Why EIMD?" + "\n" + "EIMD was designed for a scholarship commitee to be able to sift through applicants with ease" + "\n\n";

		System.out.print(s + d);
	}
}

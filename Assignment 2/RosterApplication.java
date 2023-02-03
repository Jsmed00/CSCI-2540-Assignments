/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 3
 * RosterApplication
 */

package assg3_Smedleyj18;

/**
 * This is the application that is used to test the 
 * other classes. It also sets up the display that 
 * way you can choose which option you want to use.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RosterApplication {
	public static void main(String[] args) {
		
		Roster rost = new Roster();
		rost.loadData("assg3_roster.txt");
		
		System.out.println("1. Display the roster");
		System.out.println("2. Search for a student");
		System.out.println("3. Add a new student");
		System.out.println("4. Remove a student");
		System.out.println("5. Search for student by major");
		System.out.println("6. Sort and save to file");
		System.out.println("7. Save to file");
		System.out.println("8. Exit");
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		do {
			switch (choice){
		    	case "1":
		    		rost.displayRoster();
		    		break;
		    	case "2":
		    		System.out.println("Enter the id number: ");
		    		String input = scan.nextLine();
		    		rost.searchForStudent(input);
		    		break;
		    	case "3":
		    		System.out.println("Enter the id number: ");
		    		String id = scan.nextLine();
		    		System.out.println("Enter the name: ");
		    		String name = scan.nextLine();
		    		System.out.println("Enter the standing: ");
		    		String standing = scan.nextLine();
		    		System.out.println("Enter the major: ");
		    		String major = scan.nextLine();
		    		rost.addStudent(id, name, standing, major);
		    		break;
		    	case "4":
		    		System.out.println("Type the id of the student you are trying to remove: ");
		    		String remid = scan.nextLine();
		    		rost.removeStudent(remid);
		    		break;
		    	case "5":
		    		System.out.println("Which major would you like to search for? ");
		    		String search = scan.nextLine();
		    		rost.getStudentsByMajor(search);
		    		break;
		    	case "6":
		    		rost.sort();
		    		rost.Save();
		    		break;
		    	case "7":
		    		rost.Save();
		    		break;
		    	case "8":
		    		rost.Save();
		    		System.exit(0);
		}
		}while((choice = scan.nextLine()) != "9");
			
		    	
		    	
		}
		}
		
		
		
		
		
		
		

		
	
	


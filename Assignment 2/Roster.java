/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 2
 * Roster
 */



package assg3_Smedleyj18;

/**
 * The Roster class is where all of the code for the interface
 * is created and handled.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Roster implements RosterInterface {
	
	private String fileName = "assg3_roster.txt";
	private Student student;
	private boolean isChanged;
	private ArrayList <Student> studentList;
	
	
	/**
	 * This will load the data that is stored in
	 * the file.
	 */
	@Override
	public void loadData(String filename) {
		String id = null;
		String name = null;
		String standing = null;
		String major = null;
		File file = new File(filename);
		studentList = new ArrayList<Student>();
		
		try {
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				
					id = scan.nextLine();

					name = scan.nextLine();

				//*	standing = scan.nextLine();
					
					major = scan.nextLine();

					student = new Student(id, name, standing, major);
					studentList.add(student);
			}
		   
			scan.close();
		}
		
		catch (FileNotFoundException e) {
			System.out.println(filename + " Not Found");
			System.exit(0);
		}
	}

	/**
	 * This will display the roster that is in the file.
	 */
	@Override
	public void displayRoster() {
		try {
			String file = "assg3_roster.txt";
			Scanner scanner = new Scanner(new File(file));

			while (scanner.hasNextLine()){
		   System.out.println(scanner.nextLine());
			}
			scanner.close();
		}

		catch(FileNotFoundException e){
			
			System.out.println(e.getMessage());
			System.exit(1);
		}

	}

	/**
	 * This will search the file for the student
	 * based on the id given.
	 */
	@Override
	public Student searchForStudent(String id) {
		for(Student student : studentList) {
			if(student.getId().equals(id)) {
				return student;
			}
		}
		return null;
	}

	/**
	 * This will add a student based on the info given
	 * to the file.
	 */
	@Override
	public boolean addStudent(String id, String name, String standing, String major) {
		boolean exist = false;
		for(Student student : studentList) {
			if(student.getId().equals(id)) {
				exist = true;
				System.out.println("The student you have entered already exists.");
			}
		}
		if(exist) {
			return false;
		}
		else {
			Student student = new Student(id, name, standing, major);
			studentList.add(student);
			System.out.println(student);
			isChanged = true;
			return true;
			
		}
	}

	/**
	 * This will remove a student from the file
	 * if the id number given is already stored.
	 */
	@Override
	public boolean removeStudent(String id) {
		boolean check = false;
		Student remove = null;
		for(Student student : studentList) {
			if(student.getId().contentEquals(id)) {
				check = true;
				remove = student;
			}
		}
			if(check) {
				studentList.remove(remove);
				isChanged = true;
				return true;
				
			}
			else {
				System.out.println("The student you have entered does not exist.");
				return false;
			}
		}


	/**
	 * This will get all of the students with the same
	 * major as the one given.
	 */
	@Override
	public ArrayList<Student> getStudentsByMajor(String major) {
		ArrayList<Student> majors = new ArrayList<Student>();
		for(Student student : studentList) {
			if(student.getMajor().equals(major)) {
				majors.add(student);
			}
		}
		return majors;

	}

	/**
	 * This will sort all of the students in the file
	 * by their id number.
	 */
	@Override
	public void sort() {
		ArrayList<Student> ids = new ArrayList<Student>();
		for(Student student : studentList) {
			Collections.sort(ids);
			ids.add(student);
		}
		
	}

	/**
	 * This will save the new data to the file.
	 */
	@Override
	public void Save() {
		if (isChanged) {
			File file = new File(fileName);
			FileOutputStream file_stream;
			try {
				file_stream = new FileOutputStream(file);
				BufferedWriter buffWriter= new BufferedWriter(new OutputStreamWriter(file_stream));
				for (Student student : studentList) {
					buffWriter.write(student.getId());
					buffWriter.newLine();
					buffWriter.write(student.getName());
					buffWriter.newLine();
					//*buffWriter.write(student.getStanding());
					buffWriter.newLine();
					buffWriter.write(student.getMajor());
					buffWriter.newLine();
				}
				buffWriter.close();
			} 
			
			catch (FileNotFoundException e) {
				System.out.println(fileName + " Not Found");
			}
			
			catch (IOException e) {
				System.out.println("Caught an IO Exception");
				e.printStackTrace();
			}
		}
	}

}














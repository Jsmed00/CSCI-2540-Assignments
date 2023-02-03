/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 3
 * RosterInterface
 */

package assg3_Smedleyj18;

/**
 * The RosterInterface is the interface file for the Roster.
 */

import java.util.ArrayList;

public interface RosterInterface {
	
	/**
	 * The method loads the data containing all the Student
	 * entries from a given file.
	 * @param file_name
	 */
	
	public void loadData(String file_name);
	
	/**
	 * displays the complete information of all the students 
	 * on the roster.
	 */
	
	public void displayRoster();
	
	/**
	 * This will search through the file for a specific student.
	 * @param id
	 * @return
	 */
	
	public Student searchForStudent(String id);
	
	/**
	 * This method is used to add a new Student.
	 * If the id is already in the roster,
	 * then a message should be printed informing the
	 * user that the student already exists.
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 * @return
	 */
	
	public boolean addStudent(String id, String name, String standing, String major);
	
	/**
	 * It should remove the Student from the roster
	 * if the id is found. Otherwise it should print a message.
	 * @param id
	 * @return
	 */
	
	public boolean removeStudent(String id);
	
	/**
	 * should return an ArrayList object with all the
	 * students with the given major. If there is no student
	 *  with the given major, the size of the ArrayList will be zero.
	 * @param major
	 * @return
	 */
	
	public ArrayList<Student> getStudentsByMajor(String major);
	
	/**
	 *  It should sort all the students by their id.
	 */
	
	public void sort();
	
	/**
	 * It should write the roster back to the
	 * file if the data has been changed. 
	 * The same file is used for both reading and writing. 
	 * @return
	 */
	
	public void Save();

}

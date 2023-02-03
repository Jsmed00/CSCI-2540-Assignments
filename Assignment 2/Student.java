/**
 * CSCI 2540
 * @author Jonathan Smedley
 * Assignment 3
 * Student
 */



package assg3_Smedleyj18;

/**
 * The student class is used to define a student and 
 * give all the parameters to one.
 */

public class Student implements Comparable <Student>{
	
	public String id;
	public String name;
	public String standing;
	public String major;
	
	/**
	 * Sets all of the parameters for id, name, standing,
	 * and the major of a student.
	 * @param identification
	 * @param stuName
	 * @param stand
	 * @param maj
	 */
	
	public Student(String identification, String stuName, String stand, String maj) {
		id = identification;
		name = stuName;
		standing = stand;
		major = maj;
	}
	
	/**
	 * Gets the id for the student.
	 * @return
	 */
	
	public String getId() {
		return id;
	}
	
	/**
	 * Gets the name for the student.
	 * @return
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the standing from the student.
	 * @return
	 */
	
	public String getStanding() {
		return standing;
	}
	
	/**
	 * Gets the major for the student.
	 * @return
	 */
	
	public String getMajor() {
		return major;
	}
	
	/**
	 * Sets the id for the student.
	 * @param newId
	 */
	
	public void setId(String newId) {
		id = newId;
	}
	
	/**
	 * Sets the name for the student.
	 * @param newName
	 */
	
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Sets the standing for the student.
	 * @param newStanding
	 */
	
	public void setStanding(String newStanding) {
		standing = newStanding;
	}
	
	/**
	 * Sets the major for the student.
	 * @param newMajor
	 */
	
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	
	/**
	 * Converts all of the info into a string.
	 */
	
	public String toString() {
		return ("ID: " + id + "\n" +
				"Name: " + name + "\n" +
				"Standing: " + standing + "\n" +
				"Major: " + major + "\n");
	}
	
	/**
	 * Checks to see if two id's are equal to eachother.
	 * @param eq
	 * @return
	 */
	
	public boolean equals(Student eq) {
		if(eq == null) {
			return false;
		}
		if(eq instanceof Student) {
			Student temp = (Student)eq;
			return (this.id == temp.id);
		}
		else {
			return false;
		}
	}
	
	/**
	 * Compares one student to another so it can
	 * sort them by id's.
	 */
	
	public int compareTo(Student stud) {
		Student comp = (Student) stud;
		return this.getId().compareTo(comp.getId());
	}
	

}





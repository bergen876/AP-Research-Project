package johnShop;

import java.io.Serializable;

public class Students implements Serializable {
	private int studentID;
	private String Name;
	
	
	
	public Students(int studentID, String name) {
		super();
		this.studentID = studentID;
		Name = name;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Students() {
		studentID= 0;
		Name="";
		
	}
	
	
	
	

}

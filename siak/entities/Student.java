package id.ac.undiksha.siak.entities;

public class Student extends Person {
	private String nim;
	private String studyProgram;
	private String faculty;
	private String department;

	public Student() {
		super();
		this.department		= "<invalid department>";
		this.nim			= "<invalid nim>";
		this.studyProgram 	= "<invalid study program>";
		this.faculty		= "<invalid faculty>";
	}
	
	public void printAllInfo() {
		System.out.println("NIM: "				+ this.nim);
		System.out.println("Name: "				+ getName());
		System.out.println("Address: "			+ getAddress());
		System.out.println("Study Program: "	+ this.studyProgram);
		System.out.println("Department: "		+ this.department);
		System.out.println("Faculty: "			+ this.faculty);
		
		System.out.println("Gender: " + (getGender() ? "Male" : "Female"));
	}
	
	
	public Student(String name, String address, boolean gender, String nim, String studyProgram, String department, String faculty ) {
		super(name, address, gender);
		this.nim = nim;
		this.studyProgram = studyProgram;
		this.faculty = faculty;
		this.department = department;
	}
	
	
	
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

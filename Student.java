//Pierson Roby-Mayner
public class Student extends Person{
	
	private int studentID;
	private double gpa;
	private String major;
	
	//default constructor
	public Student() {
		super();	//calls the Person'd default constructor
		this.studentID = 1234;
		this.gpa = 1;
		this.major = "no major selected";
	}
	//parameterized constructor
	public Student(String xName, int xAge, int xID, double xGPA, String xMajor) {
		super(xName, xAge);	//calls person's parameterized constructor
		this.setStudentID(xID);
		this.setGPA(xGPA);
		this.setMajor(xMajor);
	}
	//accessors
	public int getStudentID() {
		return this.studentID;
	}
	public double getGPA() {
		return this.gpa;
	}
	public String getMajor() {
		return this.major;
	}
	//mutator
	public void setStudentID(int xID) {
		if(xID > 0) {
			this.studentID = xID;
		}
		else
			System.out.println("Invalid value for student ID!");
	}
	public void setGPA(double xGPA) {
		if(xGPA >= 1 && xGPA <= 4) {
			this.gpa = xGPA;
		}
		else
			System.out.println("Invalid GPA entered");
	}
	public void setMajor(String xMajor) {
		if(xMajor.equalsIgnoreCase("Computer Science") || xMajor.equalsIgnoreCase("Computer Information Systems") || xMajor.equalsIgnoreCase("Computer Engineering") || xMajor.equalsIgnoreCase("Nursing") || xMajor.equalsIgnoreCase("Psychology")) {
			this.major = xMajor;
		}
		else
			System.out.println("Invalid major selected!");
	}
	//method overriding - same method signature but different methodality
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Student ID: " + this.studentID + "\nGPA: " + this.gpa + "\nMajor: " + this.major);
	}
}

//Pierson Roby-Mayner
public class Undergraduate extends Student {

	private String minor;
	private int level;
	
	public Undergraduate () {
		super();	//calls students default constructor
		this.minor = "Unknown";
		this.level = 1;
	}
	public Undergraduate(String xName, int xAge, int xID, double xGPA, String xMajor, String xMinor, int xLevel) {
		super(xName, xAge, xID, xGPA, xMajor);
		this.setMinor(xMinor);
		this.setLevel(xLevel);
	}
	public String getMinor () {
		return this.minor;
	}
	public int getLevel () {
		return this.level;
	}
	public void setMinor (String xMinor) {
		if(xMinor.equalsIgnoreCase("Business") || xMinor.equalsIgnoreCase("Dance") || xMinor.equalsIgnoreCase("English") || xMinor.equalsIgnoreCase("History")) {
			this.minor = xMinor;
		}
		else
			System.out.println("Invalid value for student major!");
	}
	public void setLevel (int xLevel) {
		if(xLevel >= 1 && xLevel <= 4) {
			this.level = xLevel;
		}
		else
			System.out.println("Invalid value entered for student level!");
	}
	public void writeOutput() {
		super.writeOutput(); //calls Student's writeOutput()
		System.out.println("Minor: " + this.minor + "\nSudent Level: " + this.level);
		
	}
}

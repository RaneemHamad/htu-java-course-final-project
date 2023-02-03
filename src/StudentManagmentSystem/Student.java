package StudentManagmentSystem;

public class Student extends User{
	 
	    private double GPA;
	    
	    public Student(int id, String firstName, String lastName, int age, double GPA) {
	        super(id, firstName, lastName, age);
	        this.GPA = GPA;	
	    }
	    
	    public void setGPA(double GPA) {
	        this.GPA = GPA;
	    }
	    
	    public double getGPA() {
	        return GPA;
	    }
			
	}


	
	



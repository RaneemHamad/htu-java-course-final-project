package StudentManagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;

class StudentManagmentSystem {
	
	private static StudentManagmentSystem studentManagementSystem;
	
	// why ArrayList is used?
	private ArrayList<LearningActivity> learningActivities;
	private ArrayList<Student> students;
	private HashMap<LearningActivity, ArrayList<Assignment>> assignments;
	
	int studentIdCounter;
	int CourseIdCounter;
	int AssignmentIdCounter;

	public StudentManagmentSystem() {
		this.studentIdCounter = this.CourseIdCounter = this.AssignmentIdCounter = 1;
		this.assignments = new HashMap<>();
		this.learningActivities = new ArrayList();
		this.students = new ArrayList();
	}
	
	public static StudentManagmentSystem getIntance() {
		if (studentManagementSystem == null) {
			return new StudentManagmentSystem();
		}
		return studentManagementSystem;
	}
	
	public ArrayList<LearningActivity> getLearningActivities(){
		return this.learningActivities;
	}
	
	public ArrayList<Student> getStudents(){
		return this.getStudents();
	}
	
	public HashMap<LearningActivity, ArrayList<Assignment>> getAssignments(){
		return this.assignments;
	}
	
    public boolean addStudent(String fullName,int age ,double GPA) {
    	// get first and last name
    	String[] fullNameSplit = fullName.split(" ");
    	String firstName = fullNameSplit[0], lastName = fullNameSplit[1];
    	// create student
    	Student student = new Student(this.studentIdCounter, firstName, lastName, age, GPA);
    	// add student
    	this.students.add(student);
    	this.studentIdCounter++;
    	
    	OnStudentCreated.handle(student);
    	
    	return true;
    }
    
	public boolean deleteStudent(int id) {
		// search for the student to delete
		int studentIndex = -1;
		for(int i=0; i<this.students.size(); i++) {
			Student student = this.students.get(i);
			if (student.getId() == id)
				studentIndex = i;
		} 
		if (studentIndex > -1) {
			this.students.remove(studentIndex);
			return true;
		}
		// student id does not exist, return false
		return false;
	}
	
	public LearningActivity getLearningActivityByTitle(String title) {
		LearningActivity learningActivity = null;
		for (LearningActivity la: this.learningActivities) {
			if (la.getTitle() == title) {
				return la;
			}
		}
		return learningActivity;
	}
	
	public boolean assignStudent(LearningActivity learningActivity, Student student) {
		// look for assignment if exists
		ArrayList<Assignment> learningActivityAssignments = this.assignments.getOrDefault(learningActivity, new ArrayList());
		for (Assignment assignment: learningActivityAssignments) {
			if (assignment.getStudent().getId() == student.getId()) {
				// already assigned
				return false;
			}
		}
		
		// create assignment
		Assignment assignment = null;
		if (learningActivity instanceof Course) {
			// create course assignment
			CourseAssignment courseAssignment = new CourseAssignment(student, (Course) learningActivity);
			learningActivityAssignments.add(courseAssignment);
			assignments.put(learningActivity, learningActivityAssignments);
		}
		return true;
	}

}


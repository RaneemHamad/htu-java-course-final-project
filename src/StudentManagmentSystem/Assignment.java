package StudentManagmentSystem;

public class Assignment {
	private Student student;
	private int grade;
	private boolean passed;
	private LearningActivity learningActivity;
	
	public Assignment(Student student, LearningActivity learningActivity) {
		this.student = student;
		this.learningActivity = learningActivity;
	}
	
	public Student getStudent() {
		return this.student;
	}
}

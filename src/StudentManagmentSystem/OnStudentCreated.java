package StudentManagmentSystem;


public class OnStudentCreated extends EventHandler{
	public static String[] REQUIRED_COURSES = {"Introduction-to-pearson", "STEM"};
	
	public static void handle(Student student) {
		// assign user courses
		StudentManagmentSystem studentManagementSystem = StudentManagmentSystem.getIntance();
		for (String courseTitle: REQUIRED_COURSES) {
			Course course = (Course) studentManagementSystem.getLearningActivityByTitle(courseTitle);
			studentManagementSystem.assignStudent(course, student);
		}
	}
}

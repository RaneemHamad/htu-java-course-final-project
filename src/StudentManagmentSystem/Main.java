package StudentManagmentSystem;

public class Main {
	public static void main(String[] args) {
	       
       
        
        Student s1 = new Student("John Doe", 20, "Computer Science", 3.5);
        Student s2 = new Student("Jane Doe", 21, "Mathematics", 3.8);
        Student s3 = new Student("Bob Smith", 22, "Physics", 3.2);
        
       Object system;
		/* std1.addStudent(s1);
        s.addStudent(s2);
        system.addStudent(s3);
        */
        Student[] students = system.getAllStudents();
        for (Student student : students) {
            if (student == null) {
                break;
            }
            
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Program: " + student.getProgram());
            System.out.println("GPA: " + student.getGPA());
           
        }
    }

}

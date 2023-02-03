package StudentManagmentSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// initialize Student Management System
		StudentManagmentSystem studentManagementSystem = StudentManagmentSystem.getIntance();
		
     	/*
     	 * Operations to be performed:
     	 * 1- List Students
     	 * 2- List Assignments
     	 * 3- Add Student
     	 * 4- Add Course
     	 * 5- Assign 
     	 * 
     	*/
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Select Option");
			String option = scanner.nextLine();
			
			
			
			if (Integer.parseInt(option) == 1){
				ArrayList<Student> students = studentManagementSystem.getStudents();
				for (Student student: students) {
					System.out.print(student.getId());
				}
			}
			
			else if (Integer.parseInt(option) == 2){
				HashMap<LearningActivity,ArrayList<Assignment>> assignments = studentManagementSystem.getAssignments();
				
			}
			
			else if (Integer.parseInt(option) == 3){
				System.out.println("Get ready to create a new student!");
				String fullName = scanner.nextLine();
				int age = scanner.nextInt();
				double gpa = scanner.nextDouble();
				
				studentManagementSystem.addStudent(fullName, age, gpa);
				
			}
			
			else if (Integer.parseInt(option) == 4){
				
			}
			
			else if (option == "5"){
				
			}
	        
		}
	}
}

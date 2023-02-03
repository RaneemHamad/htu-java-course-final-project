package Team;

import java.util.Random;

public class ASB {

	public static void main(String[] args) {
		// Create a new Random object
		Random random = new Random();
		
		// Create an array of Team objects with a size of 10
		Team[] teams = new Team[10];
		
		// Array of names for the teams
		String[] names = { "Coders-HTU", "Syntax-JU", "Fast-JU", "BugFree-UJ", "Smooth-PSUT",
		                   "Speedy-PIU", "Efficient-STU", "Precise-OKH", "Swift-CU", "Bright-HU" };
		
		// Initialize the team ID
		int id = 100;
		
		// Loop through the teams array and assign values to each team
		for (int i = 0; i < 10; i++) {
		  teams[i] = new Team(id++, names[i], random.nextInt(11), random.nextInt(301));
		}
		
		// Call the sortTeams method to sort the teams based on the number of solved questions and elapsed time
		Team.sortTeams(teams);
		
		// Print the header for the table
		System.out.println("##################################################################");
		System.out.println("# Rank # Team ID # Team Name # Solved Questions # Elapsed Time #");
		System.out.println("#################################################################");
		
		// Loop through the teams array and print the information for each team
		for (int i = 0; i < 10; i++) {
			System.out.println("# " + (i + 1) + " \t# " + teams[i].id + " \t # " + teams[i].getName() + " \t# " + teams[i].getSolved() + "/10   # " + teams[i].getElapsedTime() + "\t #");
		}
	}
}
package Team;
public class Team {
    // The ID of the team
    public int id;

    // The name of the team
    private String name;

    // The number of problems solved by the team
    private int solved;

    // The total elapsed time (in minutes) taken by the team to solve problems
    private int elapsedTime;
  
    // Constructor to initialize the team with given ID, name, number of problems solved, and elapsed time
    public Team(int id, String name, int solved, int elapsedTime) {
      this.id = id;
      this.setName(name);
      this.setSolved(solved);
      this.setElapsedTime(elapsedTime);
    }

    // A static method to sort the teams in descending order of number of problems solved
    public static void sortTeams(Team[] teams) {
		for (int i = 0; i < teams.length - 1; i++) {
			for (int j = 0; j < teams.length - i - 1; j++) {
					if (teams[j].getSolved() < teams[j + 1].getSolved()) 
					{
						// Swap the teams if number of problems solved by team j is less than team j+1
						Team temp = teams[j];
						teams[j] = teams[j + 1];
					   teams[j + 1] = temp;
				}
			}
		}
	}

    // Getter method to return the number of problems solved
	public int getSolved() {
		return solved;
	}

    // Setter method to set the number of problems solved
	public void setSolved(int solved) {
		this.solved = solved;
	}

    // Getter method to return the name of the team
	public String getName() {
		return name;
	}

    // Setter method to set the name of the team
	public void setName(String name) {
		this.name = name;
	}

    // Getter method to return the elapsed time
	public int getElapsedTime() {
		return elapsedTime;
	}

    // Setter method to set the elapsed time
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
}





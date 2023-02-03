package StudentManagmentSystem;

public class User {
	
	private int id;
	private String firstName, lastName;
	private int age;
	
	public User(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public int getId() {
		return this.id;
	}

	public void setFirstName(String val) {
		this.firstName = val;
	}
	
	public void setLastName(String val) {
		this.lastName = val;
	}

}

import java.util.Calendar;


public class Teacher extends Human {
	
	private String address;
	private String skill;
	
	public Teacher(String name, String surname, Calendar birthdate, String address, String skill) {
		super(name, surname, birthdate);
		this.address=address;
		this.skill=skill;
	}

}

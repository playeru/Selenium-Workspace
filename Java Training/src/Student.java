import java.util.Calendar;


public class Student extends Human {
	
	private Integer score;
	private String classroom; 
	
	public Student (String name, String surname, Calendar birthdate, Integer score, String classroom) {
		super(name, surname, birthdate);
		this.score=score;
		this.classroom=classroom;
	}
	
	public String toString() {
		return "{Name: " + name.toString() +", Surname: " + surname.toString() +", Birthdate: " + birthdate.getTime().toString() + ", Score: " + score.toString() +",Classroom: " + classroom.toString()+"}";
	}
	
}

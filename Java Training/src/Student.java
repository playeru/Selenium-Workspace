
public class Student extends Human {
	
	private Score score;
	private Classroom classroom; 
	
	public Student (Name name, Surname surname, Birthdate birthdate, Score score, Classroom classroom) {
		super(name, surname, birthdate);
		this.score=score;
		this.classroom=classroom;
	}
	
	

}
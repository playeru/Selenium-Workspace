import java.util.Calendar;


public class Main {
	public static void main(String[] args) {
		
		
		
		Student[] students = new Student[3];
		
		
		Calendar cal = Calendar.getInstance();
	    cal.set(2000, 1, 1);
	    
		// first student
		Name name = new Name("burak");
		Surname surname = new Surname("sarac");	
		Birthdate birthdate = new Birthdate(cal);
		Score score = new Score(3);
		Classroom classroom = new Classroom("java101");
		
		
		
		

		//
		//then create a Main class with main method. After create an array of students and add those students:

		//	Student1: name: burak surname:sarac bdate: 01.01.2000 score:3, classroom:java101


		//	Student2: name: tomas surname:lucovic bdate: 01.01.2000 score:3, classroom:java101


		//	Student3: name: jan surname:havranek bdate: 01.01.2000 score:3, classroom:java101


		//	Student4: name: matej surname:duras bdate: 01.01.2000 score:3, classroom:java101


		//	Student5: name: viktor surname:tymoshchuk bdate: 01.01.2000 score:3, classroom:java101


		//	when you write 3 class, then ask user to enter student name and surname, if student doesnt exist throw a nullpointer exception


		//	If you need anything just please let me know

		
		
		
	}

}

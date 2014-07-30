import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		
		
		
		List<Student> students = new ArrayList<Student>();
		
		
		Calendar cal = Calendar.getInstance();
	    cal.set(2000, 1, 1);
	    
		// creating and adding student1
		String name = "burak";
		String surname = "sarac";	
		Calendar birthdate = cal;
		Integer score = 3;
		String classroom = "java101";
		Student student1 = new Student(name, surname, birthdate, score, classroom);
		students.add(student1);

		// creating and adding student2
		name = "tomas";
		surname = "lucovic";	
		Student student2 = new Student(name, surname, birthdate, score, classroom);
		students.add(student2);
		
		// creating and adding student3
		name = "jan";
		surname = "havranek";	
		Student student3 = new Student(name, surname, birthdate, score, classroom);
		students.add(student3);
		
		// creating and adding student4
		name = "matej";
		surname = "duras";	
		Student student4 = new Student(name, surname, birthdate, score, classroom);
		students.add(student4);
		
		// creating and adding student5
		name = "viktor";
		surname = "tymoshchuk";	
		Student student5 = new Student(name, surname, birthdate, score, classroom);
		students.add(student5);
						

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nEnter the name: ");
		String nameprompt = null;
		try {
			nameprompt = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nEnter the surname: ");
		try {
			String surnameprompt = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		for (Student s : students) {
			System.out.println(nameprompt + " " + s.name);
			if (nameprompt==s.name)  {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
		

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

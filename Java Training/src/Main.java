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
	    Calendar birthdate = cal;
		Integer score = 3;
		String classroom = "java101";
	    
		// creating and adding student1
		String name = "burak";
		String surname = "sarac";	
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
						

		// prompting user to enter name and surname from command line
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nEnter the name: ");
		String nameprompt = null;
		String surnameprompt = null;
		try {
			nameprompt = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nEnter the surname: ");
		try {
			surnameprompt = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Boolean isFound = false;
		
		// checking is student with name and surname from prompt is in list of students
		
		for (Student s : students) {
			
			if (nameprompt.equals(s.name) && surnameprompt.equals(s.surname))  {
				System.out.println("yes");
				isFound=true;
				break;
			}
		}
		
		// throwing exception if student not found
		
		if(isFound==false)
	      {
	           throw new NullPointerException("return value is null at method AAA");
	      } else {
	    	  System.out.println("Student was found");
	}
		
		
	}

}

package Assignment_1.Q_7;

public class StudentsMarks extends StudentCourse  {
	
	
	
	    int marks;

	    void inputResult(String name, int idNo, int age, String course, int marks) {
	        inputStudent(name, idNo, age, course);
	        this.marks = marks;
	    }

	    void displayResult() {
	    	displayStudent();
	        System.out.println("Marks: " + marks);
	    }

		

		
	   
	}


package Assignment_1.Q_7;

public class StudentCourse extends Student implements Swim,Cricket {

	
	    String course;

	    void inputStudent(String name, int idNo, int age, String course) {
	        input(name, idNo, age); 
	        this.course = course;
	    }

	    void displayStudent() {
	        display(); 
	        System.out.println("Course: " + course);
	    }
	    @Override
		public void cricket() {
			// TODO Auto-generated method stub
			System.out.println("Cricket Score = 100");
			
		}

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println(" swim Score = 50");
			
		}
	}


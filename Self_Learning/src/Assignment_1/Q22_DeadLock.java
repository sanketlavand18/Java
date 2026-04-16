package Assignment_1;

public class Q22_DeadLock  implements runnable{
	
	
	    String name;
	    int marks;

	    Q22_DeadLock(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    public void run() {
	        System.out.println(name + " scored " + marks);
	    }
	}


	    public static void main(String[] args) {

	        List<Student> list = Arrays.asList(
	                new Student("Rahul", 85),
	                new Student("Priya", 92),
	                new Student("Amit", 78)
	        );

	        for (Student s : list) {
	            new Thread(s).start();
	        }
	    }


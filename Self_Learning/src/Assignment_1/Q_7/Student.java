package Assignment_1.Q_7;

public class Student extends School{
	
	    String name;
	    int idNo;
	    int age;

	    void input(String name, int idNo, int age) {
	        this.name = name;
	        this.idNo = idNo;
	        this.age = age;
	    }

	    void display() {
	    	print();
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + idNo);
	        System.out.println("Age: " + age);
	    }
	}
	


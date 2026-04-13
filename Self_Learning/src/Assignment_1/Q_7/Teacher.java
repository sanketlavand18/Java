package Assignment_1.Q_7;

public class Teacher extends School {
	String name;
	int id;
	 void set(int id,String name) {
		
		this.name = name;
		this.id = id;
	}
	
	void display()
	{
		print();
		System.out.println("Teacher id: " +id);
		System.out.println("Teacher name: "+ name);
	}

}

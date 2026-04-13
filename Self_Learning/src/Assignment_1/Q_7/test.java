package Assignment_1.Q_7;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int choice=0;
		
		do {
			System.out.println("Single Level Inheritance: 1");
			System.out.println("multi Level Inheritance: 2");
			System.out.println("Hierarchical Level Inheritance: 3");
			System.out.println("multipal Inheritance: 4");
			System.out.println("Hybrid Inheritance: 5 ");
			System.out.println("Exit : 6");
			 System.out.println("-------------------------------");
			 System.out.println("Enter your choice");
			
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1->{
					StudentCourse s = new StudentCourse();
			        s.inputStudent("Sanket", 101, 20, "Java");

			        System.out.println("Single Level Inheritance:");
			        s.displayStudent();
					 System.out.println("-------------------------------");
			        
				}
				case 2->{
					StudentsMarks m = new StudentsMarks();
			        m.inputResult("Sanket", 101, 20, "Java",65);

			        System.out.println("multi Level Inheritance:");
			       m.displayResult();
					 System.out.println("-------------------------------");
			        
				}
				case 3->{
					 System.out.println("Heirarchical Inheritance:");
					 StudentCourse s = new StudentCourse();
				        s.inputStudent("Sanket", 101, 20, "Java");
				        s.displayStudent();
			        System.out.println("**********************");
				        Teacher t = new Teacher();
				        t.set(101,"mohan sir");
				        t.display();
						 System.out.println("-------------------------------");
			        
				}
				case 4->{
					
					StudentCourse s = new StudentCourse();
			        s.inputStudent("Sanket", 101, 20, "Java");

			        System.out.println("Multipal Inheritance:");
			        s.displayStudent();
			        s.cricket();
			        s.swim();
					 System.out.println("-------------------------------");
				}
				case 5->{
					StudentsMarks s = new StudentsMarks();
			        s.inputStudent("Sanket", 101, 20, "Java");

			        System.out.println("Hybrid Inheritance:");
			        s.displayResult();
			        s.cricket();
			        s.swim();
					 System.out.println("-------------------------------");
			        
				}
				case 6->{
					
			        sc.close();
			        System.out.println("Thank u for checking");
					 System.out.println("-------------------------------");
				}
			}
		}
		while(choice!=6);
		
		
				        	
		       }
		}
		
	

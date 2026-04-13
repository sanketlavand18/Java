package Assignment_1;

import java.io.FileReader;

public class Q12_UserDefinedException {
	
	
 //Unchecked Exception ..........
	public void ageUnchecked(int age) {
		if (age < 18) {
			throw new UserDefinedException("Age is less than 18 (Unchecked)");
		 } 
		else {
			System.out.println("You are eligible (Unchecked)");
		 }
	}


	//Unchecked Exception ..........
	 void readFile(String name) throws UserDefinedCheckedException {
		 try {
			 FileReader fr = new FileReader(name);
			 fr.read();				System.out.println("File opened");
		} catch (Exception e) {
			System.out.println("File not Found ");
		}
		
	}

}

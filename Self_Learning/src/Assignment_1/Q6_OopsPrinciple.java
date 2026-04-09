package Assignment_1;

public abstract class Q6_OopsPrinciple {
	
	//Encapsulation
	
	private int number;
	private String name;
	private String Batch;
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBatch() {
		return Batch;
	}

	public void setBatch(String batch) {
		Batch = batch;
	}


	//Abstraction
	public abstract void display();
	
	

}

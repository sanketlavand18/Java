package Assignment_1;

import java.util.*;

public class Q11_EmpCollection implements Comparable<Q11_EmpCollection> {

	private int id;
	private String name;
	private Double sal;
	private String desg;

	public Q11_EmpCollection(int id, String name, Double sal, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.desg = desg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	// comparable
	@Override
	public int compareTo(Q11_EmpCollection other) {
		// TODO Auto-generated method stub
		System.out.println("Comparable");
		return Integer.compare(this.id, other.id);
	}

	public String toString() {
		return id + " " + name + " " + sal + " " + desg;

	}

}

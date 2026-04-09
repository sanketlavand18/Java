package Assignment_1;

public class Q1 {

	public static void main(String[] args) {
		
		//Autoboxing
		int a=10;
		Integer b=a;
		System.out.println(b);
		
		// AutoUnboxing
		int num=b;
		System.out.println(num);
		
		// Explicitely Boxing
		int no=12;
		Double xy=Double.valueOf(no);
		System.out.println(xy);
		
		//Explisitelu Unboxing
		
		Integer d=10;
		int g=(int) d;
		System.out.println(g);
		

	}

}

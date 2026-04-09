package Assignment_1;

public class Q2WrapperClassMethods {

	public static void main(String[] args) {
		// valueof()
		System.out.println("Valueof()");
		int num =100;
		Integer obj=Integer.valueOf(num);
		System.out.println(obj);
		
		//ParseInt()
		System.out.println("parseInt()");
		String s="40";
		int value=Integer.parseInt(s);
		int value2=Integer.parseInt("100");
		System.out.println(value);
		System.out.println(value2);
		
		//tostring()
		System.out.println("toString()");
		int n=40;
		String h=Integer.toString(n);
		System.out.println(h);
		
		//intvaliue()
		System.out.println("IntValue()");
		Integer pro=40;
		int x=pro.intValue();
		System.out.println(x);
		
		//compareTo()
		System.out.println("CompareTo()");
		Integer y=50;
		Integer z=10;
		System.out.println(y.compareTo(z));
		
		//equals()
		System.out.println("equals()");
		System.out.println(y.equals(z));
		
		//min()
		Integer p=15;
		Integer q=25;
		System.out.println("min()");
		System.out.println(Integer.min(p,q));
		
		//max
		System.out.println("max()");
		System.out.println(Integer.max(p, q));
		
		//sum
		System.out.println("sum()");
		System.out.println(Integer.sum(p, q));
	}

}

package Assignment_1;

public class Q3_StringMethods {

	public static void main(String[] args) {
		
		String st="Welcome to Java";
		String s="welcome to java";
		
		System.out.println(st);
		System.out.println(s);
		System.out.println(".....Methods in String....");
		
		System.out.println("lenght(): " +st.length());
		System.out.println("Uppeecase(): "+ st.toUpperCase());
		System.out.println("Lowercase(): " +st.toLowerCase());
		System.out.println("equals(): " +st.equals(s));
		System.out.println("equalsignorecase(): " +st.equalsIgnoreCase(s));
		System.out.println("contains(): " +st.contains("to"));
		System.out.println("indexof(): " +st.indexOf('o'));
		System.out.println("lastindexof(): " +st.lastIndexOf('o'));
		System.out.println("substring(): " +st.substring(4));
		System.out.println("Replace(): " +st.replace('a','p'));
		System.out.println("Trim(): " +st.trim());
		System.out.println("concat(): " +st.concat(s));
		System.out.println("charat(): " +st.charAt(3));
		System.out.println("is empty(): " +st.isEmpty());
		System.out.println("Startwith(): " +st.startsWith("welcome"));
		System.out.println("endwith(): " +st.endsWith("java"));
		
		

	}

}

package Operators;

public class ComparisonOperators
{
	public static void main(String[] args) 
	{
		// a & b are variables
		int a = 5, b = 3;
		
		// this operators always return either true or false
		System.out.println("a == b : " + (a==b)); // output : false
		System.out.println("a > b : " + (a>b)); // output : true
		System.out.println("a < b : " + (a<b)); // output : false
		System.out.println("a >= b : " + (a>=b)); // output : true
		System.out.println("a <= b : " + (a<=b)); // output : false
		
		// with String 
		String s1 = "PARTH", s2 = "parth"; // s1 is uppercase and s2 is lowercase (java is case sensitive)
		System.out.println("s1 == s2 : " + (s1 == s2)); // output : false
		System.out.println("s1.equals(s2) : " + s1.equals(s2)); // output : false
		System.out.println("s1.equalsIgnoreCase(s2) : " + s1.equalsIgnoreCase(s2)); // output : true
	}
}

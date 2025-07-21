package Operators;

public class ArithmeticOperators 
{
	public static void main(String[] args) 
	{
		// n1 and n2 are 2 variables with different data types
		long n1 = 10;
		float n2 = 5.5f;
		System.out.println("Addition : " + (n1 + n2)); // (10 + 5.5) : 15.5
		System.out.println("Subtraction : " + (n1 - n2)); // (10 - 5.5) : 4.5
		System.out.println("Multiplication : " + (n1 * n2)); // (10 * 5.5) : 55.0
		System.out.println("Division : " + (n1 / n2)); // (10 / 5.5) : 1.8181819 // quotient
		System.out.println("Modulus : " + (n1 % n2)); // (10 % 5.5) : 4.5 // reminder
	
		int i = 2;
		// 2 ways of increment and decrement
		System.out.println("Post Increment : " + i++); // print i = 2 than 2 + 1 : i = 3
		System.out.println("Post Decrement : " + i--); // print i = 3 than 3 - 1 : i = 2
		System.out.println("Pre Increment : " + ++i); // print i = 2 + 1 = 3
		System.out.println("Pre Decrement : " + --i); // print i = 3 - 1 = 2
		
		// all arithmetic operation in a single line of code
		int a = 1, b = 2, c = 3, d = 4; // multiple declaration and implementation (same data type)
		System.out.println("Arithmetic Operators : " + (a + c - b * d / b % a)); // output : 4
	}
}

package Operators;

public class AssignmentOperators 
{
	public static void main(String[] args) 
	{
		// here a & b & c are variables 
		int a =10, b=20;
		int c;
		
		System.out.println("c = a : " + (c=a)); // output : 10 : c = 10
		System.out.println("a += b : a = a + b : " + (a+=b)); // output : 30 : a = 30
		System.out.println("a -= b : a = a - b : " + (a-=b)); // output : 10 : a = 10
		
		System.out.println("a *= b : a = a * b : " + (a*=b)); // output : 200 : a = 200
		System.out.println("a /= b : a = a / b : " + (a/=b)); // output : 10 : a = 10
		System.out.println("a %= b : a = a % b : " + (a%=b)); // output : 10 : a = 10
		
		// logical operation
		System.out.println("Logical Operations :");
		System.out.println("AND : a &= b : a = a & b : " + (a^=b)); // AND output : 30 : a = 30
		System.out.println("OR : a |= b : a = a | b : " + (a^=b)); // OR output : 10 : a = 10
		System.out.println("XOR : a ^= b : a = a ^ b : " + (a^=b)); // XOR output : 30 : a = 30
		System.out.println("Complement : " + ~a); // Complement output : -31 : a = 30
		System.out.println("Left Shift : a <<= 2 : a = a << 2 : " + (a<<=2)); // Left Shift output : 120 : a = 120
		System.out.println("Right Shift : a >>= 2 : a = a >> 2 : " + (a<<=2)); // Right Shift output : 480 : a = 480
	}
}

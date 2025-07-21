package variables_and_data_types;

public class Variables 
{
	public static void main(String[] args) 
	{
		// here firstName and lastName are variables 
		String firstName = "Parth";
		String lastName = "Sabhani";
		System.out.println(firstName + " " + lastName); // output : Parth Sabhani
		
		lastName = "Patel";
		System.out.println(firstName + " " + lastName); // output : Parth Patel
		
		firstName = "Krish";
		System.out.println(firstName + " " + lastName); // output : Krish Patel
		
		// below define all are variables (b, s, a, l, f, c, bool) (but they all have different data types)
		byte b; short s; int a; long l; float f; char c; boolean bool;
		
	}
}

package ControlFlowStatement;

public class ExactValueMatching 
{
	public static void main(String[] args) 
	{
		String day = "Monday";
		
		// condition
		switch(day)
		{
		case "Sunday":
			System.out.println("Today : Sunday");
		case "Monday":
			System.out.println("Today : Monday");
		case "Tuesday":
			System.out.println("Today : Tuesday");
		case "Wednesday":
			System.out.println("Today : Wednesday");
		case "Thursday":
			System.out.println("Today : Thursday");
		case "Friday":
			System.out.println("Today : Friday");
		case "Saturday":
			System.out.println("Today : Saturday");
		}
		
		// output :  
		//	Today : Monday
		//	Today : Tuesday
		//	Today : Wednesday
		//	Today : Thursday
		//	Today : Friday
		//	Today : Saturday

	}
}

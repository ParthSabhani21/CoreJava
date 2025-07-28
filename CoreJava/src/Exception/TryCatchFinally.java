package Exception;

public class TryCatchFinally 
{
	public static void main(String[] args) 
	{
		int[] numbs = {1, 2, 3};
		try 
		{					
			// this line show exception (IndexOutOfBoundsException)
			System.out.println(numbs[3]);
		}
		catch(IndexOutOfBoundsException ex) // catch that exception
		{
			System.out.println("error : array is of length : " + (numbs.length - 1) + " only");
		}
		finally // this will execute whether error happens or not 
		{
			System.out.println("this is finally block");
		}
	}
}

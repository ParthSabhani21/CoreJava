package Exception;

public class Throw 
{
	public static void main(String[] args) 
	{
		int a = 1, b = 3;

		if(5 > (a + b))
		{
			throw new ArithmeticException("invalid : (a + b) is less than 5");	
		}
	}
}

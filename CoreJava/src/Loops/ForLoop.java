package Loops;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		// way 1 (declaration of variable inside for)
		System.out.println("First Appraoch");
		for(int i=0 ; i<5 ; i++) // declaration : condition : increment / decrement
		{
			System.out.println("i : " + i); // print 0 1 2 3 4
		}
		
		// way 2 (declaration of variable outside for)
		System.out.println("Second Appraoch");
		int j =5;
		for( ; j>0 ; j--) // only condition : increment / decrement
		{
			System.out.println("j : " + j); // print 5 4 3 2 1
		}
		
		// way 3
		System.out.println("Third Appraoch");
		int k=1;
		for( ; k<6 ;) // only condition
		{
			System.out.println("k = " + (k++)); // print 1 2 3 4 5
		}
	}
}

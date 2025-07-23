package Loops;

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		// way 1 (single condition)
		System.out.println("First Appraoch");
		int i=0;
		while(i<5)
		{
			System.out.println("i : " + i);
			i++;
		}
		
		// way 2 (multiple condition)
		System.out.println("Second Appraoch");
		int j=1;
		while(i<10 && j<5)
		{
			System.out.println("i : " + i + " : j : " + j);
			i++;
			j++;
		}
	}
}

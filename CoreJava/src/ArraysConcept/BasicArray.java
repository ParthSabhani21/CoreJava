package ArraysConcept;

import java.util.Arrays;

public class BasicArray 
{
	public static void main(String[] args) 
	{
		String[] names = {"parth", "krish", "raj"};
			
		// way 1 : print data inside array
		System.out.println("Way 1 : ");
		for(int i=0; i<names.length; i++) 
		{
			System.out.println(i + " : " + names[i]);
		}
		
		// way 2
		System.out.println("Way 2 : ");
		int i=0;
		for(String n : names) 
		{
			System.out.println((i++) + " : " + n);
		}
		
		// way 3
		System.out.println("Way 3 : ");
		System.out.println(Arrays.toString(names));
	}
}

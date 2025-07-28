package WrapperClass;

import java.util.ArrayList;

public class UnBoxing 
{
	public static void main(String[] args) 
	{
		int n = 24;
		
		ArrayList<Integer> arrayList
        = new ArrayList<Integer>();
    
		// adding primitive value to Integer object array list
		arrayList.add(n);

		// unboxing : get method returns an Integer object
		int num = arrayList.get(0);

		// printing the values from primitive data types
		System.out.println(num);
	}
}

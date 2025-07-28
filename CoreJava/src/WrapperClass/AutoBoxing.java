package WrapperClass;

import java.util.ArrayList;

public class AutoBoxing 
{
	public static void main(String[] args) 
	{
		char c = 'a';
		
		// Autoboxing : primitive to Character object
		Character ch = c;
		
		ArrayList<Integer> arrayList
        = new ArrayList<Integer>();

		// Autoboxing : ArrayList stores only objects
        arrayList.add(25);

	}
}

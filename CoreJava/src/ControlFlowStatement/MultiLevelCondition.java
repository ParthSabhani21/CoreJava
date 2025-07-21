package ControlFlowStatement;

public class MultiLevelCondition 
{
	public static void main(String[] args) 
	{
		int a = 8, b = 5, c = 2;
		
		// condition (IF true : this after that inside condition check)
		if(a > b)
		{
			System.out.println("a > b");
			if(b > c)
			{
				System.out.println("b > c");
			}
		}
	}
}

package ControlFlowStatement;

public class TwoWayCondition 
{
	public static void main(String[] args) 
	{
		int a = 2, b = 5;
		
		// condition (IF true : this ELSE that)
		if(a > b)
		{
			System.out.println("a > b");
		}else
		{
			System.out.println("a < b");
		}
	}
}

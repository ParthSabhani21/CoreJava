package ControlFlowStatement;

public class MultipleCondition 
{
	public static void main(String[] args) 
	{
		int a = 8, b = 5;
		
		// condition (IF : this ELSE IF : this ELSE : that)
		if(a < b)
		{
			System.out.println("a < b");
		}else if(a > b)
		{
			System.out.println("a > b");
		}else
		{
			System.out.println("a == b");
		}
	}
}

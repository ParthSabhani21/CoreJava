package OOPs;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		Overriding or = new Overriding();
		System.out.println("Sum : " + or.sum(5, 2));
		System.out.println("Sum : " + or.sum(5, 2, 1));
		or.sub(7, 3);
	}
}

// class for overloading
class Overloading
{
	public int sum(int n1, int n2)
	{
		return n1 + n2;
	}
	
	//	same method with different parameter
	public int sum(int n1, int n2, int n3)
	{
		return n1 + n2 + n3;
	}
	
	public void sub(int n1, int n2)
	{
		
	}
}

// class for overriding
class Overriding extends Overloading
{
	@Override // override the empty method from overloading
	public void sub(int n1, int n2)
	{
		System.out.println("Subtraction : " + (n1 - n2));
	}
}
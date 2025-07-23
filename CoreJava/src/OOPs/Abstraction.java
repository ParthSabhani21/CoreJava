package OOPs;

public class Abstraction 
{
	public static void main(String[] args) 
	{
		Human h = new Gender();
		h.defineClass();
		h.isMale();
		h.isFemale();
	}
}

// abstract class (abstract & non abstract methods)
abstract class Human
{
	public void defineClass()
	{
		System.out.println("This is a non abstract method in abstract class");
	}
	
	abstract void isMale();
	abstract void isFemale();
}

// class implementing the abstract methods
class Gender extends Human
{
	@Override // non abstraction method
	public void defineClass()
	{
		super.defineClass();
	}
	
	@Override
	void isMale() 
	{
		System.out.println("Human is Male");
	}

	@Override
	void isFemale()
	{	
		System.out.println("Human is Female");
	}
}
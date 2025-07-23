package OOPs;

public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		FirstName fn = new FirstName();
		fn.fullName(); // original method
		
		LastName ln = new LastName();
		ln.fullName(); // override method
	}
}

// parent class
class FirstName
{
	public void fullName()
	{
		System.out.println("First Name : Parth");
	}
}

// child class
class LastName extends FirstName
{
	@Override
	public void fullName()
	{
		System.out.println("Overrided Method");
		super.fullName(); // run the parent class fullName method
		System.out.println("Last Name : Sabhani");
	}
}

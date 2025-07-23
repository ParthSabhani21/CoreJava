package OOPs;

public class MultilevelInheritance 
{
	public static void main(String[] args) 
	{
		GrandFather gf = new GrandFather();
		System.out.print("My Grand Father Name : " );
		gf.myName(); // Rajesh Patel
		
		System.out.println(); // for new line
		
		Father f = new Father();
		System.out.print("My Father Name : " );
		f.myName(); // Krish Rajesh Patel
		
		System.out.println(); // for new line
		
		Son s = new Son();
		System.out.print("My Name : " );
		s.myName(); // Parth Krish Rajesh Patel
	}
}

// great parent class
class GrandFather
{
	public void myName()
	{
		System.out.print("Rajesh Patel");
	}
}

// parent class
class Father extends GrandFather
{
	@Override
	public void myName()
	{
		System.out.print("Krish ");
		super.myName();
	}
}

// child class
class Son extends Father
{
	@Override
	public void myName()
	{
		System.out.print("Parth ");
		super.myName();
	}
}
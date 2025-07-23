package OOPs;

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		Mother m = new Mother();
		System.out.print("My name : ");
		m.myName();
		
		FirstSon fs = new FirstSon();
		System.out.print("My elder son name : ");
		fs.myName();
		
		SecondSon ss = new SecondSon();
		System.out.print("My youger son name : ");
		ss.myName();
		
		Daughter d = new Daughter();
		System.out.print("My daughter name : ");
		d.myName();
	}
}

// parent class
class Mother
{
	public void myName()
	{
		System.out.println("Zeel Joshi");
	}
}

// first child class
class FirstSon extends Mother
{
	@Override
	public void myName()
	{
		System.out.print("Raj ");
		super.myName();
	}
}

// second child class
class SecondSon extends Mother
{
	@Override
	public void myName()
	{
		System.out.print("Krish ");
		super.myName();
	}
}

// third child class
class Daughter extends Mother
{
	@Override
	public void myName()
	{
		System.out.print("Banssi ");
		super.myName();
	}
}
package OOPs;

public class Encapsulation 
{
	// Local instance variables
	private int age;
	private String name;
	
	// constructor to set values
	public Encapsulation(int age, String name)
	{
		setAge(age);
		setName(name);
	}
	
	// encapsulation (binding private age & name)
	public void setAge(int age)
	{
		if(age > 18)
		{
			this.age = age;
		}else
		{			
			System.out.println("Age is below is");
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String[] args) 
	{
		int age = 12;
		String name = "Parth";
		Encapsulation enp ; // Object instance of Class Encapsulation
		enp = new Encapsulation(age, name); // constructor to set the data 
		
		System.out.println("Name : " + enp.getName());
		System.out.println("Age : " + enp.getAge());
		
		/*
		 * for age = 12 
		 * output : 
		 * Age is below is 
		 * Name : Parth 
		 * Age : 0
		 */
	}
}

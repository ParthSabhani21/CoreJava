package StringHandling;

public class StringClass 
{
	public static void main(String[] args) 
	{
		String name = "  Parth Patel  ";
		
		// in build method of string class that mainly used
		System.out.println("name : " + name);
		System.out.println("Upper Case : " + name.toUpperCase());
		System.out.println("Lower Case : " + name.toLowerCase());
		
		System.out.println("string length : " + name.length());
		System.out.println("Index of character in string : " + name.indexOf('p'));
		System.out.println("character at perticulat index of string : " + name.charAt(4));
		System.out.println("replace particular character with new one : " + name.replace('a', 'r'));
		
		System.out.println("White space removed trim : " + name.trim());
		System.out.println("White space removed strip : " + name.strip());
		
		System.out.println("add string at end : " + name.concat("Sabhani"));
		System.out.println("sub string from a string : " + name.substring(2, 7));
	}
}

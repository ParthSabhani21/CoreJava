package FileIO;

import java.io.File;

public class FileMethods 
{
	public static void main(String[] args) 
	{
		File file = new File("filename.txt");
		
		System.out.println("is file exists : " + file.exists());
		System.out.println("Can Read : " + file.canRead());
		System.out.println("Can Write : " + file.canWrite());
		
		System.out.println("File name : " + file.getName());
		System.out.println("File path : " + file.getPath());
		System.out.println("Length : " + file.length());
		
		System.out.println("is Directory : " + file.isDirectory()); // folder
		System.out.println("is File : " + file.isFile()); // file
		
		System.out.println("List : " + file.list()); // string[]
		System.out.println("List : " + file.listFiles()); // File[]
		
		System.out.println("is Hidden : " + file.isHidden());
		System.out.println("make directory : " + file.mkdir());
		
		System.out.println("set Read only : " + file.setReadOnly());
		System.out.println("set writeable : " + file.setWritable(true));
		System.out.println("delete : " + file.delete());
	}
}

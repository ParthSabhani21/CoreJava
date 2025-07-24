package ArraysConcept;

import java.util.Arrays;

public class TypesOfArrays 
{
	public static void main(String[] args) 
	{
		// one-D array
		int[] oneD = new int[2]; // declaration + size
		
		// two-D array
		int[][] twoD = new int[2][]; // declaration + outer array size
		
		// three-D array
		int[][][] threeD = new int[2][][]; // declaration + outermost array size
	
		// assigning values 
		oneD[0] = 10;
		oneD[1] = 20;
		
		twoD[0] = new int[2];
		twoD[1] = new int[2];
		
		twoD[0][0] = 1;
		twoD[0][1] = 2;
		twoD[1][0] = 3;
		twoD[1][1] = 4;
		
		threeD[0] = new int[2][2];
		threeD[1] = new int[1][2];
		
		threeD[0][0][0] = 11;
		threeD[0][0][1] = 12;
		threeD[0][1][0] = 13;
		threeD[0][1][1] = 14;

		threeD[1][0][0] = 21;
		threeD[1][0][1] = 22;
		
		System.out.println("One D : " + Arrays.toString(oneD));
		
		for(int[] a : twoD)
		{			
			System.out.println("two D : " + Arrays.toString(a));
		}
		
		for(int[][] a : threeD)
		{
			for(int[] f : a)
			{				
				System.out.println("three D : " + Arrays.toString(f));
			}
		}
	}
}

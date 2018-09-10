package assignment2;

import java.util.Arrays;

public class Arraysort 
{

	public static void main(String[] args) 
	{
		int []array = {45,52,3,2,36,90,112};
		Arrays.sort(array);
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}

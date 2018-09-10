package assignment2;

public class Bubblesort 
{
	public static int bubbleSort(int []a)
	{
		int i,j,temp;
		for (i=0;i<a.length-1;i++) 
		{
			for (j=0;j<a.length-1;j++)
			{
				if (a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return 0;
	}
	public static void printArray(int []a)
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int []a= {3,2,5,7,8,9,1};
		System.out.println();
		System.out.println("Before Sorting :");
		printArray(a);
		bubbleSort(a);
		System.out.println();
		System.out.println("After Sorting :");
		printArray(a);
	}
}



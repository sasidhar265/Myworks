package assignment2;

public class Selectionsort 
{
	public static int selectSort(int []a)
	{
		int temp,index,i,j;
		for (i=0;i<a.length;i++)
		{
			 index=i;
			for (j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index=j;
				}
			}
			if (index!=i)
			{
				temp=a[index];
				a[index]=a[i];
				a[i]=temp;
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
		selectSort(a);
		System.out.println();
		System.out.println("After Sorting :");
		printArray(a);	
	}
}

package assignment2;

public class Ascendingorder 
{
	public static int[] array(int[] a)
	{
		int temp=0;
		int first=0;
		int mid=a.length/2;
		int last =a.length;
		for (int i=0;i<a.length;i++)
		{
			for (int j=first;j<mid-i-1;j++)
			{
				if (a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for (int j=mid;j<last-i-1;j++)
			{
				if (a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int []a= {2,4,1,8,4,10};
		array(a);
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}
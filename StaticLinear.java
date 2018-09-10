package assignment2;

public class StaticLinear 
{
	public static int linearSearch(int[] a,int b)
	{
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==b)
			{
			 return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6,7};
		int c=linearSearch(a,6);
		System.out.print(c);
		//System.out.println("enter element to be search");
		}
}

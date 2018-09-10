package assignment2;

public class Mergearrayusingmethods 
{
	public static int array(int[]a,int[]b)
	{
		int count=0;
		int c[]= new int[a.length+b.length];
		for (int i=0;i<a.length;i++)
		{	
			c[i]=a[i];
			count++;
		}
		for (int j=0;j<b.length;j++)
		{
			c[count++]=b[j];
		}
		for (int i=0;i<c.length;i++)
		{
		System.out.print(c[i]+" ");
		}
		return 0;
	}	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4};
		int []b= {5,6,7,8};
		array(a,b);
	}
}

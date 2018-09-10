package assignment2;

public class BinarySearch 
{
	public static int binarySearch(int []a,int n)
	{		
		int last=a.length-1;
		int first=0;
		int middle=(first+last)/2;
		while(first<=last)
		{
			if(a[middle]<n)
			{
				first=middle+1;
			}
			else if(a[middle]==n)
			{
				//System.out.println("number found"+a[middle]);
				return middle;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int []a={15,10,5,20,25,30,45,50};
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-i-1;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int b=binarySearch(a,15);
			System.out.println(b);
	}
}

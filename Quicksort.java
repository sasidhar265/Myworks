package assignment2;

public class Quicksort 
{
	public static void quickSort(int []array, int left, int right)
	{
		int index= partition (array, left, right);
		if (left<index-1)
			quickSort(array,left,index-1);
		if (index<right)
			quickSort(array,index,right);
	}
	public static int partition(int[]array, int left, int right)
	{
		int pivot=array[(left+right)/2];
		while(left<=right)
		{
			while (array[left]<pivot) 
				left++;
			while(array[right]>pivot)
				right--;
			
			if (left<=right)
			{
				int temp=array[left];
				array[left]=array[right];
				array[right]=temp;
				left++;
				right--;
			}
		}
		return left;
	}
	public static void main(String[] args) 
	{
		int []array=new int[]{10,20,50,60,40,80,70,30};
		quickSort(array,0,array.length-1);
		for (int i=0;i<array.length;i++)
		{
				System.out.print(array[i]+" ");
		}
	}

}

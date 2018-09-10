package assignment2;

public class Insertionsort 
{
	public static void insertionSort(int a[])
	{   
        for (int i=1;i<a.length;i++) 
        {  
            int key=a[i];  
            int j=i-1;  
            while ((j>=0)&&(a[j]>key)) 
            {  
                a[j+1]=a[j];  
                j--;  
            }  
            a[j+1]=key;  
        }  
    }  
       
    public static void main(String[] args)
    {    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Before Insertion Sort");    
        for(int i=0;i<arr1.length;i++)
        {    
            System.out.print(arr1[i]+" ");    
        }    
        System.out.println();        
        insertionSort(arr1);    
        System.out.println("After Insertion Sort");    
        for(int i=0;i<arr1.length;i++)
        {    
            System.out.print(arr1[i]+" ");    
        }    
    }    
}

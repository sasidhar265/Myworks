package work31;
import java.util.*;
public class Mulof2Darrays {

	public static void main(String[] args) 
	{
		int i,j;
		Scanner obj=new Scanner (System.in);
		System.out.println("The size of rows for array A");
		int a=obj.nextInt();
		System.out.println("The size of columns for array A");
		int b=obj.nextInt();
		int [][]n=new int[a][b];
		System.out.println("The elements in an array A");
		for (i=0;i<a;i++)
		{
			for (j=0;j<b;j++)
			{
				n[i][j]=obj.nextInt();
			}
		}
			for (i=0;i<a;i++)
			{
				for (j=0;j<b;j++)
				{
					System.out.print(n[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The size of rows for array B");
			int a1=obj.nextInt();
			System.out.println("The size of columns of array B");
			int b1=obj.nextInt();
			int [][]n1=new int [a1][b1];
			System.out.println("The elements in an array B");
			for (i=0;i<a1;i++)
			{
				for (j=0;j<b1;j++)
				{
					n1[i][j]=obj.nextInt();
				}
			}
				for (i=0;i<a1;i++)
				{
					for (j=0;j<b1;j++)
					{
						System.out.print(n1[i][j]);
					}
					System.out.println();
				}
				if(a==b1)
				{
					System.out.println("multiplication possible");
				}
				else
				{
					System.out.println("multiplication is not possible");
				}
				System.out.println("Multiply array A & Multiply array B");
				int mul[][]=new int [a][b1];
				int sum=0;
				for (i=0;i<a;i++)
				{
					for (j=0;j<b1;j++)
					{
						for (int k=0;k<b;k++)
						{
						sum=sum+n[i][k]*n1[k][j];
						}
						mul[i][j]=sum;
						sum=0;
					}
				}
				for (i=0;i<a;i++)
				{
					for (j=0;j<b1;j++)
					{
						System.out.print(mul[i][j]+" ");
					}
					System.out.println();
				}			
	}
}
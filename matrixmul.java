import java.util.Scanner;
import java.util.Arrays;
class matrixmul
{
	public static void main(String[] args)
	{
         System.out.print("enter the no of rows of MATRIX A:");
		Scanner input=new Scanner(System.in);
		int m = input.nextInt();
		 System.out.print("enter the no of columns of MATRIX A:");
		 int n = input.nextInt();
		int[][] a = new int[m][n];
		System.out.print("enter the elements of MATRIX A:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		System.out.print("enter the no of rows of Matrix B:");
		int p = input.nextInt();
		 System.out.print("enter the no of columns of Mtrix B:");
		 int q = input.nextInt();
		int[][] b = new int[p][q];
		System.out.print("enter the elements of MATRIX B:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=input.nextInt();
			}
		}
		if(n!=p)
		System.out.print("not possible");
		
		int[][] c=new int[m][q];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
			int x=0;
				for(int k=0;k<p;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				
			}
		}
		//for(int[] x:c)
	//	System.out.println(Arrays.toString(x));
	for(int i=0;i<m;i++)
		{
		System.out.print("\n");
			for(int j=0;j<p;j++)
			{
			System.out.print(c[i][j]+" ");
		}
		}
		}
		}
		

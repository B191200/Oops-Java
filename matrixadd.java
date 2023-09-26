import java.util.Scanner;
import java.util.Arrays;
class matrixadd
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
				b2
				[i][j]=input.nextInt();
			}
		}
		int[][] sum=new int[m][n];
		if(m!=p && n!=q){
		System.out.print("not possible");}
		for(int i=0;i<m;i++)
		{
		for(int j=0;j<n;j++)
		{
			sum[i][j]=a[i][j]+b[i][j];
		}
		}
		for(int[] x:sum)
		System.out.println(Arrays.toString(x));
			
}			
}
		

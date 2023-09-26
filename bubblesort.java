import java.util.Scanner;
import java.util.Arrays;
class bubblesort
{
	public static void main(String[] args)
	{
	int flag=0;
		System.out.print("enter the size of an arry:");
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		if(a[i]<a[j])
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		}
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]+ " ");
	}
	}

import java.util.Scanner;
class bigsmall
{
	public static void main(String[] args)
	{
		System.out.print("enter the no of elements:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] a = new int[n];
		System.out.print("enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			max=a[i];
		}
		System.out.println("max num is : " +max);
		int min=a[0];
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			min=a[i];
		}
		System.out.println("min num is : " +min);
	}
}
		
		
		

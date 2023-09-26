import java.util.Scanner;
import java.util.Arrays;
class Binary
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
		System.out.print("enter the search key:");
		int key=input.nextInt();
		Arrays.sort(a);
		int p=search(a,key);
		if(p==-1)
		System.out.print("not found");
		else
		System.out.print("found");
		
		}
	static int search(int a[],int key)
	{
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==key)
			return mid;
			else if( a[mid] < key)
			l=mid+1;
			else
			h=mid-1;
		}
		return -1;
	}
	}
			

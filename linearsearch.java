import java.util.Scanner;
class linearsearch
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
		for(int i=0;i<n;i++)
		{
			if(a[i]==key)
				flag=1;
		}
		if(flag==1)
		System.out.print("element found");
		else
		System.out.print("element not found");
	}
}

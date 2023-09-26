import java.util.Scanner;
import java.util.Arrays;
class merge1
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
		int l=0;
		int h=n-1;
		mergesort(a,l,h);
	}
	static void mergesort(int a[],int l,int h)
	{
		int mid;
		while(l<h)
		{
			mid=(l+h)/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,h);
			merge(a,l,mid,h);
		}
	}
	static void merge(int a[],int l,int mid,int h)
	{
	int[] b=new int[10];
	int i=l,k=l,j=mid+1;
	while(a[i]<=a[mid])
	b[k++]=a[i++];
	while(a[mid]<a[j])
	b[k++]=a[j++];
	while(i<=mid)
	b[k++]=a[i++];
	while(j<=h)
	b[k++]=a[j++];
	for(int x=l;x<=h;x++)
	System.out.print(b[i]+" ");
	}
	}

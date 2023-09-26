import java.util.Scanner;
class perfect
{
	public static void main(String[] args)
	{
		int a,i,j;
		Scanner input = new Scanner(System.in);
		System.out.print("enter a num :");
		a=input.nextInt();
		for(i=a; i>1; i--)
		{
			if(a%i==0)
			{
			     int c=0;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					c+=1;
				}
			if(c==0)
			System.out.println(i);
			}
		}
		}
}
			   	
			   
				
			

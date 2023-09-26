import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
	{
	int rem=0,r;
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int q=a;
		while(a!=0)
		{
			r=a%10;
			rem=rem*10+r;
			a=a/10;
		}
		if(rem==q)
		System.out.print("palindrome");
		else
		System.out.print("not palindrome");
	}
}
			
			
			

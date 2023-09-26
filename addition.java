import java.util.Scanner;
class addition
{	
	public static void main(String[] args)
	{
		int a,b,sum;
		Scanner scnr = new Scanner(System.in);
			System.out.println("enter the numbers:");
			a=scnr.nextInt();
			b=scnr.nextInt();
			sum=a+b;
			System.out.print("sum of given two numbers is = ");
			System.out.println(sum);
		}
	}
		

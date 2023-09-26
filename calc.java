import java.util.Scanner;
import java.lang.Math;
class calc
{
	public static void main(String[] args)
	{
	int c;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number:");
		int a = input.nextInt();
		System.out.println("enter the number:");
		int b = input.nextInt();
		System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
		System.out.println("enter the option");
		int pos = input.nextInt();
		switch(pos)
		{
			case 1: 
						c=a+b;
						System.out.println(c);
						break;
			case 2:
						c=a-b;
						System.out.println(c);
						break;
			case 3:
						 c= a*b;
						 System.out.println(c);
						break;
		case 4: 
					c=a/b;
					System.out.println(c);
					break;
		default: System.out.println("error!");
		break;
	}
	}
	}

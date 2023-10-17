import java.util.*;

class reverse1
{
	public static String reverse1String(String s)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}

class s7
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first string:");
	     String s = input.nextLine();
	     System.out.println(reverse1.reverse1String(s));
	}
}

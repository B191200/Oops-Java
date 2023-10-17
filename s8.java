import java.util.*;

class s8
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string:");
	     String s = input.nextLine();
	     System.out.println("enter the starting position:");
	     int p1=input.nextInt();
	     System.out.println("enter the end position position:");
	     int p2=input.nextInt();
	     System.out.println(s.substring(p1,p2));//starting nd end-1
	     System.out.println(s.substring(p1));
	    System.out.println(s.substring(p2));
	    System.out.println(s.startsWith("app"));
	     System.out.println(s.endsWith("ne"));
	    
	}
}


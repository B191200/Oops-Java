import java.util.*;

class s3
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first string:");
	     String s=input.nextLine();
	     System.out.print("enter the character:");
	     char c=input.next().charAt(0);
	     int count=0;
	     int p=s.indexOf(c);
	     while(p!=-1)
	     {
	     	p=s.indexOf(c,p+1);
	     	count++;
	     }
	     System.out.println("occurences = "+count);	     
	}
}

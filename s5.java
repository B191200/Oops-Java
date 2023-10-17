import java.util.*;

class s5
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the first string:");
	     String s = input.nextLine();
	     int c1=0;
	     int c2=0;
	     for(int i=0;i<s.length();i++)
	     {
	     	char c=s.charAt(i);
	     	if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c=='I' || c== 'O' || c=='U')
	     	{
	     		c1++;
	     	}
	     	else
	     	c2++;
	     }
	     System.out.println("vowels count     = "+c1);
	     System.out.println("consonants count = "+c2);
	  }
	 }

import java.util.*;

class Account
{
	String accountant_name;
	double amount,withdrawal,deposit;
	int acc_no;
	
	Account(String name,double a,double w,double depo,int n)
	{
		accountant_name=name;
		amount = a;
		withdrawal=w;
		deposit=depo;
		acc_no=n;
	}
	void debit(double w)
	{
		if(amount >= w)
		{
			amount = amount-w;
			double rem=(amount-w);
			System.out.println("total amount after withdrawed is: "+amount);
			System.out.println("current balance in account: "+rem);
		}
		else
		{
		System.out.println("Insufficient account balance");
		System.out.println("enter the amount to withdraw");
		}
	}
	void credit(double d)
	{
		amount=amount+d;
		System.out.println("Accountant name = "+accountant_name);
		System.out.println("account no = "+acc_no);
		System.out.println("total amount after deposited is: "+amount);
	}
}
class Bank
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the accountant name:");
		String name = s.nextLine();
		System.out.println("Enter the account balance:");
		double a = s.nextDouble();
		System.out.println("Enter the account number:");
		int  n=s.nextInt();
		System.out.println("Enter the amount to deposit:");
		double depo = s.nextDouble();
		System.out.println("Enter the amount to withdraw:");
		double w=s.nextDouble();
		Account ac=new Account(name,a,w,depo,n);
		ac.credit(depo);
		ac.debit(w);
	}
}
		
	
		

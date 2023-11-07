import javax.swing.*;

public class swing3
{
	public static void main(String[] args)
	{
		String agetext = JOptionPane.showInputDialog(null,"How old are you?");
		//int age = Integer.parseInt(agetext);
		int age=0;
	try {
	age = Integer.parseInt(agetext);
	} catch (NumberFormatException nfe) {
	JOptionPane.showMessageDialog(null, "Invalid integer.");
	}
		
		String moneytext = JOptionPane.showInputDialog(null,"How much do you earn?");
		//double money = Double.parseDouble(moneytext);
		double money=0;
		try {
	money = Double.parseDouble(moneytext);
	} catch (NumberFormatException nfe) {
	JOptionPane.showMessageDialog(null, "Invalid integer.");
	}
		
		JOptionPane.showMessageDialog(null,"If you can double your money each year,\n" + "you'll have " + (money *32)+ " dollars at age " +(age+5) + "!");
	}
}
		
		
		


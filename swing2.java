import javax.swing.*;

public class swing2
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog(null,"What's your name?");
		int choice = JOptionPane.showConfirmDialog(null,"Do you like cake, " + name + "?");
		if(choice == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null,"Lovely!");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Oh God!");
		}
	}
}
			

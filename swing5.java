import java.awt.*; 
import javax.swing.*; 

public class swing5
{
 	public static void main(String[] args) 
 	{
	 JFrame frame = new JFrame();
	 frame.setForeground(Color.WHITE);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setSize(new Dimension(300, 100));
	 frame.setTitle("A frame");
	 JButton button1 = new JButton();
	 button1.setText("I'm the first button");
	 button1.setbackground(Color.BLUE);
	 frame.add(button1);
	 JButton button2 = new JButton();
	 button2.setText("I'm the first button");
	 button2.setBackground(Color.YELLOW);
	 frame.add(button2);
	 frame.setVisible(true);
     }
}

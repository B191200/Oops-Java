import java.awt.*; 
import javax.swing.*; 
public class swing7
{
 	public static void main(String[] args) 
 	{
	 JFrame frame = new JFrame();
	 frame.setForeground(Color.WHITE);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 frame.setSize(new Dimension(300,100));
	 frame.setTitle("The Grid");
	 frame.setLayout(new GridLayout(2,3));
	 for(int i=1;i<=6;i++)
	 {
	 frame.add(new JButton("Button "+ i));
	 }
	 frame.setVisible(true);
	}
}

import java.awt.*; 
import javax.swing.*; 
public class swing8
{
 	public static void main(String[] args) 
 	{
	 JFrame frame = new JFrame();
	 frame.setForeground(Color.RED);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 frame.setSize(new Dimension(300,300));
	 frame.setTitle("The Grid");
	 frame.add(new JButton("North"),BorderLayout.NORTH);
	 frame.add(new JButton("South"),BorderLayout.SOUTH);
	 frame.add(new JButton("West"),BorderLayout.WEST);
	 frame.add(new JButton("East"),BorderLayout.EAST);
	 frame.add(new JButton("Center"),BorderLayout.CENTER);
	 
	 frame.setVisible(true);
	 }
}

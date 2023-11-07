import java.awt.*; 
import javax.swing.*; 
public class swing6
{
 	public static void main(String[] args) 
 	{
	 JFrame frame = new JFrame();
	 frame.setForeground(Color.WHITE);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 frame.setSize(new Dimension(300,100));
	 frame.setTitle("A frame");
	 JLabel label = new JLabel("Type your ZIP code: ");
	JTextField field = new JTextField(8);
	 JButton button = new JButton("Submit");
	 frame.setLayout(new FlowLayout());
	 frame.add(label);
	 frame.add(field);	 
	 frame.add(button);
	 frame.setVisible(true);
	}
}

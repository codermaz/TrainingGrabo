
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;

public class BeispielFlowLayout extends JFrame
{
	public BeispielFlowLayout() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setSize(400,400);
		
		Container fenster = this.getContentPane();
		fenster.setLayout(new FlowLayout (FlowLayout.LEFT,200,200));
		
		fenster.add(new JButton ("Button 1"));
		fenster.add(new Button ("Button 2"));
		fenster.add(new Button ("Button 3"));
		fenster.add(new Button ("Button 4"));
		fenster.add(new Button ("Button 5"));
		
		this.pack();
		
		this.setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new BeispielFlowLayout();
	}
}

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentExmp1 extends JFrame
{
	JButton button1, button2;
	
	public JComponentExmp1()
	{ 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200,200);
		this.setTitle("DionaRap");
		
		button1= new JButton ("Button1");
		button2= new JButton ("Button2");
		
		button1.setToolTipText("Das ist ein Button");
		button2.setMnemonic('B');
		
		this.getContentPane().add(button1, BorderLayout.NORTH);
		this.getContentPane().add(button2, BorderLayout.WEST);
			
		this.setSize(200,200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentExmp1();
	}

}

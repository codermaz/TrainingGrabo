import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelBeispiel extends JFrame
{
	public LabelBeispiel()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LabelBeispiel");
		this.setSize(1275, 690);
		
		GridLayout meinLayout= new GridLayout(2,4);
		this.setLayout(meinLayout);
		
		JLabel label1= new JLabel("Label 1 links deckend in rot ohne Rand", JLabel.LEFT);
			   //label1.setBackground(Color.YELLOW);
			   label1.setBackground(new Color(100,100,100));
			   label1.setBorder(BorderFactory.createTitledBorder("Title für Label 1"));
			   label1.setOpaque(true);
		JLabel label2= new JLabel("Label2 rechts durschsichtig ohne Rand", JLabel.RIGHT);
		
		JLabel label3= new JLabel ("Label 3 Mitte deckend mit Rand", JLabel.CENTER);
			   label3.setBorder(BorderFactory.createEtchedBorder());
			   label3.setOpaque(true);
			   label3.setBackground(new Color(150,150,150));
			   //label3.setBorder(BorderFactory.createTitledBorder("Title für Label 3"));
			   
		Container fenster= this.getContentPane();
		fenster.add(label1);
		fenster.add(label2);
		fenster.add(label3);
		
		this.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new LabelBeispiel(); 

	}

}



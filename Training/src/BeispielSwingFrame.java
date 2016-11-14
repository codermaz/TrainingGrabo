import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BeispielSwingFrame extends JFrame
{
	public BeispielSwingFrame()
	{ 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.setTitle("Dezimal nach dual Umrechnung");
		
		// ContentPane für die Komponente des Fensters besorgen
		Container darstellungsflaeche=this.getContentPane();
		Container darstellungsflaeche2=this.getContentPane();
		// Hintergrundfarbe des ContentPane setzen
		darstellungsflaeche.setBackground(Color.blue);
	
		// Taste ins Fenster (in den ContentPane) legen
		JButton meineTaste= new JButton("OK");
		JButton meineTaste2= new JButton("OK2");
		JButton meineTaste3= new JButton("OK3");
		
		
		darstellungsflaeche.add(meineTaste, BorderLayout.WEST);
		darstellungsflaeche.add(meineTaste2, BorderLayout.EAST);
		darstellungsflaeche.add(meineTaste3);
		
		JButton meineTaste4= new JButton("OK4");
		JButton meineTaste5= new JButton("OK5");
		JButton meineTaste6= new JButton("OK6");
		JButton meineTaste7= new JButton("OK7");
		JButton meineTaste8= new JButton("OK8");
		JButton meineTaste9= new JButton("OK9");
		JButton meineTaste10= new JButton("OK10");
		JButton meineTaste11= new JButton("OK11");
		JButton meineTaste12= new JButton("OK12");
		
		/*
		darstellungsflaeche2.add(meineTaste, BorderLayout.NORTH);
		darstellungsflaeche2.add(meineTaste2, BorderLayout.EAST);
		darstellungsflaeche2.add(meineTaste3, BorderLayout.WEST);
		darstellungsflaeche2.add(meineTaste4, BorderLayout.SOUTH);
		darstellungsflaeche2.add(meineTaste5, BorderLayout.CENTER);
		*/
		for (int i=0; i<11; i++)
		{
			darstellungsflaeche.add(new JButton(Integer.toString(i)));
		}
		
		
		//darstellungsflaeche.add(meineTaste6);
		//darstellungsflaeche2.add(darstellungsflaeche);
		
		GridLayout meinGrid = new GridLayout(4,3,5,5);
		darstellungsflaeche.setLayout(meinGrid);
		
		this.setVisible(true);		
	}
	
	public static void main (String arg[]  )
	{
		new BeispielSwingFrame(); 
	}
}

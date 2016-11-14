import java.awt.FlowLayout;

import javax.swing.JProgressBar;
import javax.swing.JWindow;


public class animation2 extends JWindow implements Runnable
{   animation1 fenster;
    JProgressBar anzeige;
    
    animation2(animation1 fenster)
    {   System.out.println("animation2 erzeugen");
    	this.fenster=fenster;
    	this.setLayout(new FlowLayout());
    	this.setLocation(0,fenster.getHeight());
    	anzeige = new JProgressBar();
    	anzeige.setMaximum(100);
    	anzeige.setValue(fenster.getint());
    	this.add(anzeige);
    	this.pack();
    	this.setVisible(true);
    	System.out.println("Fenster sichtbar");
    }
    
    public void run()
	{
		while(true) 
		{		
			this.redraw(); 
			
		try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {}

		}
	}
	public void redraw()
	{
		
		anzeige.setValue(fenster.getint());
		repaint();
	}

}

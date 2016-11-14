import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JWindow;

/**
 * Diese Klasse ist ein ComponentListener <br>
 * 
 * Die Klasse reagiert auf Bewegung und Größenänderung einer Komponente 
 * 
 * @author Prof. Silvia Keller
 *
 */

public class s1_FensterListener implements ComponentListener
{   private JWindow fenster;
	int aktuellKoorX, aktuellKoorY;
	String fensterPosition;
	int fensterHeight, fensterWidth; 

/**
 * Konstruktor der Klasse
 * 
 * @param  fenster  Das Fenster, das verändert werden soll 
 * 
 */ 
    s1_FensterListener(JWindow fenster, String fensterPosition, int fensterHeight, int fensterWidth)
    {
    	this.fenster = fenster;
    	this.fensterPosition = fensterPosition;
    	this.fensterHeight = fensterHeight;
    	this.fensterWidth = fensterWidth;
    }
	
	/**
	 * Diese Methode tut nichts <br>
	 */ 
	public void componentHidden(ComponentEvent arg0) { }
	/**
	 * Diese Methode reagiert auf eine Verschiebung <br>
	 * 
	 * @param event  Das Ereignis, das von der Komponente, die bewegt wurde erzeugt wurde
	 */ 
	public void componentMoved(ComponentEvent event) 
	{   
		JFrame gui = (JFrame) event.getSource();
		
		switch (fensterPosition) {
		case "RECHTS_OBEN": {
			aktuellKoorX = (int) gui.getLocation().getX() + (int) gui.getWidth();
			aktuellKoorY = (int) gui.getLocation().getY();
			break;
		}
		case "RECHTS_UNTEN": {
			aktuellKoorX = (int) gui.getLocation().getX() + gui.getWidth();
			aktuellKoorY = (int) gui.getLocation().getY() + gui.getHeight() - this.fensterHeight;
			break;
		}
		case "LINKS_OBEN": {
			aktuellKoorX = (int) gui.getLocation().getX() - this.fensterWidth;
			aktuellKoorY = (int) gui.getLocation().getY();
			break;
		}
		case "LINKS_UNTEN": {
			aktuellKoorX = (int) gui.getLocation().getX() - this.fensterWidth;
			aktuellKoorY = (int) gui.getLocation().getY() + gui.getHeight() - this.fensterHeight ;
			break;
		}
		}
		
		fenster.setLocation(aktuellKoorX, aktuellKoorY);
		fenster.repaint();
	}
   	
	
	/**
	 * Diese Methode reagiert auf eine Größenänderung <br>
	 * 
	 * @param event  Das Ereignis, das von der Komponente, deren Größe verändert wurde, erzeugt wurde
	 */ 
	public void componentResized(ComponentEvent event) {
		JFrame gui = (JFrame) event.getSource();

		switch (fensterPosition) {
		case "RECHTS_OBEN": {
			aktuellKoorX = (int) gui.getLocation().getX() + (int) gui.getWidth();
			aktuellKoorY = (int) gui.getLocation().getY();
			break;
		}
		case "RECHTS_UNTEN": {
			aktuellKoorX = (int) gui.getLocation().getX() + gui.getWidth();
			aktuellKoorY = (int) gui.getLocation().getY() + gui.getHeight() - this.fensterHeight;
			break;
		}
		case "LINKS_OBEN": {
			aktuellKoorX = (int) gui.getLocation().getX() - this.fensterWidth;
			aktuellKoorY = (int) gui.getLocation().getY();
			break;
		}
		case "LINKS_UNTEN": {
			aktuellKoorX = (int) gui.getLocation().getX() - this.fensterWidth;
			aktuellKoorY = (int) gui.getLocation().getY() + gui.getHeight() - this.fensterHeight ;
			break;
		}
		}
		
		
		fenster.setLocation( aktuellKoorX, aktuellKoorY);	

		//? fenster.repaint();
	}
	/**
	 * Diese Methode tut nicht <br>
	 */ 
	public void componentShown(ComponentEvent arg0) { }
}

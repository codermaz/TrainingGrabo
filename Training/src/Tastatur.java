import java.awt.*;
import javax.swing.*;

/**
 * Die Klasse Tastatur ist ein Beispiel für die Verwendung eines GridLayout
 * @author Prof.S. Keller, Hochschule Ravensburg-Weingarten
 *
 */

public class Tastatur extends JFrame
{  
	/**
	 * Konstruktor
	 * Legt als Layout GridLayout fest und fügt widgets in die Gridelemente ein
	 * @author Prof.S. Keller, Hochschule Ravensburg-Weingarten
	 *
	 */

	public Tastatur()
	{ this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setTitle("Beispiel für GridLayout");
	  
	  Container content = this.getContentPane();
	  
	  // Richtung zum Auffüllen der Gridelemente umkehren
	  // content.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	  
	  /* Grid mit 4 Zeilen, 3 Spalten und jeweils 10 Pixel Abstand 
	   * zwischen den Gridelementen erzeugen */
	  content.setLayout(new GridLayout(4,3,10,10));
	  
	  
	  /* Array, dass 10 Tasten aufnehmen kann */
	  JButton[] tasten = new JButton[10];
	  
	  /* 10 Tasten erzeugen, im Array speichern und im Grid platzieren */
	  for ( int i=0; i<10; i++ )
	  { /* Taste erzeugen. Beschriftung ist der Wert von i */
		tasten[i]=new JButton(Integer.toString(i)+"#"); 
		/* Taste ins Grid legen */
	    content.add(tasten[i]);
	  }
	  
	  /*  Spezielle Tasten in ein bestimmtes Gridelement legen 
	   *  Man kann in der add-Methode nur eine Position angeben, 
	   *  die eine Taste an ein gefülltes Grid anfügt 
	   *  oder in der schon eine Taste liegt.
	   *  Im letzten Fall wird die Taste, die an der Grid-Position liegt und alle folgenden Tasten 
	   *  im Grid nach rechts verschoben
	   */
	  
	  /* Taste Joker an die 4. Position legen. Alle Tasten ab Ziffer 3 werden verschoben */
	  content.add(new JButton("Joker"),4); 
	  
	  /* Taste Ende hinten anfügen */
	  content.add(new JButton("Ende"));
	  
	  // Panel mit Textfeld erzeugen und hinten anfügen
	  JPanel panel = new JPanel();
	  panel.setBackground(Color.pink);
	  JTextField text=new JTextField("Textfeld");
	  panel.add(text);
	  content.add(panel,11);
	  
	  this.pack();
      this.setVisible(true);
      
      // Fokus auf Textfeld setzen
      text.grabFocus();
	}

	
	public static void main(String[] args) 
	{
		new Tastatur();

	}

}
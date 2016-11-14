
/**
 * �berschrift:   Beispiel Farbverlauf
 * Beschreibung:
 * Copyright:     Copyright (c) 2003
 * Organisation:  HochschuleRavensburg-Weingarten
 * @author Prof. Dr. S. Keller
 * @version 1.0
 */
import java.awt.*;
import javax.swing.*;

public class s3_FarbVerlauf extends JFrame {
	Container darstellungsflaeche;
	int transparenz = 128; // deckend = 255 transparent=0

	public s3_FarbVerlauf() {
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(400, 400);

		darstellungsflaeche = this.getContentPane();
		darstellungsflaeche.setLayout(null); // es soll ohne Layoutmanager
												// gearbeitet werden
		darstellungsflaeche.setBackground(Color.black);

		// Button mit Farbe rot, nicht transparent erzeugen
		JButton Normal = new JButton(); // da ohne layoutManager, muss die
										// Position der Komponente angegeben
										// werden
		Normal.setLocation(100, 100);
		Normal.setSize(100, 100);
		Normal.setBackground(new Color(128, 110, 0));
		darstellungsflaeche.add(Normal);
		// Button in blau, transparent erzeugen
		JButton Transparent = new JButton();
		Transparent.setLocation(85, 85);
		Transparent.setSize(50, 50);
		Transparent.setBackground(new Color(110, 0, 128, transparenz));

		darstellungsflaeche.add(Transparent); // Diese Taste liegt in einer
												// h�heren Ebene


		this.setVisible(true);

		this.runanimation();

	}

	public static void main(String[] args) {
		new s3_FarbVerlauf();
	}

	private void runanimation() { // Hintergrund soll Grauton-Verlauf sein
      for (int j=0; j<10; j++) {
      
		for (int i = 0; i <= 255; i++) {
			darstellungsflaeche.setBackground(new Color(i, 0, i));
			try {
				Thread.sleep(3);

			} // blockiere 30 Millisekunden, damit Farbverlauf sichtbar wird
			catch (java.lang.InterruptedException e) {
				System.out.println("Fehler bei thread.sleep()");
			}
		}
		
      }	
	}
}
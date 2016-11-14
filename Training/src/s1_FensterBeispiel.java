
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

/**
 * Diese Klasse soll ein Beispiel für ein JFrame sein <br>
 * 
 * Dieses Fenster besitzt ein Kindfenster vom Typ JWindow
 *
 * @author Prof. Silvia Keller, Hochschule Ravensburg-Weingarten
 *
 */
public class s1_FensterBeispiel extends JFrame {
	private static final long serialVersionUID = 1L;

	int aktuellKoorX, aktuellKoorY;

	int fensterHeight, fensterWidth;
	String fensterTitle;
	Color fensterFarbe;
	String fensterPosition; // "LINKS_OBEN" oder "LINKS_UNTEN" oder
							// "RECHTS_OBEN" oder "RECHTS_UNTEN"

	/**
	 * Konstruktor der Klasse <br>
	 * Erzeugt ein Kindfenster vom Typ JWindow
	 */
	public s1_FensterBeispiel() { // bei Anwahl des x-Knopfes im Fensterbalken
								// Anwendungs mit exit(0) beenden
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Fenstereigenschaften setzen
		this.setTitle("1. Fenster");
		this.setSize(400, 400);
		this.setLocation(300, 100);

		// this.setIconImages(new ImageIcon("/Book_Icon.png").getImage());

		// ContentPane besorgen zur Darstellung der widgets
		Container darstellungsFlaeche = this.getContentPane();

		// Hintergrundfarbe des ContentPane setzen
		darstellungsFlaeche.setBackground(Color.BLUE);

		// Fenster sichtbar machen
		this.setVisible(true);

		/* 2. Fenster rechts oben platzieren */
		fensterTitle = "JWindow 1";
		fensterPosition = "RECHTS_OBEN";
		fensterHeight = 150;
		fensterWidth = 150;
		fensterFarbe = Color.cyan;
		s1_FensterProduzieren zweitesFenster = new s1_FensterProduzieren(this);
		zweitesFenster.setFensterNPHWC(fensterTitle, fensterPosition, fensterHeight, fensterWidth, fensterFarbe);
		this.addComponentListener(new s1_FensterListener(zweitesFenster, fensterPosition, fensterHeight, fensterWidth));

		/* 3. Fenster links unten platzieren */
		fensterTitle = "JWindow 2";
		fensterPosition = "LINKS_UNTEN";
		fensterHeight = 250;
		fensterWidth = 250;
		fensterFarbe = Color.yellow;
		s1_FensterProduzieren drittesFenster = new s1_FensterProduzieren(this);
		drittesFenster.setFensterNPHWC(fensterTitle, fensterPosition, fensterHeight, fensterWidth, fensterFarbe);
		this.addComponentListener(new s1_FensterListener(drittesFenster, fensterPosition, fensterHeight, fensterWidth));

		/* 4. Fenster links oben platzieren */
		fensterTitle = "";
		fensterPosition = "LINKS_OBEN";
		fensterHeight = 50;
		fensterWidth = 200;
		fensterFarbe = Color.green;
		s1_FensterProduzieren viertesFenster = new s1_FensterProduzieren(this);
		viertesFenster.setFensterNPHWC(fensterTitle, fensterPosition, fensterHeight, fensterWidth, fensterFarbe);
		this.addComponentListener(new s1_FensterListener(viertesFenster, fensterPosition, fensterHeight, fensterWidth));

	}

	/**
	 * main Methode <br>
	 * erzeugt das Anwendungsobjekt
	 * 
	 * @param Übergabeparameter
	 *            werden nicht verwendet
	 */
	public static void main(String[] args) { // Instanz der Anwendungsklasse
												// erzeugen
		new s1_FensterBeispiel();
	}

}

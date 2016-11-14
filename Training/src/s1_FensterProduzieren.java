import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 * Diese Klasse soll ein Beispiel für ein JWindow sein <br>
 * 
 * EinfachesFenster ist ein Kindfenster. <br>
 * Das Kindfenster wird relativ zum Vaterfenster positioniert und es hat einen
 * Rand aus der BorderFactory
 *
 * @author Prof. Silvia Keller, Hochschule Ravensburg-Weingarten
 *
 */

public class s1_FensterProduzieren extends JWindow {
	private static final long serialVersionUID = 1L;
	int fensterHeight, fensterWidth;
	int aktuellKoorX, aktuellKoorY;
	s1_FensterBeispiel tempFenster;
	private Color fensterFarbe;

	/**
	 * Konstruktor der Klasse <br>
	 * <br>
	 * Die Groesse wird fest eingestellt. Die Position relativ zu fenster wird
	 * berechnet. Das EinfacheFenster enhält ein Panel mit einem Rand - damit
	 * wird dem EinfachenFenster ein Rand gegeben
	 * 
	 * @param fenster
	 *            Das Vaterfenster zu diesem Object
	 */

	public void setFensterNPHWC(String fensterTitle, String fensterPosition, int fensterHeight, int fensterWidth,
			Color fensterFarbe) {
		this.fensterHeight = fensterHeight;
		this.fensterWidth = fensterWidth;
		this.fensterFarbe = fensterFarbe;
		this.setSize(fensterWidth, fensterHeight);

		switch (fensterPosition) {
		case "RECHTS_OBEN": {
			aktuellKoorX = (int) tempFenster.getLocation().getX() + (int) tempFenster.getWidth();
			aktuellKoorY = (int) tempFenster.getLocation().getY();
			break;
		}
		case "RECHTS_UNTEN": {
			aktuellKoorX = (int) tempFenster.getLocation().getX() + tempFenster.getWidth();
			aktuellKoorY = (int) tempFenster.getLocation().getY() + tempFenster.getHeight() - fensterHeight;
			break;
		}
		case "LINKS_OBEN": {
			aktuellKoorX = (int) tempFenster.getLocation().getX() - fensterWidth;
			aktuellKoorY = (int) tempFenster.getLocation().getY();
			break;
		}
		case "LINKS_UNTEN": {
			aktuellKoorX = (int) tempFenster.getLocation().getX() - fensterWidth;
			aktuellKoorY = (int) tempFenster.getLocation().getY() + tempFenster.getHeight() - fensterHeight;
			break;
		}
		}

		JPanel rand = new JPanel();
		/* Rand setzen geht nicht direkt */
		if (fensterTitle != null) {
			rand.setBorder(BorderFactory.createTitledBorder(fensterTitle));
			rand.setOpaque(true);
			rand.setBackground(this.fensterFarbe);
		} else {
			rand.setOpaque(false);
			System.out.println("-----");
		}
			
		this.getContentPane().add(rand);
		
		this.setLocation(aktuellKoorX, aktuellKoorY);
		this.setVisible(true);
	}

	public s1_FensterProduzieren(s1_FensterBeispiel fenster) {
		super(fenster); // JWindow ist Kindfester zum JFrame. Es entfällt ein
						// Windowlistener !
		tempFenster = fenster;
	}
}

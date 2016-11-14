
import java.awt.*;
import javax.swing.*;

/**
 * Überschrift:   Erstes Fenster
 * Beschreibung:  Zeigt das Erstellen eines Anwendungsfensters und die Verwendung von JavaDoc 
 * Copyright:     Copyright (c) 2010
 * Organisation:  Hochschule Ravensburg-Weingarten
 * @author Prof. S. Keller
 * @version 1.0
 */

public class ErstesFenster extends JFrame 
{
	// Diese Variable wird benötigt, da JFrame das Interface Serializable implementiert
	private static final long serialVersionUID = 1L;
	/**
	 * Standard Konstruktor.
	 * 
	 * Setzt die Fenstereingenschaften:  Titel, Grösse, Hintergrundfarbe, Sichtbarkeit
	 */
  public ErstesFenster()
  {  // bei Anwahl des x-Knopfes im Fensterbalken Anwendungs mit exit(0) beenden
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
	// Fenstereigenschaften setzen
    setTitle("1. Fenster");
    setSize(400,400);
    
    // ContentPane besorgen zum Einstellen der Hintergrundfarbe
    Container darstellungsFlaeche=this.getContentPane();
    // Hintergrundfarbe des ContentPane setzen
    darstellungsFlaeche.setBackground(Color.blue);
    
    // Fenster sichtbar machen
    setVisible(true);

  }
  /**
	 * Main-Methode zum Starten der Anwendung.
	 * 
	 * @param args Kommandozeilenparameter (nicht verwendet)
	 */ 
  public static void main(String[] args)
  {   // Instantz der Anwendungsklasse erzeugen
	  new ErstesFenster();
  }
}
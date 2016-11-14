import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * �berschrift:   Vorlesungsbeispiel 
 * Beschreibung:  BoxLayout und MouseListener
 * Copyright:     Copyright (c) 2006
 * Organisation:  Hochschule Ravensburg-Weingarten
 * @author Prof. Dr. Keller
 * @version 1.0
 */

public class s5_BeispielBoxLayout extends JFrame implements MouseListener
{ Container ausgabeflaeche;
  JButton taste1,taste2,taste3;

  public s5_BeispielBoxLayout()
  {this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   this.setSize(300,300);
   this.setTitle("Beispiel BoxLayout");
 
   /** Panel mit Boxlayout erzeugen und ins Fenster legen    */
   
   // Variante 1: Panel und Boxlayout in zwei Schritten erzeugen 
    JPanel panel=new JPanel();
    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
   
   
   /** Variante 2:  Panel mit Boxlayout in einem Schritt als Box erzeugen */
   //Box panel = new Box(BoxLayout.Y_AXIS);

   /** 3 Tasten erzeugen, Gr�sse und Ausrichtung festlegen */
   
   taste1=new JButton("Taste oben"); 
   taste1.setPreferredSize(new Dimension(100,100)); 
  // taste1.setMaximumSize(new Dimension(100,100));
 //  taste1.setMinimumSize(new Dimension(100,100));
   taste1.setAlignmentX(JComponent.CENTER_ALIGNMENT); 
   taste1.setAlignmentY(JComponent.TOP_ALIGNMENT);
   
   taste2=new JButton("Taste mitte --"); 
   taste2.setPreferredSize(new Dimension(50,50)); 
   taste2.setMaximumSize(new Dimension(50,50));
   taste2.setMinimumSize(new Dimension(50,50));
   taste2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
   taste2.setAlignmentY(JComponent.CENTER_ALIGNMENT);
   
   taste3=new JButton("Taste bottom --------"); 
   taste3.setPreferredSize(new Dimension(300,300)); 
   taste3.setAlignmentX(JComponent.CENTER_ALIGNMENT);
   taste3.setAlignmentY(JComponent.BOTTOM_ALIGNMENT);

   /** Tasten und L�ckenobjekte im Panel mit BoxLayout einf�gen */
   panel.add(taste1);                              /* Taste oben platzieren */
   panel.add(Box.createVerticalGlue());            /* L�cke variabler Gr�sse */
   panel.add(taste2);     
   panel.add(Box.createRigidArea(new Dimension(0,5))); /* Taste Mitte platzieren */
   //panel.add(Box.createVerticalStrut(10));         /*  L�cke mit fester Gr�sse */
   panel.add(taste3);                              /* Taste unten platzieren */

   /** Panel bzw. Box ins Fenster einf�gen */
   ausgabeflaeche=this.getContentPane();
   ausgabeflaeche.add(panel);

   /* Listener, der auf Mausaktionen h�rt registrieren */
   this.addMouseListener(this);

   /* Fenster sichtbar machen */
   this.setVisible(true);

  }

  /**  Implementierung der Methoden des Interfaces MouseListener */
  
  /** Wenn eine Maustaste gedr�ckt und wieder losgelassen wurde */
  public void mouseClicked(MouseEvent e)
  {    System.out.println("Mause clicked");
  
       // Ausgabe der Mouskoordintaen auf Konsole 
       System.out.println("X-Koordinate "+e.getX()+" und Y-Koordinate "+e.getY());
  }
 /** Mausezeiger wird �ber das Objekt ( Fenster ) positioniert */
  public void mouseEntered(MouseEvent e) 
  {System.out.println("Mause enter");
  System.out.println("Aktuelle Gr�sse Taste oben: "+taste1.getHeight()+"  "+taste1.getWidth());
  }
  
 /** Mauszeiger verl�sst das Objekt wieder */ 
 public void mouseExited(MouseEvent e) {System.out.println("Mause exit");}
 
 /** Wenn eine Maustaste gedr�ckt wurde */
 public void mousePressed(MouseEvent e){System.out.println("Mause pressed");}
 
 /** Wenn eine Maustaste wieder losgelassen wurde */
 public void mouseReleased(MouseEvent e) {System.out.println("Mause released");}



  public static void main(String[] args)
  {
    s5_BeispielBoxLayout beispielBoxLayout1 = new s5_BeispielBoxLayout();
  }
}

import java.awt.Color;
import javax.swing.*;
import java.awt.*;


public class s4_LabelBeispiel extends JFrame {

   public s4_LabelBeispiel()
   { this.setDefaultCloseOperation(EXIT_ON_CLOSE);

     Container zeichenflaeche=this.getContentPane();
     GridLayout meinlayout=new GridLayout(2,4);
     zeichenflaeche.setLayout(meinlayout);
     /* Nur Text */
     JLabel label1=new JLabel("Label 1 links deckend in rot ohne Rand",JLabel.LEFT); 
     label1.setBackground(Color.red); label1.setOpaque(true);
     
     JLabel label2=new JLabel("Label 2 rechts durchsichtig ohne Rand",JLabel.RIGHT); 
     
     JLabel label3=new JLabel("Label 3 Mitte deckend mit Rand",JLabel.CENTER);
     label3.setBorder(BorderFactory.createEtchedBorder()); label3.setOpaque(true);
     label3.setBackground(new Color(150,150,150));
     
     JLabel label4=new JLabel("Label 4 Mitte durchsichtig mit Rand ",JLabel.CENTER);
     label4.setBorder(BorderFactory.createEtchedBorder());
     
     /* Nur Bild gro� */
     JLabel label5=new JLabel(new ImageIcon(System.getProperty("user.dir")+"/src/icons/"+"book_icon3.png"));
     label5.setBorder(BorderFactory.createEtchedBorder());
 
     /* Text und Bild klein */
     JLabel label6=new JLabel("Label 6 Text und Bild klein JLabel LEFT",new ImageIcon(System.getProperty("user.dir")+"/src/icons/"+"book_icon3.png"),JLabel.LEFT);
     label6.setBorder(BorderFactory.createEtchedBorder());
     label6.setVerticalTextPosition(JLabel.TOP);
     label6.setIconTextGap(4);
     System.out.println("userdir: " + System.getProperty("user.dir"));
     JLabel label7=new JLabel("Label 7 JLabel Right",new ImageIcon(System.getProperty("user.dir")+"/src/icons/"+"book_icon2.png"),JLabel.RIGHT);
     label7.setBorder(BorderFactory.createEtchedBorder());
     label7.setVerticalTextPosition(JLabel.BOTTOM);
     label7.setIconTextGap(2);


     zeichenflaeche.add(label1);
     zeichenflaeche.add(label2);
     zeichenflaeche.add(label3);
     zeichenflaeche.add(label4);
     zeichenflaeche.add(label5);
     zeichenflaeche.add(label6);
     zeichenflaeche.add(label7);
     
     System.out.println("label1: "+label1.getPreferredSize());
     System.out.println("book_icon3.png: "+label5.getPreferredSize());
     System.out.println("book_icon2.png: "+label6.getPreferredSize());
     
     //this.setSize(800,400);
     this.pack();
     this.setVisible(true);
   }


   public static void main(String[] args) {
      s4_LabelBeispiel labelbeispiel1 = new s4_LabelBeispiel();
      System.out.println(System.getProperty("user.dir"));
   }
}
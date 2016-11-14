import java.awt.*;

import javax.swing.JFrame;


public class animation1 extends JFrame
{   int i;   // Z�hlervariable

	public static void main(String[] args) 
	{
		new animation1();
	}
	
	public animation1()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(100,100);
		this.setVisible(true);
		
		i=0;  // Z�hler startet bei 0
		
		// this.start();  nicht an dieser Stelle --> Der Fortschrittsbalken wird nicht erzeugt
		
		//  Fortschrittsbalken in einem eigenen Thread animieren		
		animation2 b = new animation2(this);
		Thread Threadb= new Thread(b,"animation2");
		Threadb.start(); 
		
		// im Haupt-Thread wird die Z�hlervariable hochgez�hlt
		this.start();  // Der Fortschrittsbalken ist in einem 2. Thread gestartet
	}
	
	public int getint(){return i;};
	
	public void start()
	{
		while(true) 
		{		
			repaint();  //diese ruft paint() auf
			
		try
            {
                Thread.sleep(100);  // Damit man den Z�hlerwert verfolgen kann
            }
            catch (InterruptedException e) {}
		}
		}
	
	public void paint(Graphics g)
	{   // zeichnet den Wert des Z�hlers an eine feste Position
		++i;  						// Z�hler erh�hen
		g.setColor(Color.blue);     // zeichnen mit der Farbe blau
		// Hintergrund neu zeichnen muss sein, damit Hintergrund und Text immer neu dargestellt wird
		// sonst wird Schrott angezeigt
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		// Text ausgeben
		g.drawString("Counter= " + i, 20, 45);
	}

}

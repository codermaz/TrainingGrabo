import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class s2_WindowMitShape extends JFrame implements MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 801760787911086315L;

	s2_WindowMitShape() {
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Feststellen, ob das GraphicsDevice Transparenz und Formen f�r Fenster
		// erlaubt
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		boolean isUniformTranslucencySupported = gd
				.isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.TRANSLUCENT);

		boolean isShapedWindowSupported = gd
				.isWindowTranslucencySupported(GraphicsDevice.WindowTranslucency.PERPIXEL_TRANSPARENT);

		if (!isUniformTranslucencySupported || !isShapedWindowSupported) {
			System.out.println("Shaped Window not allowed");
			System.exit(0);
		}

		this.setResizable(false);
		this.getContentPane().setLayout(new FlowLayout());

		JButton b = new JButton("1");

		// R�nder des Button auf 0 setzen
		b.setMargin(new Insets(0, 0, 0, 0));
		this.add(b);

		this.setUndecorated(true);
		this.addMouseListener(this);
/*
		S2_Dreieck dreieck = new S2_Dreieck();
		this.setShape(dreieck);
		// Das ist die Gr��e des Fensters und wird sp�ter f�r setSize()
		// gebraucht
		// Rectangle umschiessendesrechtecke = dreieck.getBounds();
		Rectangle umschiessendesrechtecke = dreieck.getBounds();

		// Fenster mittig auf Bildschirm platzieren
		// this.setLocationRelativeTo(null);
		this.setOpacity((float) 0.8);

		this.setVisible(true);
		// Fenster muss so gro� sein, damit das Dreieck vollst�ndig dargestellt
		// werden kann
		this.setSize(umschiessendesrechtecke.width, umschiessendesrechtecke.height);
*/	
		/////////////////////////////
		
		s2_Pentagon pentagon = new s2_Pentagon();
		this.setShape(pentagon);

		// Das ist die Gr��e des Fensters und wird sp�ter f�r setSize()
		// gebraucht
		// Rectangle umschiessendesrechtecke = dreieck.getBounds();
		Rectangle umschiessendesrechtecke2 = pentagon.getBounds();

		// Fenster mittig auf Bildschirm platzieren
		// this.setLocationRelativeTo(null);
		this.setOpacity((float) 0.8);

		this.setVisible(true);
		// Fenster muss so gro� sein, damit das Dreieck vollst�ndig dargestellt
		// werden kann
		this.setSize(umschiessendesrechtecke2.width, umschiessendesrechtecke2.height);

	}

	/* main-methode, da Startklasse der Anwendung */
	public static void main(String[] args) {
		new s2_WindowMitShape(); /* Klasse instanziieren */
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		System.out.println("Mouse Clicked button no:" + event.getButton());
		if (event.getButton() == 3) {
			System.exit(0);
		}
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		System.out.println("x=" + event.getX() + " y=" + event.getY());
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Mouse released button no:" + arg0.getButton());

	}
}

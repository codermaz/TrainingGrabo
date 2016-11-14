import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * Hinzufügen von JPanels und JLabels 
 * und verwenden eines BoxLayouts
 */
class BoxLayoutFrame extends JFrame{
public BoxLayoutFrame(){
	super("BoxLayout");
	setDefaultCloseOperation(
		JFrame.EXIT_ON_CLOSE);

	//BorderLayout für das Fenster einstellen
	getContentPane().setLayout(
		new BorderLayout());
		
	/*
	 * Hauptbereich des JFrames einstellen
	 */
		
	//JPanel für den Hauptbereich des JFrames
	JPanel mainPanel = new JPanel();
		
	//BoxLayout für das mainPanel einstellen
	mainPanel.setLayout(
		new BoxLayout(
			mainPanel,BoxLayout.PAGE_AXIS));
		
	//JLabels und JTextfields zur Eingabe
	JLabel lblUser = new JLabel("Login:");
	JTextField txtUser = new JTextField("User");
	JLabel lblPass = new JLabel("Password:");
	JPasswordField txtPass = new JPasswordField("pass");
		
	mainPanel.add(lblUser);
		
	mainPanel.add(
		Box.createRigidArea(new Dimension(0,5)));
		
	mainPanel.add(txtUser);
		
	mainPanel.add(
		Box.createRigidArea(new Dimension(0,5)));
		
	mainPanel.add(lblPass);
		
	mainPanel.add(
		Box.createRigidArea(new Dimension(0,5)));
		
	mainPanel.add(txtPass);
		
	/*
	 * Buttonbereich des JFrames einstellen
	 */
		
	//JPanel für die Buttons
	JPanel buttonPanel = new JPanel();
		
	//BoxLayout für das buttonPanel einstellen
	buttonPanel.setLayout(
		new BoxLayout(
			buttonPanel,BoxLayout.LINE_AXIS));
		
	//oben, links, unten, rechts
	buttonPanel.setBorder(
		BorderFactory.createEmptyBorder(5,0,5,0));
		
	//JButtons erstellen
	JButton btnOk = new JButton("Ok");
	JButton btnCancel = new JButton("Cancel");
		
	buttonPanel.add(
		Box.createHorizontalGlue());
		
	buttonPanel.add(btnOk);
		
	buttonPanel.add(
		Box.createRigidArea(
			new Dimension(5,0)));
		
	buttonPanel.add(btnCancel);
		
	//Hinzufügen der JPanels zum BorderLayout
	getContentPane().add(mainPanel);
	getContentPane().add(
		buttonPanel, BorderLayout.SOUTH);
		
	setSize(220,160);
	setLocation(50,50);
	setVisible(true);		
}
}
public class FrameCreator07_BoxLayout_mitRigidArea {
public static void main(String[] args){
	new BoxLayoutFrame();
}
}

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneInterface extends JFrame {
		
	private JTabbedPane tabbedPane = new JTabbedPane();
	
	public JPaneRecu getMessagesRecu() {
		return messagesRecu;
	}
	public void setMessagesRecu(JPaneRecu messagesRecu) {
		this.messagesRecu = messagesRecu;
	}
	public JPaneEnvoi getMessageEnvoie() {
		return messageEnvoie;
	}
	public void setMessageEnvoie(JPaneEnvoi messageEnvoie) {
		this.messageEnvoie = messageEnvoie;
	}
	private PapotageListener b;
	private JList liste;
	private JPaneRecu messagesRecu;
	private JPaneEnvoi messageEnvoie; 
	
	
	public JTabbedPaneInterface(PapotageListener b) {	
		this.setLayout(null);
		this.b = b;		
		this.messagesRecu = new JPaneRecu(b,this);
		this.messageEnvoie=new JPaneEnvoi(b,this);
		this.setBounds(0, 0, 1000, 750);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Papoteur Interface de " + b.getName());
		this.setResizable(false);

		tabbedPane.setBounds(0, 0, 982, 705);
		tabbedPane.addTab("Boîte de réception", messagesRecu);		
		tabbedPane.addTab("Envoyer un message", messageEnvoie);

		this.getContentPane().add(tabbedPane);
		
	}
	public void refreshMess() {
		this.repaint();
		this.revalidate();
			
	}
	public PapotageListener getPapoteur() {
		return this.b;
	}
	public void reload() {
		this.messagesRecu.repaint();
	}
}

 
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneInterface extends JFrame {
		
	private JTabbedPane tabbedPane = new JTabbedPane();
	
	private PapotageListener b;
	private JList liste;
	private JPaneRecu messagesRecu;
	private JPaneEnvoi messageEnvoie; 
	
	
	public JTabbedPaneInterface(PapotageListener b) {	
		this.setLayout(null);
		this.b = b;		
		/*ArrayList<PapotageEvent> listeMessages = this.b.getMessages();
		String[] choix = new String[20];
		for(int i = 0; i<listeMessages.size();i++) {
			choix[i] = " " + listeMessages.get(i).getEmetteur() + " : " +listeMessages.get(i).getSujet();
			}*/
		this.messagesRecu = new JPaneRecu(b,this);
		this.messageEnvoie=new JPaneEnvoi(b,this);
		this.setBounds(0, 0, 1000, 750);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Papoteur Interface de " + b.getName());
		this.setResizable(false);
		//messagesRecu.setLayout(null);
		/*this.liste = new JList(choix);
		this.liste.setBounds(5,5,350,680);
		this.liste.setFixedCellHeight(50);
		this.liste.setSelectedIndex(0);
		messagesRecu.setBackground(Color.BLUE);
		messagesRecu.add(this.liste);*/
		//this.setBackground(Color.BLUE);
		tabbedPane.setBounds(0, 0, 982, 705);
		tabbedPane.addTab("Boîte de réception", messagesRecu);		
		tabbedPane.addTab("Envoyer un message", messageEnvoie);
		//tabbedPane.setLayout(null);
		this.getContentPane().add(tabbedPane);
		
	}
	public void refreshMess() {
		this.repaint();
		this.revalidate();
			
	}
	public PapotageListener getPapoteur() {
		return this.b;
	}
}

 
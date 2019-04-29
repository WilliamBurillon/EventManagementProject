import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class JTabbedPaneInterface extends JFrame {
		
	private JTabbedPane tabbedPAne = new JTabbedPane();
	private JPanel creation = new JPanel();
	private JPanel login = new JPanel();
	public JTabbedPaneInterface() {
		
		
		
		this.setBounds(100, 100, 1000, 750);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		this.getContentPane().setLayout(null);
		this.getContentPane().add(tabbedPAne);
		tabbedPAne.setBounds(0, 0, this.getWidth(), this.getHeight());
		tabbedPAne.addTab("Login", login);
		
		tabbedPAne.addTab("Subscribe", creation);
		
		
		
	
		
		
		
		
		
	}

}

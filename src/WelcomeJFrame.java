import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class WelcomeJFrame extends JFrame{
	
	private JButton creation;
	private JButton login;
	private JLabel text;
	private WelcomePanel wp= new WelcomePanel(this);
	private SubscribePanel sp = new SubscribePanel(this);
	private LoginPanel lp = new LoginPanel(this);

	private JPanel lePanel = new JPanel();
	private ConciergePanel cP = new ConciergePanel(this);
	
	private ArrayList<JTabbedPaneInterface> Jl = new ArrayList<JTabbedPaneInterface>();
	//private ArrayList<Bavard> bv;
	private ArrayList<Concierge> cge;
	//private Concierge cge;
	public WelcomeJFrame(ArrayList<Concierge> cge) {
		
		this.cge=cge;
		
		
		
		

	
		this.setBounds(0, 0, 1000, 750);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Bavard Network");
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		for (int i =0; i<cge.size();i++) {
			this.sp.getCB().addItem(this.cge.get(i).getName());
		}
		
		this.setContentPane(this.wp);
		this.setVisible(true);
		
	}
	
	public void goToSubscribe() {
		System.out.println("ouloulou1");
		this.setContentPane(this.sp);
		
		this.revalidate();
	}
	
	public void goToLogin() {
		this.setContentPane(this.lp);
		this.revalidate();
	}
	public void goToCoco(PapotageListener b) {
		//this.setContentPane(this.cc);
		//this.revalidate();
		this.setContentPane(wp);
		this.revalidate();
		JTabbedPaneInterface j = new JTabbedPaneInterface(b);
		this.Jl.add(j);
		b.setPane(j.getMessagesRecu());		
	}
	public void goToConcierge() {
		this.setContentPane(cP);
		this.revalidate();
		
	}
	public ArrayList<Concierge> getConcierge() {
		return this.cge;
	}
	public void goToMenu() {
		
		this.setContentPane(this.wp);
		this.revalidate();
	}
	public void conciergeInter(Concierge b) {
		this.setContentPane(wp);
		this.revalidate();
		System.out.println("gosjglkjsdlkgjsdk");
		ConciergeFrame cg = new ConciergeFrame(b,this);
		
		
	}

	public void addBavard(Concierge c, Bavard b) {
		c.addBavard(b);
		
	}
	
	public SubscribePanel getSP() {
		return sp;
	}
	public void closeBavardInterface(PapotageListener p) {
		for (int i =0;i<this.Jl.size();i++) {
			if (Jl.get(i).getPapoteur().equals(p)) {
				Jl.get(i).dispose();
				Jl.remove(Jl.get(i));
			}
}
	}}


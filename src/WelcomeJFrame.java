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
	private CocoPanel cc = new CocoPanel();
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
		//this.lePanel=new JPanel();
		
		
		
		
		//lePanel.setBounds(0, 0, 1000, 750);
		/*lePanel.setLayout(null);
		
		
		ImageIcon imageIcon = new ImageIcon("POLYTECH_ANNECY-CHAMBERY.jpg"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(900, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		
		JLabel imageI = new JLabel(imageIcon );
		imageI.setBounds(50, 0, 900, 200);
		
		this.creation = new JButton("Subsrcibe");
		creation.setBounds(400, 370, 200, 70);
		
		creation.addActionListener(new EcouteurBoutonChanger());
		
		//creation.set
		//creation.setBounds(50, 50, this.getWidth()/10, this.getHeight()/10);
		this.login = new JButton("Login");
		login.setBounds(400, 480, 200, 70);;
		this.text = new JLabel("Welcome to the BAVARD NETWORK");
		text.setBounds(60, 220, 1000, 100);
		Font font = new Font("abadi mt", Font.BOLD,50);
		text.setFont(font);
		lePanel.add(creation);
		lePanel.add(login);
		lePanel.add(text);
		lePanel.add(imageI);*/
		//lePanel.add(creation,BorderLayout.CENTER);
		//lePanel.add(text,BorderLayout.SOUTH);
		//this.add(lePanel,BorderLayout.CENTER);		
		//this.add(creation);
		//this.add(login,BorderLayout.CENTER);
		//this.add(text,BorderLayout.NORTH);
		//this.add(lePanel);
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
	/*@Override
	 public void actionPerformed(ActionEvent clic) {
        //Appelle la méthode de changement de panel
		System.out.println("ouloulou2");
		this.goToSubrcibe();
    }*/
	
	public void addBavard(Concierge c, Bavard b) {
		c.addBavard(b);
		
	}
	/*public ArrayList<Concierge> getConcierges(){
		System.out.println("oiooi");
		return cge;
	}*/
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


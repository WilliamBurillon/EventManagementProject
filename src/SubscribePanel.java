import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class SubscribePanel extends JPanel implements ActionListener {
		private final static int  POSITIONX = 300;
		private WelcomeJFrame j;
		private JButton back;
		private JButton sub;
		private JTextField nm;
		private JTextField pw;
		private JTextField year;
		private JComboBox<String> jc;
	public SubscribePanel(WelcomeJFrame j) {
		this.j=j;
		
		this.setLayout(null);
		JLabel l = new JLabel("Sign Up");
		l.setBounds(400, 50, 200, 100);
		Font font = new Font("abadi mt", Font.BOLD,50);
		l.setFont(font);
		
		JLabel name = new JLabel("Name : ");
		name.setBounds(POSITIONX,210,100,100);
		Font font1 = new Font("abadi mt", Font.BOLD,20);
		name.setFont(font1);
		
		
		JLabel pwd = new JLabel("Password : ");
		//Font font = new Font("abadi mt", Font.BOLD,20);
		pwd.setFont(font1);
		pwd.setBounds(POSITIONX, 290, 200, 100);
		
		JLabel age = new JLabel("Birthday : ");
		age.setFont(font1);
		age.setBounds(POSITIONX, 360, 200, 100);
		
		//age.setBounds(100, 250, 100, 100);
		
		JLabel concierge = new JLabel("Caretaker : ");
		concierge.setFont(font1);
		concierge.setBounds(POSITIONX, 430, 200, 100);
		
		
		// JTextField
		
		this.nm = new JTextField();
		nm.setBounds(POSITIONX+120, 245, 250, 35);
		nm.setText("");
		
		this.pw = new JTextField();
		pw.setBounds(POSITIONX+120, 325, 250, 35);
		
		this.year = new JTextField();
		year.setBounds(POSITIONX+120, 395, 250, 35);
		
		
		
		// JCombo
		
		this.jc = new JComboBox<String>();
		jc.setBounds(POSITIONX+120, 465, 250, 35);
		//jc.addItem(j.getConcierge().toString());
		//j.setSelectedItem("Your caretaker");
		// reste a mettre une valeur par defaut non sectinnable
		//System.out.println("oker  : " + j.getConcierges().get(0).getName());
	/*	for (int i =0; i<j.getConcierges().size();i++) {
			System.out.println("fsejfklse");
			jc.addItem(j.getConcierges().get(0).getName());
			
		}*/
		
		//String leNom = j.getConcierge().getName();
		//jc.addItem(leNom);
		//jc.addItem("ybtfsd");
	//	jc.addItem("ybtfsfdsd");
		//JButton
		
		this.sub = new JButton("Submit");
		
		sub.setBounds(400, 550, 200,70);
		sub.addActionListener(this);
		
		
	this.back = new JButton("<-- Back");
		
		back.setBounds(50, 600, 120,40);
		back.addActionListener(this);
		
				
		
		this.add(l);
		this.add(name);
		this.add(pwd);
		this.add(age);
		this.add(concierge);
		this.add(nm);
		this.add(pw);
		this.add(year);
		this.add(jc);
		this.add(sub);
		this.add(back);
		
	}
	/*public void ajoutConcierge(ArrayList<Concierge> c ) {
		for (int i =0; i<j.getConcierges().size();i++) {
			System.out.println("fsejfklse");
			jc.addItem(j.getConcierges().get(0).getName());
			
		}
	}*/
/*	public void addConcierge(Concierge c) {
		jc.addItem(j.getConcierge().getName());
	}*/
	public JComboBox<String> getCB(){
		return this.jc;
	}
	@Override
	 public void actionPerformed(ActionEvent clic) {
      //Appelle la méthode de changement de panel
		Object source = clic.getSource();
		if (source == back) {
			j.goToMenu();
			nm.setText("");
			pw.setText("");
			year.setText("");
		}
		else if (source == sub) {
			//System.out.println("add ");
			
			
			//j.addBavard(j.getConcierge(),b );
			
			Concierge c;
			for (int i =0; i<j.getConcierge().size();i++) {
				
				if (j.getConcierge().get(i).getName()==jc.getSelectedItem()) {
					c = j.getConcierge().get(i);
					Bavard b = new Bavard(nm.getText(),pw.getText(),year.getText(),c,null);
					boolean est_pasDedans = true;
					for (int k=0; k<c.l.size();k++) {
						if (b.getName().equals(c.l.get(k).getName()) &&b.getMdp().equals(c.l.get(k).getMdp() )) {
							System.out.println("est dedans");
							est_pasDedans = false;
							JOptionPane p = new JOptionPane();
							p.showMessageDialog(this,
								    "Account still exists",
								    "",
								    JOptionPane.ERROR_MESSAGE);
						}
					}
					if (est_pasDedans) {
						j.addBavard(c, b);
						
					}
					
					
					for (int j =0; j<c.l.size();j++) {
					System.out.println(c.l.get(j).getName());
					}
					
					
				}
			}
			
		nm.setText("");
		pw.setText("");
		year.setText("");
			
		}
	}
}
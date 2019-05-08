import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConciergePanel extends JPanel  implements ActionListener{
	private final static int  POSITIONX = 300;
	private JButton back;
	private JButton sub;
	private WelcomeJFrame j;
	private JTextField nm;
	private JTextField pw;
	
	public ConciergePanel(WelcomeJFrame j) {
		
		this.setLayout(null);
		this.j=j;
		
		
		JLabel l = new JLabel("Sign in as CareTaker");
		l.setBounds(250, 50, 500, 100);
		
		Font font = new Font("abadi mt", Font.BOLD,50);
		l.setFont(font);
		
		
		JLabel name = new JLabel("Name : ");
		name.setBounds(POSITIONX,230,100,100);
		Font font1 = new Font("abadi mt", Font.BOLD,20);
		name.setFont(font1);
		
		
		
		JLabel pwd = new JLabel("Password : ");
		//Font font = new Font("abadi mt", Font.BOLD,20);
		pwd.setFont(font1);
		pwd.setBounds(POSITIONX, 330, 200, 100);
		
		
		
		
		
		this.nm = new JTextField();
		nm.setBounds(POSITIONX+120, 265, 250, 35);
		
		this.pw = new JTextField();
		pw.setBounds(POSITIONX+120, 365, 250, 35);
		
		
		
		
		this.sub = new JButton("Validate");
		sub.addActionListener(this);
		sub.setBounds(400, 500, 200,70);
		
		
		this.back = new JButton("<-- Back");
		
		back.setBounds(50, 600, 120,40);
		back.addActionListener(this);
		
		
		
		
		
		
		this.add(l);
		this.add(name);
		this.add(pwd);
		this.add(nm);
		this.add(pw);
		this.add(sub);
		this.add(back);
		

		
	}
	 public void actionPerformed(ActionEvent clic) {
	      //this method manage the different button 
			Object source = clic.getSource();
			if (source == back) {
				j.goToMenu();
				nm.setText("");
				pw.setText("");
				
			}else if(source == sub){
				System.out.println("oker");
				// this part create a new JFram in relation with the current caretaker
				for (int i =0; i< j.getConcierge().size();i++) {
					
						if (nm.getText().equals(j.getConcierge().get(i).getName()) && pw.getText().equals(j.getConcierge().get(i).getMdp())) {
							
							j.conciergeInter(j.getConcierge().get(i));
							break;
							
						}
						
					}
				// refresh the text field
				nm.setText("");
				pw.setText("");
				
				}
			}
		}
	
	
	
	



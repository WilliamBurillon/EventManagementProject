import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel implements ActionListener {
	private final static int  POSITIONX = 300;
	private JButton back;
	private JButton sub;
	private WelcomeJFrame j;
	private JTextField nm;
	private JTextField pw;
		public LoginPanel(WelcomeJFrame j) {
			this.setLayout(null);
			this.j=j;
			
			
			JLabel l = new JLabel("Sign in");
			l.setBounds(400, 50, 200, 100);
			
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
			nm.setText("");
			
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
		      //Appelle la méthode de changement de panel
				Object source = clic.getSource();
				if (source == back) {
					j.goToMenu();
					nm.setText("");
					pw.setText("");
				
					
				}else if(source == sub){
					boolean find = false;
					for (int i =0; i< j.getConcierge().size();i++) {
						for (int k=0;k<j.getConcierge().get(i).l.size();k++) {
							if (nm.getText().equals(j.getConcierge().get(i).l.get(k).getName()) && pw.getText().equals(j.getConcierge().get(i).l.get(k).getMdp())) {
								j.goToCoco(j.getConcierge().get(i).l.get(k));
								find = true;
								break;
							}
							
						}
					}
					if (!find) {
						
							JOptionPane p = new JOptionPane();
							p.showMessageDialog(this,
								    "This account doesn't exist",
								    "",
								    JOptionPane.ERROR_MESSAGE);
							
						
					}
					nm.setText("");
					pw.setText("");
					
				}
			}
}

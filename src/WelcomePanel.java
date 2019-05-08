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
public class WelcomePanel extends JPanel implements ActionListener{
		private WelcomeJFrame j;
		private JButton creation;
		private JButton login;
		private JButton concierge;
	public WelcomePanel(WelcomeJFrame j) {
		this.j=j;
		this.setLayout(null);
		ImageIcon imageIcon = new ImageIcon("POLYTECH_ANNECY-CHAMBERY.jpg"); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(900, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		
		JLabel imageI = new JLabel(imageIcon );
		imageI.setBounds(50, 0, 900, 200);
		
		this.creation = new JButton("Subscribe");
		creation.setBounds(400, 370, 200, 70);
		
		creation.addActionListener(this);
		
	
		this.login = new JButton("Login");
		login.setBounds(400, 480, 200, 70);;
		login.addActionListener(this);
		
		this.concierge=new JButton("Conciergerie");
		concierge.setBounds(50, 620, 150, 50);
		concierge.addActionListener(this);
		JLabel text = new JLabel("Welcome to the BAVARD NETWORK");
		text.setBounds(60, 220, 1000, 100);
		Font font = new Font("abadi mt", Font.BOLD,50);
		text.setFont(font);
		this.add(creation);
		this.add(login);
		this.add(text);
		this.add(imageI);
		this.add(concierge);
	}
	public void goToSubsrcibe() {
		
		this.j.goToSubscribe();
	}
	public void goToLogin() {

		this.j.goToLogin();
	
	}
	
	@Override
	 public void actionPerformed(ActionEvent clic) {
       //Appelle la méthode de changement de panel
		Object source = clic.getSource();
		if (source == creation) {
			this.goToSubsrcibe();
			
		}
		else if (source == login){
			
			this.goToLogin();
		}
		else if(source == concierge) {
			this.j.goToConcierge();
		}

	
   }
}

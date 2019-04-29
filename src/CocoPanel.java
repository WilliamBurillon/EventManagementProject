import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CocoPanel extends JPanel {
		
	public CocoPanel() {
		
		this.setLayout(null);
		//this.j=j;
		
		
		JLabel l = new JLabel("Youhou les copines");
		l.setBounds(200, 50, 800, 100);
		Font font1 = new Font("abadi mt", Font.BOLD,50);
		l.setFont(font1);
		this.add(l);
		
	}
}

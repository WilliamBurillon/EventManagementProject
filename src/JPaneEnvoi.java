import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class JPaneEnvoi extends JPanel implements ActionListener{
		private PapotageListener b;
		private JButton env;
		private JTextArea content;
		private JTextField lobj;
		private JTabbedPaneInterface jt;
		public JPaneEnvoi(PapotageListener b,JTabbedPaneInterface jt ) {
			this.jt=jt;
			this.setLayout(null);
			this.b=b;
			this.setBounds(0, 0,  982, 705);
			
			JLabel bo = new JLabel("Boite d'envoie");
			bo.setBounds(0,0,100,20);
			
			
			JLabel obj = new JLabel("Objet : ");
			obj.setBounds(0,40,100,20);
			
			this.lobj = new JTextField();
			lobj.setBounds(50,40,100,20);
			
			
			JLabel cont = new JLabel("Contenu du message : ");
			cont.setBounds(0,60,170,20);
			
			
	
			this.content = new JTextArea();
		
			content.setBounds(30,90,910,500);
			content.setLineWrap(true);
			
			this.env = new JButton("Envoyer");
			env.setBounds(720, 600, 200, 40);
			env.addActionListener(this);
			
			
			this.add(bo);
			this.add(obj);
			this.add(lobj);
			this.add(cont);
			this.add(content);
			this.add(env);
		}
		@Override
		public void actionPerformed(ActionEvent clic) {
			// this function generate a Papotage Event
			Object source = clic.getSource();
			if(source == env) {
				this.b.generatePapotageEvent( content.getText(),lobj.getText());
				JOptionPane p = new JOptionPane();
				p.showMessageDialog(this,
					    "Papotage send",
					    "",
					    JOptionPane.PLAIN_MESSAGE);
				this.content.setText("");
				this.lobj.setText("");
				
			}
			
		}
}

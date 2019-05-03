import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
public class JPaneRecu extends JPanel{
		private JList j;
		private PapotageListener b;
		private JPanel messag;
		//private MouseListener m = new MouseListener();
	public JPaneRecu(PapotageListener b) {
		
		this.setLayout(null);
		this.b=b;
		this.setBounds(0, 0,  982, 705);
		PapotageEvent[] message = new PapotageEvent[10];
		System.out.println(b.getName());
		for (int i =0; i < b.getList().size();i++) {
			message[i]= b.getList().get(i);
		}
		
		
		
		// Container to show the message 	
				this.messag = new JPanel();
				messag.setLayout(null);
				messag.setBounds(365, 20,605, 638);
				
				
				
				
				JLabel titre = new JLabel("Message reçu");
				titre.setBounds(0,0,150,20);
			
				
				JLabel de = new JLabel("De : ");
				de.setBounds(0,40,30,20);
				
				JLabel vient =new JLabel();
				vient.setBounds(40,40,200,20);
				
				JLabel obj = new JLabel("Objet : ");
				obj.setBounds(0,80,50,20);
				JLabel obje = new JLabel();
				obje.setBounds(55,80,200,20);
				
				
				
				JLabel cont = new JLabel("Contenu : ");
				cont.setBounds(0,120,100,20);
				JTextArea content = new JTextArea();
				//JLabel content = new JLabel();
				content.setBounds(5, 150, 595, 450);
				content.setLineWrap(true);
				//content.setOpaque(true);
				//content.setBackground(Color.RED);
				//content.
				
		
		
		
		
		
		
		
		
		
		
		
		
		j = new JList(message);
		this.setBackground(Color.BLUE);
		j.setBounds(5,5,350,668);
		j.setFixedCellHeight(50);
		j.setSelectedIndex(0);
		j.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				try {
				int selected_value = j.getSelectedIndex();
				vient.setText(b.getList().get(selected_value).getEmetteur());
				obje.setText(b.getList().get(selected_value).getSujet());
				content.setText(b.getList().get(selected_value).getCorps());
				}
				catch  (Exception e){
					System.out.println(e.toString());
					} 
				}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
		messag.add(titre);		
		messag.add(de);
		messag.add(obj);
		messag.add(cont);
		messag.add(vient);
		messag.add(obje);	
		messag.add(content);
		//-------Add to the prinipal panel
		this.add(j);
		this.add(messag);
		
		
	}
	
	public void getIndex() {
		System.out.println(j.getSelectedIndex());
		//return null;
	}
}

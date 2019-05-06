import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
public class JPaneRecu extends JPanel implements ActionListener{
		private JList j;
		private PapotageListener b;
		private JPanel messag;
		private JTabbedPaneInterface jt;
		private JButton but;
		private JTextArea content;
		private JScrollPane sp;
		//PapotageEvent[] message = new PapotageEvent[100];
		//private MouseListener m = new MouseListener();
	public JPaneRecu(PapotageListener b,JTabbedPaneInterface jt) {
		this.jt = jt;
		this.setLayout(null);
		this.b=b;
		this.setBounds(0, 0,  982, 705);
		PapotageEvent[] message = new PapotageEvent[10];
		System.out.println("taillle  ; " + b.getList().size());
		for (int i =0; i < b.getList().size();i++) {
			message[i]= b.getList().get(i);
			
		}
		
		
		
		// Container to show the message 	
				this.messag = new JPanel();
				messag.setLayout(null);
				messag.setBounds(365, 20,605, 638);
				messag.setBackground(Color.WHITE);
				
				
				
				
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
				content.setBounds(5, 145, 595, 450);
				content.setLineWrap(true);
				//content.setOpaque(true);
				//content.setBackground(Color.RED);
				//content.
				
		
		
		
		
		this.but= new JButton("Refresh");
		but.addActionListener(this);
		but.setBounds(135,620,90,40);
		
		
		
		//JScrollPane scrollPane = new JScrollPane();
		
		
		
		
		j = new JList(b.getList().toArray());
		this.setBackground(Color.WHITE);
		j.setBounds(5,5,350,600);
		j.setFixedCellHeight(50);
		j.setSelectedIndex(0);
		//scrollPane.setViewportView(j);
	//	scrollPane.setBounds(5, 5, 350, 600);
		//j.addNotify();
		//this.sp = new JScrollPane(j);
		
	//sp.setBounds(5, 5, 350, 600);
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
		//JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
          //      sp,
         //      j);
		
		 	
		messag.add(titre);		
		messag.add(de);
		messag.add(obj);
		messag.add(cont);
		messag.add(vient);
		messag.add(obje);	
		messag.add(content);
		//-------Add to the prinipal panel
		
		this.add(messag);
		this.add(but);
		//this.add(sp);
		this.add(j);
		//this.add(splitPane);
		
	}
	
	/*public void getIndex() {
		System.out.println(j.getSelectedIndex());
		//return null;
	}*/

	@Override
	public void actionPerformed(ActionEvent clic) {
		// TODO Auto-generated method stub
		Object source = clic.getSource();
		if(source==this.but) 
			
			this.add(j);
			
			System.out.println("avant ");
			System.out.println("taillle  ; " + b.getList().size());
		//	this.j.repaint();
			this.j.setListData(b.getList().toArray());
			
			//sp.repaint();
			//sp.validate();
			
			//this.revalidate();
		//	this.repaint();
			
			System.out.println("apres");
	}
	
}

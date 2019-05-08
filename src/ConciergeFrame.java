import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class ConciergeFrame extends JFrame implements ActionListener{
	private JList jl;
	private Concierge j;	
	private JPanel lePanel;
	private PapotageListener selectBavard = new Bavard();
	private JButton remove;
	private WelcomeJFrame wj;
	public ConciergeFrame(Concierge j, WelcomeJFrame wj) {
		this.j=j; 
		this.wj=wj;
		this.setLayout(null);
		this.setBounds(0, 0, 1000, 750);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("Concierge Interface de " + j.getName());
		this.setBackground(Color.BLUE);
		this.setResizable(false);
		JLabel title = new JLabel("Papoteur List : ");
		title.setBounds(100, 0, 1000, 100);
		Font font = new Font("abadi mt", Font.BOLD,20);
		title.setFont(font);
		this.lePanel=new JPanel();
		lePanel.setLayout(null);
		
		
		jl = new JList(j.getListLis().toArray());
		
		jl.setBounds(20,80,590,600);
		jl.setFixedCellHeight(50);
		jl.setSelectedIndex(0);
	
		jl.addMouseListener(new MouseListener() {

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
					int selected_value = jl.getSelectedIndex();
					selectBavard = j.getListLis().get(selected_value);
					
					System.out.println(selectBavard);
					
				//}
				}catch  (Exception e){
					System.out.println(e.toString());
					} 
			}
		
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		remove = new JButton("Remove");
		remove.setBounds(700,600,150,50);
		remove.addActionListener(this);
		
		
		
		lePanel.add(jl);
		lePanel.add(title);
		lePanel.add(remove);
		
		this.setContentPane(lePanel);
		
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent click) {
		
		//this function is used to remove a bavard from the system related to a caretaker
	
		Object source = click.getSource();
		if(source == remove) {
			j.removeBavard(this.selectBavard.getName());
			this.selectBavard.removeConcierge(j);
			this.wj.closeBavardInterface(this.selectBavard);
			this.jl.setListData(j.l.toArray());
			this.lePanel.repaint();
		}
		
	}
	
}

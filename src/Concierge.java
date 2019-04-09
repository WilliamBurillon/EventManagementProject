import java.util.ArrayList;
public class Concierge implements PapotageListener{

	public ArrayList<Bavard> l;
	
	
	
	public Concierge() {
		this.l  = new ArrayList<Bavard>();
		
	}
	
	public void addBavard(Bavard b) {
		
		
		this.l.add(b);
		
	}
	
	public void removeBavard(String name) {
		
		for (int i = 0 ; i<this.l.size();i++) {
			if (this.l.get(i).getName() == name) {
				this.l.remove(l.get(i));
			}
			
		}
	}
	
	public void broadcastPapotageEvent(PapotageEvent p) {
		
		
	
	}
	@Override
	public void onPapotageEvent(PapotageEvent p) {
		// TODO Auto-generated method stub
		for (int i =0;i<this.l.size();i++) {
			if (p.getEmetteur()!= this.l.get(i).getName()){
				p.setRecepteur(this.l.get(i).getName());
				this.l.get(i).onPapotageEvent(p);
			}
		}
		
	}

}

import java.util.ArrayList;
public class Concierge implements PapotageListener{

	public ArrayList<PapotageListener> l;
	private String name;
	
	
	public Concierge(String name) {
		this.l  = new ArrayList<PapotageListener>();
		this.name=name;
	}
	
	public void addBavard(PapotageListener b) {
		
		
		this.l.add(b);
		System.out.println("a été ajouter ");
		
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
	public String getName() {
		return this.name;
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
	public String getMdp() {
		return "oker";
	}

}

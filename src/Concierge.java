import java.util.ArrayList;
public class Concierge implements PapotageListener{

	public ArrayList<PapotageListener> l;
	private String name;
	private String mdp;
	
	
	public Concierge(String name,String mdp) {
		this.l  = new ArrayList<PapotageListener>();
		this.name=name;
		this.mdp=mdp;
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
		//when the caretaker receive the message, he broadcast the message to all his subscriber, expect the 
		// subscriber who had writted the message
		System.out.println("fsfsd");
		for (int i =0;i<this.l.size();i++) {
			
			if (p.getEmetteur()!= this.l.get(i).getName()){
				p.setRecepteur(this.l.get(i).getName());
				this.l.get(i).onPapotageEvent(p);
				this.l.get(i).onPapotageEventbool();
			}
		}
		
	}
	public String getMdp() {
		return this.mdp;
	}

	@Override
	public ArrayList<PapotageEvent> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<PapotageListener> getListLis(){
		return this.l;
	}
	@Override
	public void generatePapotageEvent(String corps, String mess) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onPapotageEventbool() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeConcierge(Concierge c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPane(PapotageListener p) {
		// TODO Auto-generated method stub
		
	}
	
	
}

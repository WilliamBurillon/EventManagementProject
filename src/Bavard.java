import java.util.ArrayList;

public class Bavard implements PapotageListener {
	private ArrayList<PapotageListener> concierge;
	private String name;
	
	
	public Bavard(String name, PapotageListener concierge) {
		this.name = name;
		this.concierge=new ArrayList<PapotageListener>();
		this.concierge.add(concierge);
		
	}
	
	
	/*public PapotageListener getConcierge() {
		return concierge;
	}

	public void setConcierge(PapotageListener concierge) {
		this.concierge = concierge;
	}
	*/
	public void addConcierge(PapotageListener c) {
		this.concierge.add(c);
	}
	public void removeConcierge(PapotageListener c) {
		this.concierge.remove(c);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void generatePapotageEvent(String corps, String mess) {
		PapotageEvent p = new PapotageEvent(this);
		p.setCorps(corps);
		p.setSujet(mess);
		p.setEmetteur(this.name);
		for (int i =0; i<concierge.size();i++) {
			concierge.get(i).onPapotageEvent(p);
		}
		
	}

	@Override
	public void onPapotageEvent(PapotageEvent p) {
		
		System.out.println(p);
		
	}
	
	
	
	
}
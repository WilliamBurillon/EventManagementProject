
public class Bavard implements PapotageListener {
	private PapotageListener concierge;
	private String name;
	
	
	public Bavard(String name, PapotageListener concierge) {
		this.name = name;
		this.concierge=concierge;
		
	}
	
	public PapotageListener getConcierge() {
		return concierge;
	}

	public void setConcierge(PapotageListener concierge) {
		this.concierge = concierge;
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
		concierge.onPapotageEvent(p);
	}

	@Override
	public void onPapotageEvent(PapotageEvent p) {
		
		System.out.println(p);
		
	}
	
	
	
	
}
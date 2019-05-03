import java.util.ArrayList;

public class Bavard implements PapotageListener {
	private ArrayList<PapotageListener> concierge;
	private String name;
	private String mdp;
	private String birth;
	private ArrayList<PapotageEvent> list= new ArrayList<PapotageEvent>();
	
	
	public Bavard(String name,String mdp,String birth, PapotageListener concierge ) {
		this.name = name;
		this.mdp=mdp;
		this.birth=birth;
		this.concierge=new ArrayList<PapotageListener>();
		this.concierge.add(concierge);
		
	}
	
	public Bavard(String name ) {
		this.name = name;
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
	public String getMdp() {
		return mdp;
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
			System.out.println("sff");
		}
		
	}
	
	public ArrayList<PapotageEvent> getList() {
		return list;
	}

	public void setList(ArrayList<PapotageEvent> list) {
		this.list = list;
	}

	@Override
	public void onPapotageEvent(PapotageEvent p) {
		
		System.out.println(p);
		list.add(p);
		
	}
	
	
	
	
}
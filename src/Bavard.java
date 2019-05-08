import java.util.ArrayList;

public class Bavard implements PapotageListener {
	private ArrayList<PapotageListener> concierge;
	private String name;
	private String mdp;
	private String birth;
	private ArrayList<PapotageEvent> list= new ArrayList<PapotageEvent>();
	// this attribute is use to refresh the receive pane when a papotageEvent come
	private PapotageListener paneRecu;
	
	public Bavard() {
		this.name=null;
		this.mdp=null;
		this.concierge= null;
		this.birth=null;
		this.list = null;
	}
	public Bavard(String name,String mdp,String birth, PapotageListener concierge,  PapotageListener paneRecu) {
		this.name = name;
		this.mdp=mdp;
		this.birth=birth;
		this.concierge=new ArrayList<PapotageListener>();
		this.concierge.add(concierge);
		this.paneRecu=paneRecu;
	}
	
	public Bavard(String name ) {
		this.name = name;
	}
	public void setPane(PapotageListener pane) {
		this.paneRecu=pane;
	}
	
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
		//this function send the message generate by this bavard to the caretakers
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
	public String toString() {
		return this.name;
	}

	@Override
	public void onPapotageEvent(PapotageEvent p) {
		
		// this function is used when the bavard receive a message
		// the message is added to it list of PapotageEvent (for the display on the JPaneRecu interface)
		//and also this function refresh the JList(PapotageEvent) from the JPaneRecu 
		list.add(p);
		paneRecu.onPapotageEvent(p);
		
		
	}

	@Override
	public boolean onPapotageEventbool() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public ArrayList<PapotageListener> getListLis() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void removeConcierge(Concierge c) {
		// this function is used to remove the connection from the bavard to the caretaker
		for (int i=0; i<this.concierge.size();i++) {
			if (c.getName().equals(this.concierge.get(i).getName())){
				concierge.remove(concierge.get(i));
			}
		}


	}

	
}
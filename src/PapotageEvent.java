import java.util.EventObject;


public class PapotageEvent  extends EventObject{
	
	private String sujet;
	private String corps;
	private String emetteur;
	private String recepteur;
	
	public String getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(String recepteur) {
		this.recepteur = recepteur;
	}

	public String getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}

	public PapotageEvent(Object source) {
		super(source);
		this.recepteur="";
	
	}	
	
	@Override
	
	public String toString() {
		
		return "From :"+emetteur + "   "+  "Subject : " + this.sujet + "\n";
				
	}

	public String getSujet() {
		return sujet;
	}


	public void setSujet(String sujet) {
		this.sujet = sujet;
	}


	public String getCorps() {
		return corps;
	}


	public void setCorps(String corps) {
		this.corps = corps;
	}
	
	
}

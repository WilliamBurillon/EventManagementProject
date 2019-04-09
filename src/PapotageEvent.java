import java.util.EventObject;


public class PapotageEvent  extends EventObject{
	
	private String sujet;
	private String corps;
	private String emetteur;
	
	public String getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}

	public PapotageEvent(Object source) {
		super(source);
	
	}	
	
	@Override
	
	public String toString() {
		
		return "From :"+emetteur + "\n"+ "Subject : " + this.sujet + "\n"
				+ "message : " + this.corps;
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

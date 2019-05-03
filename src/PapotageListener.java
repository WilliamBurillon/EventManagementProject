import java.util.ArrayList;

public interface PapotageListener {
	public void onPapotageEvent(PapotageEvent p);
	public boolean onPapotageEventbool();
	public String getName();
	public String getMdp();
	public ArrayList<PapotageEvent> getList();
	public void generatePapotageEvent(String corps, String mess);
}
import java.util.ArrayList;

public interface PapotageListener {
	public void onPapotageEvent(PapotageEvent p);
	public String getName();
	public String getMdp();
	public ArrayList<PapotageEvent> getList();
}
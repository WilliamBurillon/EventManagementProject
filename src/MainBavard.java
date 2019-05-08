import java.util.ArrayList;

public class MainBavard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Bavard> bv = new ArrayList<Bavard>();
		ArrayList<Concierge> cge =  new ArrayList<Concierge>();
		
		Concierge c = new Concierge("Coco","1");
		Concierge b = new Concierge("Bubu","2");
		
		
		cge.add(c);
		cge.add(b);
	
		WelcomeJFrame jf= new WelcomeJFrame(cge);
		
		
	}

}
	
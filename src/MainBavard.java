import java.util.ArrayList;

public class MainBavard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JTabbedPaneInterface j = new JTabbedPaneInterface();
		ArrayList<Bavard> bv = new ArrayList<Bavard>();
		ArrayList<Concierge> cge =  new ArrayList<Concierge>();
		
		Concierge c = new Concierge("Coco");
		Concierge b = new Concierge("Bubu");
		
	//	Bavard b1 = new Bavard("jean",c);
		//Bavard b2 = new Bavard("pierre",c);
		//Bavard b3 = new Bavard("jacques",c);
	/*	c.addBavard(b1);
		c.addBavard(b2);
		c.addBavard(b3);
		cge.add(c);
		bv.add(b1);
		bv.add(b2);
		bv.add(b3);*/
		cge.add(c);
		cge.add(b);
		WelcomeJFrame jf= new WelcomeJFrame(cge);
		
		//jf.getSP().addConcierge(c);
		//System.out.println(jf.getConcierges().get(0).getName());
		
		
	//	System.out.println(bv.size());
		//System.out.println(bv.get(1).getName());
		//b3.generatePapotageEvent("le corps de ce message est un test", "sujet de test");
	//	c.addBavard("jean");
		//c.addBavard("pierre");
		//c.addBavard("jacques");
		//c.addBavard("Georges");
	//	c.l.get(0).generatePapotageEvent("le corps de ce message est un test", "sujet de test");
		
	}

}
	
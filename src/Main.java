
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concierge c = new Concierge();
		Bavard b1 = new Bavard("jean",c);
		Bavard b2 = new Bavard("pierre",c);
		Bavard b3 = new Bavard("jacques",c);
		c.addBavard(b1);
		c.addBavard(b2);
		c.addBavard(b3);
		
		b3.generatePapotageEvent("le corps de ce message est un test", "sujet de test");
	//	c.addBavard("jean");
		//c.addBavard("pierre");
		//c.addBavard("jacques");
		//c.addBavard("Georges");
	//	c.l.get(0).generatePapotageEvent("le corps de ce message est un test", "sujet de test");
		
	}

}
	
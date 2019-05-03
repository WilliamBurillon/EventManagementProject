import java.util.ArrayList;

public class MainBavard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JTabbedPaneInterface j = new JTabbedPaneInterface();
		ArrayList<Bavard> bv = new ArrayList<Bavard>();
		ArrayList<Concierge> cge =  new ArrayList<Concierge>();
		
		Concierge c = new Concierge("Coco");
		Concierge b = new Concierge("Bubu");
		
		Bavard b1 = new Bavard("jean","454","4545",c);

		
		Bavard b2 = new Bavard("a","a","454",c);
		
	System.out.println(	b2.getList().size());
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
		System.out.println(cge.get(0).l.size());
		cge.get(0).addBavard(b1);
		cge.get(0).addBavard(b2);
		System.out.println(cge.get(0).l.size());
		
		WelcomeJFrame jf= new WelcomeJFrame(cge);
		b1.generatePapotageEvent("you", "popo");
		b1.generatePapotageEvent("yous", "popso");
		b1.generatePapotageEvent("Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie depuis les années 1500, quand un imprimeur anonyme assembla ensemble des morceaux de texte pour réaliser un livre spécimen de polices de texte. Il n'a pas fait que survivre cinq siècles, mais s'est aussi adapté à la bureautique informatique, sans que son contenu n'en soit modifié. Il a été popularisé dans les années 1960 grâce à la vente de feuilles Letraset contenant des passages du Lorem Ipsum, et, plus récemment, par son inclusion dans des applications de mise en page de texte, comme Aldus PageMaker. ", "Bonjour les copines");
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
	
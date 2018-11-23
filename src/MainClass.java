
public class MainClass {

	public static void main(String[] args) {
		
		 /* Card c = new Card(SuitType.HEART, 7);
		 System.out.println(c); */
		
		Player p = Player.readFromKeyboard();
		Deck d = new Deck(2);
		
		p.giveCard(d.extractCard());
		p.giveCard(d.extractCard()); 
		
		System.out.println(p);

	}

}

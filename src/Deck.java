
public class Deck {
	
	private Card[] cards;
	private int numRemainingCards;
	
	public Deck(int numDecks) {
		numRemainingCards = 0;
		cards = new Card[numDecks * 4 * 13];
		for (int n = 1; n <= numDecks; n ++) {
			for (int s = 0; s <= 3; s ++) {
				for (int i = 1; i<=13; i++) {
					cards[numRemainingCards] = 
							new Card(SuitType.values()[s], i);
					numRemainingCards ++;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String s = cards[0].toString();
		for (int i = 1; i < numRemainingCards; i++) {
			s = s + ", " + cards[i];
		}
		return s;
	}
	
	public void shuffle() {
		Card temp;
		int n1, n2;
		for (int i = 0; i < numRemainingCards * 7; i++) {
			n1 = (int) (Math.random() * numRemainingCards);
			n2 = (int) (Math.random() * numRemainingCards);
			temp = cards[n1];
			cards[n1] = cards[n2];
			cards[n2] = temp;
		}
	}
	
	public Card extractCard() {
		
		//return cards[--numRemainingCards];
		
		Card c = cards[numRemainingCards - 1];
		numRemainingCards --;
		return c; 
	}
	
}

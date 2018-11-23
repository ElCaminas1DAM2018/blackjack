
public class Card {
	private SuitType suit;
	private int number;
	
	public Card(SuitType suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	@Override
	public String toString() {
		String s = "";
		if (number<=10) {
			s = s + number;
		} else {
			if (number == 11) {
				s = s + "J";
			} else {
				if (number == 12) {
					s = s + "Q";
				} else {
					s = s + "K";
				}
			}
		}
		switch (suit) {
			case SPADE: s = s + "♠";
				break;
			case HEART: s = s + "♥";
				break;
			case CLUB: s = s + "♣";
				break;
			case DIAMOND: s = s + "♦";
			break;
		}
		return s;
	}
	
	public int getValue() {
		if (number < 11) {
			return number;
		} else {
			return 10;
		}
	}
}

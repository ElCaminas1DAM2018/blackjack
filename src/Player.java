
public class Player {
	
	private String name;
	private int money;
	private Card[] cards;
	private int bet;
	private int numCards;
	private PlayerStateType playerState;
	
	public Player(String name, int money) {
		this.name = name;
		this.money = money;
		cards = new Card[20];
		numCards = 0;
		bet = 0;
		playerState = PlayerStateType.PLAYING;
	}
	
	public static Player readFromKeyboard() {
		
		System.out.print("Enter name: ");
		String name = MainClass.input.next();
		System.out.print("Initial money: ");
		int money = MainClass.input.nextInt();
		Player player = new Player(name, money);
		return player;
	}
	
	public void resetCards() {
		numCards = 0;
		bet = 0;
	}
	
	@Override
	public String toString() {
		String s = name + " (" + playerState + "): ";
		if (numCards>0) {
			s = s + cards[0];
			for (int i = 1; i< numCards; i++) {
				s = s + ", " + cards[i];
			}
		}
		s = s + " (" + getScore() + ")"; 
		s = s + "  Bet: " + bet + " remaining:" + money;
		return s;
	}
	
	public void giveCard(Card card) {
		cards[numCards] = card;
		numCards ++;
	}
	
	public void setBet(int increment) {
		if (money < increment) {
			bet += money;
			money = 0;
		} else {
			bet += increment;
			money -= increment;
		}		
	}
	
	public String getName() {
		return name;		
	}
	
	public Card[] getCards() {
		return cards;
	}
	
	public int getNumCards() {
		return numCards;
	}
	
	public PlayerStateType getState() {
		return playerState;
	}
	
	public void setState(PlayerStateType state) {
		playerState = state;
	}
	
	public int getScore() {
		int score = 0;
		boolean wasAce = false;
		for (int i=0; i<numCards; i++) {			
			score += cards[i].getValue();
			if (cards[i].getValue() == 1) {
				wasAce = true;
			}
		}
		if (wasAce && score + 10 <= 21) {
			score += 10;
		}		
		return score;
	}
	
	public int getBet() {
		return bet;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void incrementMoney(int increment) {
		money += increment;
	}

}

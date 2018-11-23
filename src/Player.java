import java.util.Scanner;

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
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Initial money: ");
		int money = input.nextInt();
		input.close();
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

}

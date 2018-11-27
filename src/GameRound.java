import com.sun.tools.javac.Main;

public class GameRound {
	private Player[] players;
	private int blindBet;
	private Deck deck;
	private Player house;
	private int turn;
	
	public GameRound(Player[] players, Deck deck, int blindBet) {
		house = players[0];
		this.deck = deck;
		this.blindBet = blindBet;
		this.players = players;
		turn = 1;
	}
	
	public void initFirstCard() {
		for(int i=0; i<players.length; i++) {
			if (players[i].getState() != PlayerStateType.BROKE) {
				players[i].giveCard(deck.extractCard());
				players[i].setBet(blindBet);
			}
		}
		turn ++;
	}
	
	public void askHouse() {
		if (house.getScore()<=16) {
			house.giveCard(deck.extractCard());
		}
	}
	public void askBet() {
		if (turn == 2) {
			for (int i=1; i<players.length; i++) {
				if (players[i].getState() != PlayerStateType.BROKE) {
					System.out.println("Please, enter bet: ");
					int incrementBet = MainClass.input.nextInt();
					players[i].setBet(incrementBet);
				}
			}	
		}
	}
	
	public void 
	
	
}

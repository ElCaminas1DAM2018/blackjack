
public class GameRound {
	private Player[] players;
	private int blindBet;
	private Deck deck;
	private Player house;
	
	public GameRound(Player[] players, Deck deck, int blindBet) {
		house = players[0];
		this.deck = deck;
		this.blindBet = blindBet;
		this.players = players;
	}
	
	public void initFirstCard() {
		for(int i=0; i<players.length; i++) {
			if (players[i].getState() != PlayerStateType.BROKE) {
				players[i].giveCard(deck.extractCard());
				players[i].setBet(blindBet);
			}
		}
	}
}

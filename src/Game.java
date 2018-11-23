
public class Game {
	private GameRound gameRound;
	private Player[] players;
	private Deck deck;
	private int blindBet;
	
	public Game(int numPlayers, int numDecks, int blindBet) {
		deck = new Deck(numDecks);
		this.blindBet = blindBet;
		players = new Player[numPlayers];
		players[0] = new House();
		for(int i = 1; i < players.length; i++) {
			players[i] = Player.readFromKeyboard();
		}
		gameRound = new GameRound(players, deck, blindBet);
		gameRound.initFirstCard();
	}
	
	public Player[] getPlayers() {
		return players;
	}
}

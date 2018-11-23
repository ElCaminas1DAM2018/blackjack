import java.util.Scanner;

public class MainClass {
	
	public static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		 /* Card c = new Card(SuitType.HEART, 7);
		 System.out.println(c); */
		
		Game game = new Game(3, 2, 5);
		Player[] players = game.getPlayers();
		for (Player p : players) {
			System.out.println(p);
		}
		

	}

}

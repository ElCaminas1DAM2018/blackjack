
public class House extends Player {
	
	public House() {
		super("HOUSE", Integer.MAX_VALUE);
	}
	
	@Override
	public String toString() {
		String s = getName() + " ("+getState() +"): ";
		if (getNumCards()>0) {
			s = s + getCards()[0];
			for (int i = 1; i< getNumCards(); i++) {
				s = s + ", " + getCards()[i];
			}
		}
		s = s + " (" + getScore() + ")";
		return s;
	}
}

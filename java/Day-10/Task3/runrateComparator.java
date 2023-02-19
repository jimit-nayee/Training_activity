import java.util.Comparator;

public class runrateComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		double diff = p1.getRunrate() - p2.getRunrate();
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        } else {
            return 0;
        }
	}
}
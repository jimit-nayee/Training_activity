import java.util.Comparator;

public class runcomparator implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
		return Integer.compare(p1.getRuns(), p2.getRuns());
	}
        
}

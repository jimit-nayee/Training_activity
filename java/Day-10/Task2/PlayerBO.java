import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlayerBO {
    
    public List <Player> findPlayer(List<Player> pList, String nationality){
        List<Player> playerByNationality = new ArrayList<>();
		for (Player player : pList) {
			if(player.getNationality().equalsIgnoreCase(nationality)) {
				playerByNationality.add(player);
			}
		}	
		return playerByNationality;
    }

    public List<Player> findPlayer(List<Player> pList, LocalDate dob){
        List<Player> playerByDOB = new ArrayList<>();
		for (Player player : pList) {
			if(player.getDob().equals(dob)) {
				playerByDOB.add(player);
			}
		}		
		return playerByDOB;
    }

    public List<Player> findPlayer(List<Player> playerList,	Double runrate){
		
		List<Player> playerByRating = new ArrayList<>();
		for (Player player : playerList) {
			if(Double.compare(player.getRunrate(), runrate)==0) {
				playerByRating.add(player);
			}
            
		}		
		return playerByRating;
	}
}
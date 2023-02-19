import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> pList;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPList() {
        return pList;
    }
    public void setPList(List<Player> pList) {
        this.pList = pList;
    }
    
    public Team(){

    }
    public Team(String name, List<Player> pList) {
        this.name = name;
        this.pList = new ArrayList<>();
    }

    public void addPlayerToTeam(Player player){
        pList.add(player);
    }

    public Boolean removePlayerFromTeam(String name){
        for (Player player : pList) {
			if(player.getName().equalsIgnoreCase(name)) {
				pList.remove(player);
				return true;
			}
		}
		return false;
    }

    public void displayPlayers(){
        if(pList.size() == 0) {
			System.out.println("No players to show");
		}
		else {
			System.out.println("Players in "+name+": ");
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n","Name", "Date of birth", "Skill", "No of matches", "Runs", "Wickets", "Nationality", "Rating");
			for (Player player : pList) {
				System.out.printf("%-15s%-15s%-10s%-15d%-10d%-10d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDob(),
					    player.getSkill(),
					    player.getMathces(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getRunrate());
			}
		}
    }
}

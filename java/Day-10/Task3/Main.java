import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int n = s.nextInt();
        s.nextLine();

        Player player = new Player();
        List<Player> pList = new ArrayList<Player>();

        for(int i=0 ; i<n ; i++){
            String details = s.nextLine();
			player = Player.createPlayer(details);
			pList.add(player);
        }
        System.out.println("Enter the choice: ");
        System.out.println("1. Sort by number of matches played");
        System.out.println("2. Sort by run scored");
        System.out.println("3. Sort by runrate");
        int choice = s.nextInt();
        s.nextLine();

        switch(choice){
            case 1:
            Collections.sort(pList);
			System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%10s\n","Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			for (Player p : pList) {
				System.out.printf("%-15s%-15s%-15s%-15d%-10d%-10d%-15s%-10.1f\n",
					    p.getName(),
					    p.getDob(),
					    p.getSkill(),
					    p.getMatches(),
					    p.getRuns(),
					    p.getWickets(),
					    p.getNationality(),
					    p.getRunrate());
			}
            break;

            case 2:
                Collections.sort(pList, new runcomparator());
                System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%10s\n","Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			    for (Player p : pList) {
				System.out.printf("%-15s%-15s%-15s%-15d%-10d%-10d%-15s%-10.1f\n",
					    p.getName(),
					    p.getDob(),
					    p.getSkill(),
					    p.getMatches(),
					    p.getRuns(),
					    p.getWickets(),
					    p.getNationality(),
					    p.getRunrate());
			}
            break;

            case 3:
                Collections.sort(pList, new runrateComparator());
                System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-15s%10s\n","Name","Date of birth","Skill","No of matches","Runs","wickets","Nationality","Power rating");
			    for (Player p : pList) {
				System.out.printf("%-15s%-15s%-15s%-15d%-10d%-10d%-15s%-10.1f\n",
					    p.getName(),
					    p.getDob(),
					    p.getSkill(),
					    p.getMatches(),
					    p.getRuns(),
					    p.getWickets(),
					    p.getNationality(),
					    p.getRunrate());
			}
            break;

            default:
                System.out.println("Invalid");
            break;
        }
        s.close();
    }
}

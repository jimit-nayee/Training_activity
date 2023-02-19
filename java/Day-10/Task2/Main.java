import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        int n = s.nextInt();
        s.nextLine();

        List<Player> pList = new ArrayList<Player>();
        System.out.println("Enter the player details separated by comma: ");
        for(int i=0; i<n;i++){
            String[] details = s.nextLine().split(",");

			String name = details[0];
			LocalDate dob = LocalDate.parse(details[1]);
			String skill = details[2];
			Integer matches = Integer.parseInt(details[3]);
			Integer runs = Integer.parseInt(details[4]);
			Integer wickets = Integer.parseInt(details[5]);
			String nationality = details[6];
			Double runrate = Double.parseDouble(details[7]);
			
			Player player = new Player(name, dob, skill, matches, runs, wickets, nationality, runrate);
			pList.add(player);
        }

        PlayerBO pbo = new PlayerBO();

        System.out.println("Enter the search type: ");
        System.out.println("1. Search by Nationality");
        System.out.println("2. Search by DateOfBirth");
        System.out.println("3. Search by PowerRating");
        int choice = s.nextInt();
        s.nextLine();

        switch(choice){
            case 1 : 
                System.out.println("Enter the nationality:");
                String nationality = s.nextLine();
                List<Player> playerByNationality = pbo.findPlayer(pList, nationality);
                System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%10s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");

                for (Player player : playerByNationality) {
                    System.out.printf("%-15s%-15s%-15s%-20d%-15d%-15d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDob(),
					    player.getSkill(),
					    player.getMatches(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getRunrate());
			}
            break;

            case 2 :
                System.out.println("Enter the Date Of Birth:");
                LocalDate dateOfBirth = LocalDate.parse(s.next());
                List<Player> playerByDOB = pbo.findPlayer(pList, dateOfBirth);
                System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%10s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");
                for (Player player : playerByDOB) {
                    System.out.printf("%-15s%-15s%-15s%-20d%-15d%-15d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDob(),
					    player.getSkill(),
					    player.getMatches(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getRunrate());
			}
            break;

            case 3 :
                System.out.println("Enter the power rating:");
                Double powerRating = s.nextDouble();
                List<Player> playerByRating = pbo.findPlayer(pList, powerRating);
                System.out.format("%-15s%-15s%-15s%-20s%-15s%-15s%-15s%10s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");
                for (Player player : playerByRating) {
                    System.out.printf("%-15s%-15s%-15s%-20d%-15d%-15d%-15s%-10.1f\n",
					    player.getName(),
					    player.getDob(),
					    player.getSkill(),
					    player.getMatches(),
					    player.getRuns(),
					    player.getWickets(),
					    player.getNationality(),
					    player.getRunrate());
			}
            break;

            default :
                System.out.println("Invalid");
            break;
        }
        s.close();
    }
}

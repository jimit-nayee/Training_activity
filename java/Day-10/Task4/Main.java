import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = s.nextInt();
        s.nextLine();

        Player player = new Player();
        List <Player> pList = new ArrayList<Player>();

        for (int i = 0; i < n; i++) {
			String[] details = s.nextLine().split(",");

			String name = details[0];
			LocalDate dateOfBirth = LocalDate.parse(details[1]);
			String skill = details[2];
			Integer numberOfMatches = Integer.parseInt(details[3]);
			Integer runs = Integer.parseInt(details[4]);
			Integer wickets = Integer.parseInt(details[5]);
			String nationality = details[6];
			Double powerRating = Double.parseDouble(details[7]);
			
			player = new Player(name, dateOfBirth, skill, numberOfMatches, runs, wickets, nationality, powerRating);
			pList.add(player);
		}
        Map<String, Integer> nationalityCount = Player.calculateNationalityCount(pList);
		
		System.out.format("%-15s %s\n","Country","Count");
		for (Map.Entry<String, Integer> entry : nationalityCount.entrySet()) {
            System.out.format("%-15s %s\n",entry.getKey(),entry.getValue());
        }
        s.close();
    }
}

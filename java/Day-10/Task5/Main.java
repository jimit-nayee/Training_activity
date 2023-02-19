import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the players:");
		int n = s.nextInt(); s.nextLine();
		
		Player player = new Player();
		List<Player> pList = new ArrayList<Player>();
		
		for (int i = 0; i < n; i++) {
			String details = s.nextLine();
			
			player = Player.createPlayer(details);
			pList.add(player);
		}

		String maxNationality = Player.highestCount(pList);
		System.out.println("The nationality with maximum players: "+maxNationality);

        s.close();
	}  
}

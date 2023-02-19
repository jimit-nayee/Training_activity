import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the name of the team: ");
        String tName = s.nextLine();

        Player p = new Player();
        Team t = new Team(tName, null);
        
        while(true){
            System.out.println("1. Add Player");
            System.out.println("2. Delete Player");
            System.out.println("3. Display Players");
            System.out.println("4. Exit");

            System.out.println("Enter your choice : ");
            int n = s.nextInt();s.nextLine();

            switch(n){
                case 1:  
                System.out.println("Enter the details of player in CSV format:");
				String details = s.nextLine();
				p = Player.createPlayer(details);
				if(p!=null) {
					t.addPlayerToTeam(p);
					System.out.println("Player successfully added");
				}
                break;

                case 2:  
                System.out.println("Enter the name of the player to be deleted:");
				String name = s.nextLine();
				if(t.removePlayerFromTeam(name)){
					System.out.println("Player successfully deleted");
				}else {
					System.out.println("Player not found in the team");
				}
                break;

                case 3:  
                t.displayPlayers();
                break;

                case 4:  
                return;

                default:
                break;

            }
        }
    }
}

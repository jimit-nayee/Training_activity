import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of player you want to register");
        int n = sc.nextInt();sc.nextLine();
        String skill = null;
        ArrayList <Player> al= new ArrayList<Player>();
        for(int i = 0;i<n;i++){
            System.out.println("Enter player name");
            String name = sc.nextLine();
            
            System.out.println("Enter your choice");
            System.out.println("1. All rounder");
            System.out.println("2. Batsman");
            System.out.println("3. Bowler");
            System.out.println("4. Wicket Keeper");
            int a = sc.nextInt();sc.nextLine();
            switch(a){
                case 1 : 
                skill = "All rounder";
                break;
                case 2 : 
                skill = "Batsman";
                break;
                case 3 : 
                skill = "Bowler";
                break;
                case 4 : 
                skill = "Wicket Keeper";
                break;

                default:
                System.out.println("Invalid input");
                break;
            }
            Player p  = new Player(name, skill);
            al.add(p);            
        }
        Collections.sort(al ,new  PlayerComparator());
        for (Player player : al) {
            System.out.println(player);
        }
    }
}
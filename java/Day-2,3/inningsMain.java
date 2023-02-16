import java.util.Scanner;

public class inningsMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Team name");
        String team = s.nextLine();
        System.out.println("Enter innning number");
        String inning = s.nextLine();
        System.out.println("Enter Team score");
        int score = s.nextInt();

        innings i = new innings();
        i.setTeam(team);
        i.setInning(inning);
        i.setScore(score);

        String innings_num = i.getInning().toLowerCase();
        if(innings_num.equals("first")){
            System.out.println("Name" +team);
            System.out.println("Scored" + score);
            System.out.println("Need"+score + 1 +"to win the match");
        }
        else{
            System.out.println("Name" +team);
            System.out.println("Scored" + score);
            System.out.println("Match Ended");
        }
        s.close();
    }
}

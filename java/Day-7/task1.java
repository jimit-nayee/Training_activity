import java.util.Scanner;
import java.util.TreeSet;

class task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the matches number: ");
        int n = s.nextInt();
        s.nextLine();
        TreeSet <String> ts = new TreeSet<String>();
        System.out.println("Enter the player name");
        for(int i=0 ; i<5 ; i++){
            ts.add(s.nextLine());
        }
        System.out.println("Player Names: ");
        for (String string : ts) {
            System.out.println(string);
        }
        s.close();
    }
}
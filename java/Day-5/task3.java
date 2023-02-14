import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <String> l1 = new ArrayList<String>();
        ArrayList <String> l2 = new ArrayList<String>();
        ArrayList <String> consistant = new ArrayList<String>();
        System.out.println("Top Scorer of the season IPL14: ");
        for(int i=0; i<5; i++){

            l1.add(s.nextLine());
        }
        System.out.println("------------------");
        System.out.println("Top Scorer of the season IPL15: ");
        for(int i=0; i<5; i++){
            l2.add(s.nextLine());
        }
        for(int i=0; i<5; i++){
            if(l1.contains(l2.get(i).toString())){
                    consistant.add(l2.get(i).toString());
            }
        }
        System.out.println("------------------");
        System.out.println("Consistant players are: ");
        for (String string : consistant) {
            System.out.println(string);
        }
        s.close();
    }
}
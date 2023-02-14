import java.util.ArrayList;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <String> l1 = new ArrayList<String>();
        l1.add("CSK");
        l1.add("GT");
        l1.add("RCB");
        l1.add("MI");
        l1.add("DC");
        for(Object object: l1){
            System.out.println(object);
        }
        System.out.println("Enter the position to be swap: ");
        int sw = s.nextInt();
        s.nextLine();
        if(sw>l1.size()-1){
            System.out.println("Invalid input");
        }
        else{
            String tn1 = l1.get(0).toString();
            String tn2 = l1.get(sw).toString();
            l1.set(0,tn2);
            l1.set(sw,tn1);
            for(Object object2 : l1){
                System.out.println(object2);
            } 
        }
        s.close();
    }
}
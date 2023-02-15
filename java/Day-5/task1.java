import java.util.ArrayList;
import java.util.Scanner;

class task1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter player name: ");
        String name = s.nextLine();

        System.out.println("Enter player age: ");
        int age = s.nextInt();
        s.nextLine();

        System.out.println("Enter the country name: ");
        String country = s.nextLine();

        System.out.println("Player Name: "+name);
        System.out.println("Player age: "+age);
        System.out.println("Player country: "+country);
        ArrayList  l1 = new ArrayList<>();
        l1.add(name);
        l1.add(age);
        l1.add(country);
        
        for(Object object:l1){
            System.out.println(object);
        }
        System.out.println("Enter the Skill");
        String skill = s.nextLine();
    

        System.out.println("Enter the player position to add the skill: ");
        int pos = s.nextInt();
        s.nextLine();
        
        l1.set(pos, skill);

        for (Object object2 : l1) {
            System.out.println(object2);
        }
        System.out.println("Enter the position to be removed: ");
        int pos2 = s.nextInt();
        s.nextLine();

        l1.remove(pos2);

        for (Object object : l1) {
            System.out.println(object);
        }
        s.close();
    }
}
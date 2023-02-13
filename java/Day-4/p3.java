import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String s) {
        super(s);
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the player: ");
        String name = s.nextLine();
        System.out.println("Enter the age of the player: ");
        int age = s.nextInt();
        s.nextLine();
        try {
        if (age < 19) {
                throw new AgeException("Age is less then 19");
            }
        } 
        catch (AgeException e) {
                System.out.println(e);
            }
        s.close();
        
    }
}
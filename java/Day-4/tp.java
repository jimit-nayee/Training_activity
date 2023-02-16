import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the time: ");
        String t1 = s.nextLine();
        LocalTime lt = LocalTime.parse(t1);
        LocalTime lt1 = LocalTime.now();
        Duration d = Duration.between(lt,lt1);
        System.out.println("Pay bill of the parking for the user: "+d.toHours()*25);
        s.close();
    }
}

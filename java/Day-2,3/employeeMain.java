import java.util.Scanner;

public class employeeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your address");
        String address = s.nextLine();
        System.out.println("Enter your mobile");
        String mobile = s.nextLine();

        employee emp = new employee();
        emp.setName(name);
        emp.setAdd(address);
        emp.setMob(mobile);

        System.out.println("Name:" + emp.getName(name));
        System.out.println("Address:" + emp.getAdd(address));
        System.out.println("Mobile Number:" + emp.getMob(mobile));

        s.close();
    }
}

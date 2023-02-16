import java.util.Scanner;

public class customerMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the details name,address,mobile separate by comma");
        String detail = s.nextLine();

        String[] arr = detail.split(",");
        String name = arr[0];
        String address = arr[1];
        String mobile = arr[2];
        
        customer c = new customer();
        c.setName(name);
        c.setAddress(address);
        c.setMobile(mobile);

        System.out.println("Name:"+c.getName());
        System.out.println("Address:"+c.getAddress());
        System.out.println("Mobile:"+c.getMobile());
        s.close();
    }
}

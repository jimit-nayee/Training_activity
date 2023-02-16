import java.util.*;
public class employeeMain2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = s.nextLine();
        System.out.println("Enter address :");
        String address = s.nextLine();
        System.out.println("Enter mobile :");
        String mobile = s.nextLine();

        employee2 e2 = new employee2();
         int i= 1;
        while(i==1){
            
        e2.setName(name);
        e2.setAddress(address);
        e2.setMobile(mobile);
        System.out.println("Verify and Update Details");
        System.out.println("********** MENU ***********************");
        System.out.println("Press 1 to Update Employee Name");
        System.out.println("Press 2 to Update Employee Address");
        System.out.println("Press 3 to Update Employee Mobile");
        System.out.println("Press 4 to Print Details");
        int n= s.nextInt();
        s.nextLine();
        if(n==1){
            System.out.println("Current name of Employee : "+ e2.getName() );
            System.out.println("Enter the name to update it");
            String u_name = s.nextLine();
            e2.setName(u_name);
            System.out.println("Employee name updated");
        }
       else if(n==2){
        System.out.println("Current employee address : "+ e2.getAddress());
        System.out.println("Enter the address to update it");
        String u_address = s.nextLine();
        e2.setAddress(u_address);
        System.out.println("Employee Address updated");
       }
       else if(n==3){
        System.out.println("Current Employee mobile : "+ e2.getMobile());
        System.out.println("Enter the Mobile to update it");
        String u_mobile = s.nextLine();
        e2.setMobile(u_mobile);
        System.out.println("Employee Mobile updated");
       }
       if(n==4){
        System.out.println("Name : "+ e2.getName());
        System.out.println("Address : "+ e2.getAddress());
        System.out.println("Mobile : "+ e2.getMobile());
       }
       System.out.println("Press 1 to continue and press any other digit to quit Menu");
       i =s.nextInt();
    }   
    s.close();
    }
}
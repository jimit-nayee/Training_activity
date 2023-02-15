import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for four wheeler Enter 2 for two wheeler");
        int n= sc.nextInt();
        sc.nextLine();
        while(n==1 || n==2){
            if(n==1){
                System.out.println("Four Wheeler Mode");
                System.out.println("************************************");
                System.out.println("Enter make type of Four wheeler");
                String make = sc.nextLine();
                System.out.println("Enter Vehicle number");
                String vehicleNume = sc.nextLine();
                System.out.println("Enter fuel type");
                String fuelType = sc.nextLine();
                System.out.println("Enter fuel Capacity");
                int fuelCapacity = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter CC");
                int cc = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter whether kick start is avaliable in true or false form");
                boolean kickstart = sc.nextBoolean();
                sc.nextLine();

                Vehicle twoWheeler = new TwoWheeler(make, vehicleNume, fuelType, fuelCapacity, cc,kickstart);

                twoWheeler.displayDetailInfo();

            }
            else if(n==2){
                System.out.println("Two Wheeler Mode");
                System.out.println("************************************");
                System.out.println("Enter make type of Four wheeler");
                String make = sc.nextLine();
                System.out.println("Enter Vehicle number");
                String vehicleNume = sc.nextLine();
                System.out.println("Enter fuel type");
                String fuelType = sc.nextLine();
                System.out.println("Enter fuel Capacity");
                int fuelCapacity = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter CC");
                int cc = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter sound system type");
                String audioSystem = sc.nextLine();
                System.out.println("Number of doors");
                int doors = sc.nextInt();
                sc.nextLine();
                Vehicle fourWheeler = new FourWheeler(make, vehicleNume, fuelType, fuelCapacity, cc, audioSystem, doors);
                fourWheeler.displayDetailInfo();

            }
            System.out.println("Enter any other digit except 1 or 2 to quit");
            n = sc.nextInt();
            sc.nextLine();

        }

    }
    
}
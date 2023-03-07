import java.util.Scanner;

public class MajotTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of inputs: ");
        int num = s.nextInt();
        s.nextLine();
        if(num<0){
            System.out.println("Invalid input..!! -> Please Enter positive value..");
            System.exit(0);
        }
        int[] acNum = new int[num];
        for(int i=0 ; i<num ; i++){
            System.out.println("Enter Account number: ");
            acNum[i] = s.nextInt();
            if(acNum[i]<0){
                System.exit(0);
            }
            // String strAccNum = Integer.toString(acNum[i]);
            // if()
        }

        int branch = s.nextInt();
        s.nextLine();
        if(branch<100 && branch>999 ){
            System.out.println("Invalid Input");
        }
        else if(branch<0){
            System.out.println("Invalid Branch code..");
            System.exit(0);
        }
        else{

        }
    }
}
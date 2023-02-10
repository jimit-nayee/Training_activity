import java.util.Scanner;
public class powerof {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        if(n<0 || n>32676){
            System.out.println("Enter valid number");
            System.exit(0);
        }
        if(n != 0 && ((n & (n - 1)) == 0)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        s.close();
    }
}
import java.util.Scanner;

class addodd
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value:");
        int x;
        int sum = 0;
        int n = s.nextInt();
        if(n<0){
            System.out.println("invalid input");
            System.exit(0);
        }
        else if(n>32767)
        {
            System.out.println("invalid input");
            System.exit(0);
        }
        while(n != 0) {
            x = n % 10;
            if (x % 2 != 0) {
                sum = sum + x;
            }
            n = n /10;
        }
        System.out.print(sum);
        s.close();
    }
}

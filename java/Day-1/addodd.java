import java.util.Scanner;

class addodd
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a value:");
        int x;
        int sum = 0;
        int n = s.nextInt(); //n=12345
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
            x = n % 10; //12345%10 = 5
            if (x % 2 != 0) { //5%2=1
                sum = sum + x; //sum=0+3 , sum=3
            }
            n = n /10; //n = 12345/10 , n=1234
        }
        System.out.print(sum);
        s.close();
    }
}

import java.util.Scanner;

public class addoddeven{
    public static void main(String[] args) {
        int odd=0, even=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int num = s.nextInt();
        if(num<0){
            System.out.println("Invalid input");
            System.exit(0);
        }
        int a[] = new int [num];
        System.out.println("Enter the number of array");
        for(int i=0; i<num;i++){
            a[i] = s.nextInt();
        }
        for(int i=0; i<num;i++){
            if(a[i]%2==0){
                even+=a[i];
            }
            else{
                odd+=a[i];
            }
        }
        if(odd>even){
            System.out.println(odd);
        }
        else{
            System.out.println(even);
        }
        s.close();
    }
}
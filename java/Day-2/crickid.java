import java.util.*;
public class crickid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n= s.nextInt();
        s.nextLine();
        System.out.println("Enter elements id and score");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();   
        }
        s.nextLine();
        System.out.println("Enter the score ");
        int score = s.nextInt();
        System.out.println("The ids of the cricketers are : ");
        for(int i=0;i<n;i++){
            if(arr[i]>score){
                System.out.println(arr[i-1]);
            }
        }   
        s.close();
    }
}
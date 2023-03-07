import java.util.Scanner;

public class MajorTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = s.nextInt();
        s.nextLine();

        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        }
        int[] accountNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Account number");
            int accountNumber = s.nextInt();s.nextLine();
            if (accountNumber < 0) {
                System.out.println("Invalid Customer Account Number");
                return;
            }
            accountNumbers[i] = accountNumber;
        }
        System.out.print("Enter branch code: ");
        int branchCode = s.nextInt();s.nextLine();
        if (branchCode < 0) {
            System.out.println("Invalid Branch Code");
            return;
        }
        if (branchCode < 100) {
            System.out.println("Invalid Input");
            return;
        }
        int lowerLimit = branchCode * 100; 
        int upperLimit = lowerLimit + 999;
         int[] count = accountNumbers;
         for (int i = 0; i < n; i++) {
         if (accountNumbers[i] >= lowerLimit && accountNumbers[i] <= upperLimit) {
                count[i]++;
            } 
        }
        System.out.println("Number of accounts in branch " + branchCode + " is " + count.toString());
        for(int accountNumber:accountNumbers)
        {
            if (accountNumber / 100 == branchCode / 100) {
            System.out.println(accountNumber);
        }
    }  
    s.close();
}
}

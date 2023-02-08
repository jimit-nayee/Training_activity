import java.util.Scanner;
class salary
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int sal = s.nextInt();
        if(sal>8000)
        {
            System.out.println("Salary too large");
            System.exit(0);
        }
        if(sal<0)
        {
            System.out.println("Salary too small");
            System.exit(0);
        }
        System.out.print("Enter Shift: ");
        int shift = s.nextInt();
        if(shift<0)
        {
            System.out.println("shifts too small");
            System.exit(0);
        }
        double expense = (((20*sal)/100) + ((30*sal)/100));
        double total = (shift*(2*sal/100)+sal);
        double saving = total - expense;
        System.out.println("Total Saving salary: "+saving);
        s.close();
    }
}
import java.util.Scanner;

class p1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("Enter runs scored by batsman");
        sb.append(s.nextLine());
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Enter overs faced by batsman");
        sb1.append(s.nextLine());

        
        try{
            int r = Integer.parseInt(sb.toString());
        int o = Integer.parseInt(sb1.toString());
            int avg = r / o;
            System.out.println("Batsman betting run rate is " +avg );
        }
        catch(Exception e){
            System.out.println(e);
        }
    s.close();
    }
}
import java.util.Scanner;

class p2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
        System.out.println("Enter over to be played by batsman: ");
        int over = s.nextInt();
        s.nextLine();
        System.out.println("Enter runs scored by batsman in each over: ");
        int run[] = new int[over];
        for(int i=0;i<run.length;i++){
            run[i] = s.nextInt();
            s.nextLine();
        }
        System.out.println("Enter over number: ");
        int on = s.nextInt();
        System.out.println("run in this over is: "+run[on-1]);
    }
    catch (Exception e){
        System.out.println(e);
    }
    s.close();
}
}
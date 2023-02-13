import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("Select the shape ");
        String shape = sc.next();
       
        if ((!shape.equals("1")) && (!shape.equals("2"))) {
            System.out.println("Invalid input");
            return;
        }

        switch (shape) {
            case "1":
                Circle circle = new Circle();
                System.out.println("Enter raidius of circle");
                int radius = sc.nextInt();
                if (radius < 0) {
                    System.out.println("Invalid radius");
                    return ;
                }
                double circleArea = circle.calculateArea(radius);
                System.out.println("The area of Circle is " + (double)Math.round(circleArea*100)/100);
                break;
            case "2":
                Square square=new Square();
                System.out.println("Enter length of square");
                int length = sc.nextInt();
                if (length < 0) {
                    System.out.println("Invalid length");
                    return;
                }
                double squareArea = square.calculateArea(length);
                System.out.println("The area of square is " + (double)Math.round(squareArea*100)/100);
                break;
        }
        
    }
}
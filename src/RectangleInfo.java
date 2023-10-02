import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        boolean done = false;
        do{
            System.out.println("Enter the width.");
            Scanner in = new Scanner(System.in);
            if(in.hasNextDouble()) {
                width = in.nextDouble();
                done = true;
            }
            else {
                System.out.println("invalid output, try again");
            }
        }
        while(!done);
        do {
            done = false;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the height.");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input, try again");
            }
        }
        while(!done);
        double area = height * width;
        System.out.println("area is: " + area);
        double perimeter = height * 2 + width * 2;
        System.out.println("Perimeter is " + perimeter);
        double squares = height * height + width * width;
        System.out.println("Diagonal length is " + Math.sqrt(squares));
    }
}

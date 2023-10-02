import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double meters = 0;
        boolean done = false;
        do {
            System.out.println("Input meters: ");
            Scanner in = new Scanner(System.in);
            if(in.hasNextDouble()) {
                meters = in.nextDouble();
                done = true;

            }
            else {
                System.out.println("Invalid input");
            }
        }
        while(!done);
        double miles = meters * 0.000621;
        System.out.println("Miles :" + miles);
        double feet = meters * 3.28084;
        System.out.println("Feet: " + feet);
        double inches = meters * 39.3701;
        System.out.println("Inches: " + inches);
    }
}

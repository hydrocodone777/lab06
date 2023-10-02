import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        double gallons = 0;
        double milesGallons = 0;
        double gasGallons = 0;
        int miles = 100;
        double cost = 0;
        boolean done = false;
        do {
            System.out.println("Input your gallons, enter a number: ");
            Scanner gal = new Scanner(System.in);
            if(gal.hasNextDouble()) {
                gallons = gal.nextDouble();
                done = true;
            }
            else {
                System.out.println("Invalid input.");
            }
        }
        while(!done);
        do {
            System.out.println("Input your miles per gallon: ");
            Scanner milgal = new Scanner(System.in);
            done = false;
            if(milgal.hasNextDouble()) {
                milesGallons = milgal.nextDouble();
                done = true;
            }
            else {
                System.out.println("Invalid output");
            }
        }
        while(!done);
        done = false;
        do {
            System.out.println("Input the cost of gas per gallon: ");
            Scanner gal = new Scanner(System.in);
            if(gal.hasNextDouble()) {
                gasGallons = gal.nextDouble();
                done = true;
            }
            else {
                System.out.println("Invalid input.");
            }
        }
        while(!done);
        cost = gallons / milesGallons * miles * gasGallons;
        System.out.println("Your total cost for 100 miles is " + cost);
    }
}
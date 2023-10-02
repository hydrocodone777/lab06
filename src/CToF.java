import java.util.Scanner;
public class CToF {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = 0;
        boolean value = false;
        do {
            System.out.println("Enter a numerical Celsius value to be converted to F: ");
            Scanner in = new Scanner(System.in);
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                value = true;
                fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("Your temp in F is " + fahrenheit);
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        while(!value);
    }
}

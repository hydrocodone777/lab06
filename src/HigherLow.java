import java.util.Scanner;
public class HigherLow {
    public static void main(String[] args) {
        int guess = 0;
        int min = 1;
        int max = 10;
        boolean done = false;
        boolean valid = false;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number 1 through 10 ");
        guess = in.nextInt();
        do {
            if (guess < random_int) {
                System.out.println("Your guess is lower than the integer. Try again. ");
                do {
                    Scanner newguess = new Scanner(System.in);
                    if (newguess.hasNextInt()) {
                        guess = newguess.nextInt();
                        valid = true;
                    }
                    else {
                        System.out.print("Invalid input. Try again, enter an integer ");
                    }
                }
                while(!valid);
            } else if (guess > random_int) {
                System.out.println("Your guess is higher than the integer. Try again. ");
                do{
                    Scanner newguess = new Scanner(System.in);
                    if(newguess.hasNextInt()) {
                        guess = newguess.nextInt();
                        valid = true;
                    }
                    else{
                        System.out.print("Invalid input. Enter again ");
                    }
                }
                while(!valid);
            } else if (guess == random_int) {
                System.out.println("Correct");
                done = true;
            }
        }
        while (!done);
    }
}

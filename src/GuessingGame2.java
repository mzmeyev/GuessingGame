package src;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        boolean win = false;
        int randomNumber = random.nextInt(100) + 1;
        int enteredNumber;

        while (!win) {
            System.out.println("Try to guess number 1 to 100: ");
            enteredNumber = in.nextInt();

            if (enteredNumber < randomNumber) {
                System.out.println("Entered number is smaller.");
            } else if (enteredNumber > randomNumber) {
                System.out.println("Entered number is bigger.");
            } else {
                System.out.println("You win! Number is " + randomNumber);
                win = true;
            }
        }

    }
}

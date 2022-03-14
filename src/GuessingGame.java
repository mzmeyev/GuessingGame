package src;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int randNum = 0;
        int max = 100;
        int min = 1;
        String myAnswer = "";

        do {
            randNum = rand.nextInt(max - min + 1) + min;
            System.out.println("The number you guessed  is " + randNum + "?");
            System.out.println("Please select your answer: ");
            System.out.println("0 – correct, 1 –  bigger, 2 – smaller");
            myAnswer = in.nextLine();

            if(myAnswer.equals("1")) {
                min = randNum + 1;
            }
            else if(myAnswer.equals("2")) {
                max = randNum - 1;
            }
        }while(!myAnswer.equals("0"));

        in.close();
        System.out.println("Hahahah I win!!!");
    }
}



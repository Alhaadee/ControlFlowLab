import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {

        int secretNumber = 7;
        System.out.println("Guess the secret number!");
        Scanner reader = new Scanner(System.in);
        String guess = reader.nextLine();
        int guessNumber = Integer.parseInt(guess);


        if (guessNumber > secretNumber){
            System.out.println("Too high!");
        } else if (guessNumber < secretNumber) {
            System.out.println("Too low!");
        } else System.out.println("You are correct!");



    }
}

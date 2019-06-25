package pack_1;
import java.util.*;
import java.util.Random;

public class Guess_Number {
    public static void main(String args[])
    {
      Scanner scanner=new Scanner(System.in);
      Random random=new Random(); //usign Random class to get random number
      int numberToGuess= random.nextInt(100);
      int guess;

      boolean win=false;
    while (win==false) {
        System.out.println("Guess number between 1 to 100");
        guess = scanner.nextInt();
        if (guess == numberToGuess) {
            win = true;
            System.out.println("Number guessed matches the original number");
        } else if (guess < numberToGuess)
            System.out.println("Number guessed is less than the original number");
        else if (guess > numberToGuess)
            System.out.println("Number guessed is greater than the original number");
    }
    }
}

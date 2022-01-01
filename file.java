import java.util.Scanner;
import java.util.Random;

public class file{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guessesLeft = 10;
        int num = rand.nextInt(21);
        System.out.print("Guess the number from 0-20: ");
        int numGuess = sc.nextInt();
        boolean run = true;
        while(run){
            if(guessesLeft <= 0){
                System.out.println("you losed!");
                run = false;
            }else if(numGuess == num){
                System.out.println("that's true the number is " + num);
                run = false;
            } else if(numGuess > num){
                guessesLeft -= 1;
                System.out.print("too high! try again: ");
                numGuess = sc.nextInt();
            } else{
                guessesLeft -= 1;
                System.out.print("too low! try agin: ");
                numGuess = sc.nextInt();
            }
        }
        sc.close();
    }
}
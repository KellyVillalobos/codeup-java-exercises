import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {


        int randomNumber = pickNumber();
        System.out.println(randomNumber);
        int guess;
        do {
            guess = userGuess();
            if(guess < randomNumber){
                System.out.println("HIGHER");
            }else if (guess > randomNumber){
                System.out.println("LOWER");
            }else{
                System.out.println("GOOD GUESS!");
            }
        } while (guess != randomNumber);
    }
    public static int pickNumber(){

        return (int) (Math.random() * 100) +1;
    }
    public static int userGuess(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Guess the number");
        return userInput.nextInt();
    }
}

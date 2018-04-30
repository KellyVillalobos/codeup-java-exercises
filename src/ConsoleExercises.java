import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInput;
        Scanner sc;

        sc = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Enter a number: ");
        userInput = sc.nextInt();

        System.out.println("You Entered: --> \"" + userInput + "\" <--");



    }
}


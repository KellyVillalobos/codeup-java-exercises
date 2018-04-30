import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        String userInput;
        Scanner sc;

        sc = new Scanner(System.in).useDelimiter("\n");

        String one;
        String two;
        String three;

        Scanner scan;

        scan = new Scanner(System.in);

        System.out.print("Enter three words: ");
        one = scan.next();
        two = scan.next();
        three = scan.next();
         System.out.println("You entered: --->\"" + one + "\" <---");
         System.out.println("You entered: --->\"" + two + "\" <---");
         System.out.println("You entered: --->\"" + three + "\" <---");



//        System.out.println("You Entered: --> \"" + userInput + "\" <--");



    }
}


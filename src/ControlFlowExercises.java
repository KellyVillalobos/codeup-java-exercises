import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {
        String userInput;
        Scanner scan;

        scan = new Scanner(System.in);
        System.out.println("What number would you like to go to?: ");
        userInput = scan.nextLine();

        System.out.println("Here's your table");
        System.out.println("Number | Squared | Cubed ");
        System.out.println("------ | ------- | ----- ");
        for(int i = 1; i <= Integer.parseInt(userInput); i ++) {

            System.out.printf("%-7d| %-8d| %-7d%n", i, i * i, i*i*i);


        }
    }


}


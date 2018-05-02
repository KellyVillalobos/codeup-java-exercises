import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addMe(3, 4));
//        System.out.println(subtractMe(8, 9));
//        System.out.println(modulus(52, 7));
//        System.out.println(multiplyMe(10, 10));
//        System.out.println(divideMe(25, 0));
//        System.out.println(getInteger(1, 10));
//
//        do{
//            System.out.println(factorial(getInteger(1, 10)));
//        }while (wantsContinue());
        do {
            System.out.println(diceSides(diceGame()));
        }while (roll());

    }

    //TODO: Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //TODO: Test your functions and verify the output.
    //
    //TODO: Add a modulus function that finds the modulus of two numbers.

//
//    public static int addMe(int numberA, int numberB) {
//        return numberA + numberB;
//
//    }
//
//    public static int subtractMe(int numberA, int numberB) {
//
//        return numberA - numberB;
//    }
//
//    public static int multiplyMe(int numberA, int numberB) {
//        int mult = 0;
//        for (int i = 0; i < numberA; i++) {
//            mult = mult + numberB;
//
//
//        }
//        return mult;
//    }
//
//    public static int divideMe(int numberA, int numberB) {
//        if (numberB == 0) {
//            System.out.println("You cannot divide by zero. Enter number greater than 0.");
//        }
//        return numberA / numberB;
//    }
//
//    public static int modulus(int numberA, int numberB){
//        return numberA % numberB;
//
//    }


    //TODO: Ask if the user wants to continue.
    //TODO: Use a for loop to calculate the factorial.
    //TODO: Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //TODO: Use the long type to store the factorial.
    //TODO: Continue only if the user agrees to.
    //TODO: A factorial is a number multiplied by each of the numbers before it.
    //TODO: Factorials are denoted by the exclamation point (n!). Ex:


//TODO: Prompt the user to enter an integer from 1 to 10.

//    public static int getInteger(int min, int max) {
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int input;
//        input = userInput.nextInt();
//
//        if (input < min) {
//            System.out.print("this number is invalid please choose a number between 1 and 10: ");
//            return getInteger(min, max);
//        }
//        if (input > max) {
//            System.out.print("this number is greater than 10, please choose a number between 1 and 10: ");
//            return getInteger(min, max);
//        }
//        return input;
//    }
//    //TODO: Display the factorial of the number entered by the user.
//
//
//    public static long factorial(int number) {
//
//        long fact = 1;
//        for (int i = 1; i <= number; i++) {
//            fact *= i;
//
//
//        }
//
//
//        return fact;
//    }
//
//    public static boolean wantsContinue(){
//
//        String y = "y";
//        String yes = "yes";
//        Scanner input = new Scanner(System.in);
//        System.out.println("Would you like to continue?: ");
//        String userChoice = input.next();
//        return userChoice.equals("y") || userChoice.equalsIgnoreCase("yes");
//
//    }

    public static int diceGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for sides of dice: ");
        int sideNumber = input.nextInt();

        return sideNumber;
    }

    public static boolean roll() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hit spacebar to roll dice");
        String enter = input.has();
        return enter.equals("");
    }

    public static int diceSides(int sides) {
        Scanner roll = new Scanner(System.in);

        return sides;

    }

}
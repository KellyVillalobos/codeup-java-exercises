public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addMe(3, 4));
        System.out.println(subtractMe(8, 9));
        System.out.println(multiplyMe(10, 10));
        System.out.println(divideMe(25, 0));
    }

    //TODO: Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //TODO: Test your functions and verify the output.
    //
    //TODO: Add a modulus function that finds the modulus of two numbers.


    public static int addMe(int numberA, int numberB) {
        return numberA + numberB;

    }

    public static int subtractMe(int numberA, int numberB) {

        return numberA - numberB;
    }

    public static int multiplyMe(int numberA, int numberB) {
        int mult = 0;
        for (int i = 0; i < numberA; i++) {
            mult = mult + numberB;


        }
        return mult;
    }

    public static int divideMe(int numberA, int numberB) {
        if (numberB == 0) {
            System.out.println("You cannot divide by zero. Enter number greater than 0.");
        }
        return numberA / numberB;
    }
}
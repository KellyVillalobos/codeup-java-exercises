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

//        System.out.print("Enter three words: ");
//        one = scan.next();
//        two = scan.next();
//        three = scan.nextLine();
//         System.out.println("You entered: --->\"" + one + "\" <---");
//         System.out.println("You entered: --->\"" + two + "\" <---");
//         System.out.println("You entered: --->\"" + three + "\" <---");



//
//         System.out.print("Enter a sentence: ");
//
//         String sentenceString = scan.nextLine();
//
//        System.out.println("You typed: \"" + sentenceString );


//        System.out.println("You Entered: --> \"" + userInput + "\" <--");



        System.out.println("Enter length: ");

        String x = scan.next();

        int length = Integer.parseInt(x);


        System.out.println("Enter width: ");

        String y = scan.next();
        int width =  Integer.parseInt(y);
        int area;
        int perimeter;
        area = length * width;
        perimeter = 2 * length + 2 * width;
        System.out.println("The Width is: \"" + width);
        System.out.println("The Length is \"" + length);
        System.out.println("The area is: \"" + area);
        System.out.println("the Perimeter of the room is: \"" + perimeter);





    }
}


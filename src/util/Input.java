package util;

import java.util.Scanner;

public class Input {
    //---scope---type----name-----
    private Scanner scanner;

    //-------constructor---------
    public Input() {
        this.scanner = new Scanner(System.in);


    }

    //----method for prompting user for string input---
   public String getString(String prompt) {
        System.out.println(prompt);
          return this.scanner.nextLine();

          }
    //-----method for prompting user to continue--------
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.nextLine();
        //---------example of auto boxing---------|
        return "y".equals(userInput) || "yes".equalsIgnoreCase(userInput);

    }
    //-----method for prompting user for int-----
    public int getInt() {
        int number = this.scanner.nextInt();
        scanner.nextLine();
        return number;

    }
    //------method for user input validation for int-----------
    public int getInt(int min, int max) {
        int value = getInt();
        if (value  < min || value > max){
            System.out.printf("Enter a number between %d and %d%n", min, max);
            return getInt(min,max);

        }
        return value;
    }
    //-----method for prompting user for double-----
    public double getDouble() {
        System.out.println("Enter a number: ");
        return this.scanner.nextDouble();
    }
    //------method for validating user input for double------
    public double  getDouble(double min, double max) {
        double value = getDouble();
        if(value  < min || value > max){
            System.out.printf("Enter a number between %f and %f%n", min, max);
            return getDouble(min, max);
        }
        return value;

    }

}

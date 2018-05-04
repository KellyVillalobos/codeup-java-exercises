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
        String userInput = this.scanner.nextLine().trim().toLowerCase();

        return userInput.equals( "y") || userInput.equalsIgnoreCase("yes");

    }
    //-----method for prompting user for int-----
    public int getInt(String prompt) {
        System.out.println(prompt);
         return this.scanner.nextInt();

    }
    //------method for user input validation for int-----------
    public int getInt(int min, int max) {
        int value;
        do{
             value = getInt(min, max);

        }while (value  < min || value > max);
        return value;
    }
    //-----method for prompting user for double-----
    public double getDouble() {
        System.out.println("Enter a number: ");
        return this.scanner.nextDouble();
    }
    //------method for validating user input for double------
    public double  getDouble(double min, double max) {
        double value;
        do{
            value = getDouble(min, max);

        }while (value  < min || value > max);
        return value;

    }

}

package util;

import java.util.Scanner;

public class Input {
    //---scope---type----name-----
    private Scanner scanner;

    //-------constructor---------
    public Input() {
        this.scanner = new Scanner(System.in);


    }


   public String getString(String prompt) {
        System.out.println(prompt);
          return this.scanner.nextLine();

          }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.nextLine().trim().toLowerCase();

        return userInput.equals( "y") || userInput.equalsIgnoreCase("yes");

    }

    public int getInt(String prompt) {
        System.out.println(prompt);
         return this.scanner.nextInt();

    }

    public int getInt(int min, int max) {
        int value;
        do{
             value = getInt(min, max);

        }while (value  < min || value > max);
        return value;
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        return this.scanner.nextDouble();
    }

    public double  getDouble(double min, double max) {
        double value;
        do{
            value = getDouble(min, max);

        }while (value  < min || value > max);
        return value;

    }

}

package util;

import java.util.Scanner;

public class Input {
    //---scope---type----name-----
    private Scanner scanner;

    //-------constructor---------
    public Input() {
        this.scanner = new Scanner(System.in);


    }


   public void getString() {
        System.out.println("enter a string: ");
          this.scanner.nextLine();



    }

    public boolean yesNo() {
        System.out.println("enter a string: ");
        String userInput = this.scanner.nextLine().trim().toLowerCase();

        return userInput == "y" || userInput == "yes";

    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number: ");
         return this.scanner.nextInt();

    }

    public void getInt() {
        int value;
        do{
             value = getInt(0, 10);

        }while (value  < 0 || value > 10);
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number: ");
        return this.scanner.nextDouble();
    }

    public void  getDouble() {
        double value;
        do{
            value = getDouble(0.0, 10.0);

        }while (value  < 0.0 || value > 10.0);
    }

}

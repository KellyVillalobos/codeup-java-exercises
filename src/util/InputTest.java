package util;

import java.util.Scanner;

public class InputTest {
    public static Input userInput = new Input();
    public static void main(String[] args) {

        System.out.println("Enter a number");
        System.out.println(userInput.getInt());

        System.out.println("enter a number");
        System.out.println(userInput.getInt(24, 45));


    }
}

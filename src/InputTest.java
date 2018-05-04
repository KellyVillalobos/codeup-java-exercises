import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();


        System.out.println(input.getString("enter string"));

        input.yesNo("would you like to continue?");
        System.out.println("enter int number: ");
        input.getInt();
        System.out.println("enter a number between 1 and 27: ");
        input.getInt(1,27);
        System.out.println("enter double number between 25.5 and 45.3: ");
        input.getDouble(25.5,45.3);


    }
}

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Say something to Bob: ");
        String input = scan.nextLine();
        if(input.endsWith("?")){
            System.out.println("Sure");

        }else if(input.endsWith("!") || input.equals(input.toUpperCase())){
            System.out.println("Whoa chill out!");

        }else if(input.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever.");
        }


    }
}

package cardgames;


import util.Input;

import java.util.ArrayList;

public class GameOfWar {

//    public static Shuffler cards = new Shuffler();

    public static Input userInput = new Input();

    public static void main(String[] args) {


//        showMenu();
        ArrayList<Card> cards = Deck.getDeck();
       Shuffler shuffle = new Shuffler(cards);
        ArrayList<Card> deck = shuffle.shuffle();

    }


    public static void showMenu() {

        boolean answer = userInput.yesNo("Would you like to play the game of War: ");
        if (answer) {
            System.out.println("Enter number of player: ");
            int choice = getChoice();
            if (choice == 1) {
                Player player1 = computer();
                Player[] player2 = playerName(choice);
                System.out.println(player2[0].getName());
                System.out.println(player1.getName());
                for (Player player: player2){
                    System.out.println(player.getName());
                }


            } else if (choice == 2) {

                Player[] players = playerName(choice);
                for (Player player: players){
                    System.out.println(player.getName());
                }
            }
        } else {
            System.out.println("Thank you and Goodbye.");
            System.exit(0);
        }
    }


    public static int getChoice() {
        return userInput.getInt();
    }
    public static Player computer(){
        Player player = new Player("Computer");
        return player;
    }


    public static Player[] playerName(int numOfPlayers) {
        Player player;
        String name;
        int j = numOfPlayers;
        Player[] players = new Player[j];
        for (int i = 0; i < numOfPlayers; i++) {
            int num = i + 1;
            name = userInput.getString("Enter player" + num + " name: ");
            player = new Player(name);
            players[i] = player;


        }
        return players;
    }


}
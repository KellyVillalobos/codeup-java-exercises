package cardgames;


import util.Input;

import java.util.ArrayList;
import java.util.Random;

public class GameOfWar {

//    public static Shuffler cards = new Shuffler();

    public static Input userInput = new Input();
    public static Random radomCard = new Random();


    public static void main(String[] args) {

        ArrayList<Card> cards = Deck.getDeck();
        Shuffler shuffle = new Shuffler(cards);
//        System.out.println(shuffle.shuffle());
        ArrayList<Card> deck = shuffle.shuffle();

        int menuChoice = showMenu();
        if(menuChoice == 1){
            play(deck,onePlayer(1));
        }else if(menuChoice == 2){
            play(deck, twoPlayer(2));

        }




    }

    public static int showMenu() {

        boolean answer = userInput.yesNo("Would you like to play the game of War: ");
        if (answer) {
            System.out.println("Enter number of player: ");
            int choice = getChoice();
            if (choice == 1) {
                return choice;
//                Player player1 = computer();
//                Player[] player2 = playerName(choice);
////                System.out.println(player2[0].getName());
////                System.out.println(player1.getName());
//                for (Player player : player2) {
//                    player.getName();
//                }
//                System.out.printf("%s               #of Cards %40s               #of Cards               Winner\n", player1.getName(), player2[0].getName());
//

            } else if (choice == 2) {
                return choice;

//                Player[] players = playerName(choice);
//
//                for (Player player : players) {
//                     player.getName();
//                }
//                System.out.printf("%s               #of Cards %40s               #of Cards               Winner\n", players[0].getName(), players[1].getName());
            }
        } else {
            System.out.println("Thank you and Goodbye.");
            System.exit(0);
        }
        return 0;
    }

    public static Player[] onePlayer(int choice){

        Player[] player2 = playerName(choice);

        System.out.printf("%s               #of Cards %40s               #of Cards               Winner\n", player2[0].getName(), player2[1].getName());
        return player2;
    }

    public static Player[] twoPlayer(int choice){
        Player[] players = playerName(choice);
        System.out.printf("%s               #of Cards %40s               #of Cards               Winner\n", players[0].getName(), players[1].getName());
        return players;
    }









    public static void play(ArrayList<Card> cards, Player[] players) {
        Player[] players1 = players;
        ArrayList<Card> playerA1 = new ArrayList<Card>();
        ArrayList<Card> playerA2 = new ArrayList<Card>();
         playerA1.addAll(cards.subList(0, 25));
         playerA2.addAll(cards.subList(26, 51));

        Card player1Card = playerA1.get(radomCard.nextInt(playerA1.size()));
        Card player2Card = playerA2.get(radomCard.nextInt(playerA2.size()));

        if(player1Card.getValue() > player2Card.getValue()){

            System.out.printf("%s %15s %45s %18s %30s                        \n", player1Card, playerA1.size()+1, player2Card, playerA2.size()+1, players1[0].getName());
        }else if(player1Card.getValue() < player2Card.getValue()){
            System.out.printf("%s %15s %45s %18s %30s                        \n", player1Card, playerA1.size()+1, player2Card, playerA2.size()+1, players1[1].getName());
        }


    }


    public static int getChoice() {
        return userInput.getInt();
    }

    public static Player computer() {
        Player player = new Player("Computer");
        return player;
    }


    public static Player[] playerName(int numOfPlayers) {
        Player player;
        String name;
        if(numOfPlayers == 1){
           Player[] players = new Player[2];
            name = userInput.getString("Enter player name: ");
           player = new Player(name);
           players[0] = computer();
           players[1] = player;
           return players;

        }else if(numOfPlayers == 2){

        int j = numOfPlayers;
        Player[] players = new Player[j];
        for (int i = 0; i < numOfPlayers; i++) {
            int num = i + 1;
            name = userInput.getString("Enter player" + num + " name: ");
            player = new Player(name);
            players[i] = player;
        }
        return players;

        }else
        return null;
    }


}
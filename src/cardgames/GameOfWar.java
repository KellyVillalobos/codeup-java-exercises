package cardgames;


import util.Input;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class GameOfWar {

//    public static Shuffler cards = new Shuffler();

    public static Input userInput = new Input();

    public static ArrayList<Card> playerA1 = new ArrayList<>();
    public static ArrayList<Card> playerA2 = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<Card> cards = Deck.getDeck();
        Shuffler shuffle = new Shuffler(cards);
//        System.out.println(shuffle.shuffle());
        ArrayList<Card> deck = shuffle.shuffle();
        playerA1.addAll(deck.subList(0, 25));
        playerA2.addAll(deck.subList(26, 51));

        int menuChoice = showMenu();
        if (menuChoice == 1) {

            play(playerA1, playerA2, onePlayer(1), 1);
        } else if (menuChoice == 2) {
            play(playerA1, playerA2, twoPlayer(2), 1);

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

    public static Player[] onePlayer(int choice) {

        Player[] player2 = playerName(choice);

        System.out.printf("%s               #of Cards %40s               #of Cards               Winner\n", player2[0].getName(), player2[1].getName());
        return player2;
    }

    public static Player[] twoPlayer(int choice) {
        Player[] players = playerName(choice);
        System.out.printf("%s               #of Cards %40s               #of Cards               Winner\n", players[0].getName(), players[1].getName());
        return players;
    }


    public static void play(final ArrayList<Card> deck1, final ArrayList<Card> deck2, final Player[] players, final int numOfCards) {


        Player[] players1 = players;

        ArrayList<Card> cards1 = new ArrayList<>();
        ArrayList<Card> cards2 = new ArrayList<>();
        cards1.addAll(deck1.subList(0, 25));
        cards2.addAll(deck2.subList(0, 25));


//            playerA1.addAll(cards.subList(0, 25));
//            playerA2.addAll(cards.subList(26, 51));
boolean war = true;

        while (war) {

            Card player1Card = cards1.remove(0);
            Card player2Card = cards2.remove(0);


            if (player1Card.getValue() > player2Card.getValue()) {
                cards1.add(player1Card);
                cards1.add(player2Card);
                System.out.printf("%s %15s %45s %18s %30s                        \n", player1Card, cards1.size() + 1, player2Card, cards2.size() + 1, players1[0].getName());
            } else if (player1Card.getValue() < player2Card.getValue()) {
                cards2.add(player1Card);
                cards2.add(player2Card);
                System.out.printf("%s %15s %45s %18s %30s                        \n", player1Card, cards1.size() + 1, player2Card, cards2.size() + 1, players1[1].getName());
            } else if (player1Card.getValue() == player2Card.getValue()) {
                System.out.println("WAR!!");
                Card burnCard1 = cards1.remove(1);
                Card burnCard2 = cards2.remove(1);
                Card warCard1 = cards1.remove(2);
                Card warCard2 = cards2.remove(2);



                if(warCard1.getValue()>warCard2.getValue()){
                    cards1.add(player1Card);
                    cards1.add(player2Card);
                    cards1.add(burnCard1);
                    cards1.add(burnCard2);
                    cards1.add(warCard1);
                    cards1.add(warCard2);
                    System.out.printf("%s %15s %45s %18s %30s                        \n", player1Card, cards1.size() + 1, warCard1, cards2.size() + 1, players1[0].getName());
                    System.out.println(players1[0].getName() + " WINS!!");
                    war = false;
                }else if(warCard1.getValue()<warCard2.getValue()){
                    cards2.add(player1Card);
                    cards2.add(player2Card);
                    cards2.add(burnCard1);
                    cards2.add(burnCard2);
                    cards2.add(warCard1);
                    cards2.add(warCard2);
                    System.out.printf("%s %15s %45s %18s %30s                        \n", player1Card, cards1.size() + 1, warCard2, cards2.size() + 1, players1[1].getName());
                    System.out.println(players1[1].getName() + " WINS!!");
                    war = false;

                }

//                if(deck1.size() < 2 || deck2.size() < 2){
//                    if(deck1.size() > deck2.size()){
//                        System.out.println("PLAYER 1 WINS");
//                    }else{
//                        System.out.println("PLAYER 2 WINS");
//                    }sout

            }


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
        if (numOfPlayers == 1) {
            Player[] players = new Player[2];
            name = userInput.getString("Enter player name: ");
            player = new Player(name);
            players[0] = computer();
            players[1] = player;
            return players;

        } else if (numOfPlayers == 2) {

            int j = numOfPlayers;
            Player[] players = new Player[j];
            for (int i = 0; i < numOfPlayers; i++) {
                int num = i + 1;
                name = userInput.getString("Enter player" + num + " name: ");
                player = new Player(name);
                players[i] = player;
            }
            return players;

        } else
            return null;
    }


}
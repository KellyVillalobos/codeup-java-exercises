package cardgames;

import java.util.Arrays;
import java.util.Random;

import static cardgames.GameOfWar.cards;


public class CardsArray {
    public static void main(String[] args) {
       cards = shuffle(getAllCards());

for (Card card: cards){
    System.out.println(card);
}


    }
    public static Card[] getAllCards() {

        return new Card[]{
                /* ---------clubs------------ */
                new Card("clubs", 2),
                new Card("clubs", 3),
                new Card("clubs", 4),
                new Card("clubs", 5),
                new Card("clubs", 6),
                new Card("clubs", 7),
                new Card("clubs", 8),
                new Card("clubs", 9),
                new Card("clubs", 10),
                new Card("clubs", 11),
                new Card("clubs", 12),
                new Card("clubs", 13),
                new Card("clubs", 14),
                /* ---------hearts------------ */
                new Card("heats", 2),
                new Card("heats", 3),
                new Card("heats", 4),
                new Card("heats", 5),
                new Card("heats", 6),
                new Card("heats", 7),
                new Card("heats", 8),
                new Card("heats", 9),
                new Card("heats", 10),
                new Card("heats", 11),
                new Card("heats", 12),
                new Card("heats", 13),
                new Card("heats", 14),
                /* ---------spades------------ */
                new Card("spades", 2),
                new Card("spades", 3),
                new Card("spades", 4),
                new Card("spades", 5),
                new Card("spades", 6),
                new Card("spades", 7),
                new Card("spades", 8),
                new Card("spades", 9),
                new Card("spades", 10),
                new Card("spades", 11),
                new Card("spades", 12),
                new Card("spades", 13),
                new Card("spades", 14),
                /* ---------diamonds------------ */
                new Card("diamonds", 2),
                new Card("diamonds", 3),
                new Card("diamonds", 4),
                new Card("diamonds", 5),
                new Card("diamonds", 6),
                new Card("diamonds", 7),
                new Card("diamonds", 8),
                new Card("diamonds", 9),
                new Card("diamonds", 10),
                new Card("diamonds", 11),
                new Card("diamonds", 12),
                new Card("diamonds", 13),
                new Card("diamonds", 14),

        };

    }

    public static Card[] shuffle(Card[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length ; i++) {
            int j = random.nextInt(arr.length);

           Card temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }



}

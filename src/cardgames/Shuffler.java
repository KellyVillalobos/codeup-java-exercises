package cardgames;

import java.util.ArrayList;
import java.util.Random;


public class Shuffler {
    private ArrayList<Card> cards;

    public Shuffler(ArrayList<Card> cards){
        this.cards = cards;
    }

//    public static Card[] getAllCards() {
//
//        return new Card[]{
//                /* ---------clubs------------ */
//                new Card("clubs", 2),
//                new Card("clubs", 3),
//                new Card("clubs", 4),
//                new Card("clubs", 5),
//                new Card("clubs", 6),
//                new Card("clubs", 7),
//                new Card("clubs", 8),
//                new Card("clubs", 9),
//                new Card("clubs", 10),
//                new Card("clubs", 11),
//                new Card("clubs", 12),
//                new Card("clubs", 13),
//                new Card("clubs", 14),
//                /* ---------hearts------------ */
//                new Card("heats", 2),
//                new Card("heats", 3),
//                new Card("heats", 4),
//                new Card("heats", 5),
//                new Card("heats", 6),
//                new Card("heats", 7),
//                new Card("heats", 8),
//                new Card("heats", 9),
//                new Card("heats", 10),
//                new Card("heats", 11),
//                new Card("heats", 12),
//                new Card("heats", 13),
//                new Card("heats", 14),
//                /* ---------spades------------ */
//                new Card("spades", 2),
//                new Card("spades", 3),
//                new Card("spades", 4),
//                new Card("spades", 5),
//                new Card("spades", 6),
//                new Card("spades", 7),
//                new Card("spades", 8),
//                new Card("spades", 9),
//                new Card("spades", 10),
//                new Card("spades", 11),
//                new Card("spades", 12),
//                new Card("spades", 13),
//                new Card("spades", 14),
//                /* ---------diamonds------------ */
//                new Card("diamonds", 2),
//                new Card("diamonds", 3),
//                new Card("diamonds", 4),
//                new Card("diamonds", 5),
//                new Card("diamonds", 6),
//                new Card("diamonds", 7),
//                new Card("diamonds", 8),
//                new Card("diamonds", 9),
//                new Card("diamonds", 10),
//                new Card("diamonds", 11),
//                new Card("diamonds", 12),
//                new Card("diamonds", 13),
//                new Card("diamonds", 14),
//
//        };
//
//    }

    public  ArrayList<Card> shuffle() {
        Random random = new Random();

        for (int i = 0; i < this.cards.size() ; i++) {
            int j = random.nextInt(this.cards.size());

           Card temp = this.cards.get(i);
            this.cards.set(i, this.cards.get(j));
            this.cards.set(j, temp);
        }
        return this.cards;
    }

}

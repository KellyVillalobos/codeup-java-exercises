package cardgames;

import java.util.ArrayList;

public class Deck {

    public static ArrayList<Card> getDeck() {

        ArrayList<Card> cards = new ArrayList<>();

        /* ---------clubs------------ */
        cards.add(new Card("clubs", 2));
        cards.add(new Card("clubs", 3));
        cards.add(new Card("clubs", 4));
        cards.add(new Card("clubs", 5));
        cards.add(new Card("clubs", 6));
        cards.add(new Card("clubs", 7));
        cards.add(new Card("clubs", 8));
        cards.add(new Card("clubs", 9));
        cards.add(new Card("clubs", 10));
        cards.add(new Card("clubs", 11));
        cards.add(new Card("clubs", 12));
        cards.add(new Card("clubs", 13));
        cards.add(new Card("clubs", 14));
        /* ---------hearts------------ */
        cards.add(new Card("hearts", 2));
        cards.add(new Card("hearts", 3));
        cards.add(new Card("hearts", 4));
        cards.add(new Card("hearts", 5));
        cards.add(new Card("hearts", 6));
        cards.add(new Card("hearts", 7));
        cards.add(new Card("hearts", 8));
        cards.add(new Card("hearts", 9));
        cards.add(new Card("hearts", 10));
        cards.add(new Card("hearts", 11));
        cards.add(new Card("hearts", 12));
        cards.add(new Card("hearts", 13));
        cards.add(new Card("hearts", 14));
        /* ---------spades------------ */
        cards.add(new Card("spades", 2));
        cards.add(new Card("spades", 3));
        cards.add(new Card("spades", 4));
        cards.add(new Card("spades", 5));
        cards.add(new Card("spades", 6));
        cards.add(new Card("spades", 7));
        cards.add(new Card("spades", 8));
        cards.add(new Card("spades", 9));
        cards.add(new Card("spades", 10));
        cards.add(new Card("spades", 11));
        cards.add(new Card("spades", 12));
        cards.add(new Card("spades", 13));
        cards.add(new Card("spades", 14));
        /* ---------diamonds------------ */
        cards.add(new Card("diamonds", 2));
        cards.add(new Card("diamonds", 3));
        cards.add(new Card("diamonds", 4));
        cards.add(new Card("diamonds", 5));
        cards.add(new Card("diamonds", 6));
        cards.add(new Card("diamonds", 7));
        cards.add(new Card("diamonds", 8));
        cards.add(new Card("diamonds", 9));
        cards.add(new Card("diamonds", 10));
        cards.add(new Card("diamonds", 11));
        cards.add(new Card("diamonds", 12));
        cards.add(new Card("diamonds", 13));
        cards.add(new Card("diamonds", 14));

        return cards;
    }
}


import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {


        String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy"};
        String[] nouns = {"people", "history", "way", "art", "world", "information", "map", "two", "family", "government"};

        System.out.println(adjectives);

        String adj = adjectives[new Random().nextInt(adjectives.length)];
        String nou = nouns[new Random().nextInt(nouns.length)];

//        System.out.println(adj);
//        System.out.println(nou);

        System.out.printf("here is your server name:%n%s %s ", adj, nou);

    }


}



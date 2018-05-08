

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {


        String[] adjectives = {"agreeable", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy"};
        String[] nouns = {"people", "history", "way", "art", "world", "information", "map", "two", "family", "government"};

        System.out.println(adjectives);

        String adj = randomString(adjectives);
        String nou = randomString(nouns);

//        System.out.println(adj);
//        System.out.println(nou);

        System.out.printf("here is your server name:%n%s-%s ", adj, nou);

    }
public static String randomString(String[] array){
       String randomString = array[new Random().nextInt(array.length)];

              return randomString;
}

}



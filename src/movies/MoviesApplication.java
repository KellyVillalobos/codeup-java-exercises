package movies;

import util.Input;

import java.lang.reflect.Array;
import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        allMovies();


        System.out.println("What would you like to do?\n\n");
        System.out.println("0 - exit\n1 - view all movies\n2 - view movies with the animated category\n" +
                "3 - view movies with the drama category\n4 - view movies with the horror category\n" +
                "5 - view movies with the scifi category\n\n");

        Input uerInput = new Input();
//        System.out.println(uerInput.getString("Enter Your choice: "));
        System.out.println("Enter your choice: ");

        int choice = uerInput.getInt();

        String movieString;


        switch (choice) {
            case 0:
                System.exit(0);
                movieString ="";
                break;
            case 1:
                movieString = allMovies();
                break;
            case 2:
                movieString = allAnimated();
                break;
            case 3:
                movieString = allDrama();
                break;
            case 4:
                movieString = allHorror();
                break;
            case 5:
                movieString = allScifi();
                break;
            default:
                movieString = "";
        }
        System.out.println(movieString);






    }

    public static String allMovies() {
        Movie[] allMovies = findAll();
        String movieString = "";
        for (int i = 0; i < allMovies.length; i++) {
            Movie movie = allMovies[i];

            movieString += (movie.getName() + " - - " + movie.getCategory() + "\n");

        }
        return movieString;



    }

    public static String allDrama(){
        Movie[] allMovies = findAll();
        String dramaString = "";
        for (int i = 0; i < allMovies.length; i++) {
            if (allMovies[i].getCategory().equals("drama")) {
                Movie drama = allMovies[i];
                dramaString += (drama.getName() + " - - " + drama.getCategory() + "\n");

            }
        }

        return dramaString;
    }

    public static String allAnimated(){
        Movie[] allMovies = findAll();
        String animatedString = "";
        for (int i = 0; i < allMovies.length ; i++) {
            if (allMovies[i].getCategory().equals("animated")){
                Movie animated = allMovies[i];
                animatedString += (animated.getName() + " - - " + animated.getCategory() + "\n");
            }


        }
        return animatedString;
    }
    public static String allHorror(){
        Movie[] allMovies = findAll();
        String horrorString = "";
        for (int i = 0; i < allMovies.length ; i++) {
            if (allMovies[i].getCategory().equals("horror")){
                Movie horror = allMovies[i];
                horrorString += (horror.getName() + " - - " + horror.getCategory() + "\n");
            }


        }
        return horrorString;
    }
    public static String allScifi(){
        Movie[] allMovies = findAll();
        String scifiString = "";
        for (int i = 0; i < allMovies.length ; i++) {
            if (allMovies[i].getCategory().equals("scifi")){
                Movie scifi = allMovies[i];
                scifiString += (scifi.getName() + " - - " + scifi.getCategory() + "\n");
            }


        }
        return scifiString;
    }
    public static void wantsToContinue(){}

}

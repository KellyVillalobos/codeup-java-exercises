package movies;

import util.Input;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();
    public static Input userInput = new Input();

    public static void main(String[] args) {


        System.out.println("Welcome to the MovieApp");

        showMenu();
    }

    public static void showMenu() {

        do {
            System.out.println();
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies with the animated category\n" +
                    "3 - view movies with the drama category\n4 - view movies with the horror category\n" +
                    "5 - view movies with the scifi category\n\n");
            System.out.print("What would you like to do?: ");
            int choice = getChoice();
            useChoice(choice);
        } while (true);

    }
    public static int getChoice() {
        return userInput.getInt();
    }

    public static void useChoice(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Thank you and Goodbye.");
                System.exit(0);
                break;
            case 1:
                showMovies();
                break;
            case 2:
                showMovies("animated");
                break;
            case 3:
                showMovies("drama");
                break;
            case 4:
                showMovies("horror");
                break;
            case 5:
                showMovies("scifi");
                break;
            case 6:
                showMovies("musical");
            default:
                System.out.println("Error: Your selection is not a valid choice");

        }


    }
    public static void showMovies() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static void showMovies(String category) {
        for (Movie movie : movies) {
            if (movie.isInCategory(category)) {
                System.out.println(movie);
            }
        }
    }


}

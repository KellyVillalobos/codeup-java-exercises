package cardgames;

public class Player {
    private int gamesWon = 0;
    private String name;

    //-----name constructor-----|
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public int playerCount(){
        gamesWon = 0;
        return gamesWon++ ;
    }



}
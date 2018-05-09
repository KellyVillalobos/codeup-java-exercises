package cardgames;

public class Player {
    private int gamesWon;
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

//    public String addPlayer(String name){
//        Player name = new Player(name);
//    }
}
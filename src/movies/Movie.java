package movies;

import java.util.Arrays;

public class Movie {
    private String name;
    private String category;
    //----Name constructor---------|

    public Movie(String name, String category) {

        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}

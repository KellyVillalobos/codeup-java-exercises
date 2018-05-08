package movies;

import javax.lang.model.element.NestingKind;
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

    public String toString() {
        return getName() + ", Category: " + getCategory();
    }

    public boolean isInCategory(String category) {
        return this.getCategory().equals(category);
    }
}

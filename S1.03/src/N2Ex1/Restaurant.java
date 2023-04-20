package N2Ex1;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant {

    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant that)) return false;
        return getRating() == that.getRating() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRating());
    }

    @Override
    public String toString() {
        return "Restaurant: " +
                name +
                " and your rating is " + rating
                ;
    }
}

package N1Ex1;

import java.util.Objects;

public class Month {

    private String name;

    public Month (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Month month)) return false;
        return Objects.equals(getName(), month.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

}

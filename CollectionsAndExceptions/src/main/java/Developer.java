import java.util.Date;

public class Developer extends AllEmployees {

    public Developer(String firstName, String lastName, Date entryDate) {
        super("DEV",firstName, lastName, entryDate);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

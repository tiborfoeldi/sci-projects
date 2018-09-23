import java.util.Date;

public class BusinessAnalyst extends AllEmployees {

    public BusinessAnalyst(String firstName, String lastName, Date entryDate) {
        super("BA",firstName, lastName, entryDate);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}

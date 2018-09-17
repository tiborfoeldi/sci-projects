import java.util.Date;

public class ProjectManager extends AllEmployees {

    public ProjectManager(String firstName, String lastName, Date entryDate) {
        super("PM", firstName, lastName, entryDate);
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

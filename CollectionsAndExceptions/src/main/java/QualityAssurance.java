import java.util.Date;

public class QualityAssurance extends AllEmployees {


    public QualityAssurance(String firstName, String lastName, Date entryDate) {
        super("QA", firstName, lastName, entryDate);
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

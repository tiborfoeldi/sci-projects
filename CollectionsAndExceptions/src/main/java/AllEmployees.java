import java.util.Date;

public class AllEmployees implements Comparable<AllEmployees>{
    private String departament;
    private String firstName;
    private String lastName;
    private Date entryDate;


    public AllEmployees(String departament, String firstName, String lastName, Date entryDate) {
        this.departament = departament;
        this.firstName = firstName;
        this.lastName = lastName;
        this.entryDate = entryDate;
    }

    public String getDepartament() {
        return departament;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllEmployees allEmployees = (AllEmployees) o;

        if (!firstName.equals(allEmployees.firstName)) return false;
        if (!lastName.equals(allEmployees.lastName)) return false;
        return entryDate.equals(allEmployees.entryDate);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + entryDate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  "\n" + departament +"{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", entryDate=" + entryDate +
                '}';

    }

    @Override
    public int compareTo(AllEmployees o) {
        return getEntryDate().compareTo(o.getEntryDate());
    }
}

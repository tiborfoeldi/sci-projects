import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeReader {

    private Reader reader;


    public EmployeeReader(Reader reader) {
        this.reader = reader;
    }

    public List<AllEmployees> getEmployee() throws IOException, ParseException {
        try (BufferedReader br = new BufferedReader(reader)) {
            List<AllEmployees> allEmployees = new ArrayList<AllEmployees>();
            String line = br.readLine();
            while (line != null) {
                allEmployees.add(parseEmployee(line));
                line = br.readLine();
            }
            return allEmployees;
        }
    }

    private AllEmployees parseEmployee(String line) throws ParseException {
        String[] tokens = line.split(",");
        DateFormat formatter;
        Date date;
        formatter = new SimpleDateFormat("dd-MM-yyyy");
        date = formatter.parse(tokens[3]);
        return new AllEmployees(tokens[0], tokens[1], tokens[2], date);
    }


}

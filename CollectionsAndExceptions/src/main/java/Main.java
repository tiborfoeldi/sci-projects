import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
//        Company has employees.
//
//        Some people have parking spaces allocated to them. Other's don't.
//
//
//
//        Write Company Management System that as an input receives a list of employees.
//
//        The Company Management System must allow a way to obtain a list of employees who don't have any parking spaces.
//        This list should be ordered based on the employee's seniority in the company.
//
//        Employee's seniority is defined by the years spent in the company - Not the role.
//
//
//
//        Internally the company keeps the employees in role-specific lists.
//
//        All managers will be in a managers collection, all junior software engineers will be in the junior software engineers collection.
//
//
//
//        Feel free to define any types of roles you wish.
//
//
//
//        Use at least:
//
//        - one List
//        - one Sorting

        File file = new File("employees.csv");
        Path path =file.toPath();
//        List<String> strings = Files.readAllLines(path);
//        System.out.println(strings);


        FileReader fr = new FileReader(file);
        List<Employee> employees = new EmployeeReader(fr).getEmployee();
//        System.out.println(employees);

        TheListsOfEmployees lists = new TheListsOfEmployees();
        for (Employee e : employees){
            lists.addEmployee(e);
        }

        System.out.println(lists.getBusinessAnalysts());
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheListsOfEmployees {
    private List<AllEmployees> allEmployees = new ArrayList<AllEmployees>();
    private List<ProjectManager> projectManagers = new ArrayList<ProjectManager>();
    private List<BusinessAnalyst> businessAnalysts = new ArrayList<BusinessAnalyst>();
    private List<QualityAssurance> qualityAssurances = new ArrayList<QualityAssurance>();
    private List<Developer> developers = new ArrayList<Developer>();


    public void addEmployee(AllEmployees allEmployees) {
        switch (allEmployees.getDepartament()) {
            case "PM":
                projectManagers.add(new ProjectManager(allEmployees.getFirstName(), allEmployees.getLastName(), allEmployees.getEntryDate()));
                break;
            case "BA":
                businessAnalysts.add(new BusinessAnalyst(allEmployees.getFirstName(), allEmployees.getLastName(), allEmployees.getEntryDate()));
                break;
            case "QA":
                qualityAssurances.add(new QualityAssurance(allEmployees.getFirstName(), allEmployees.getLastName(), allEmployees.getEntryDate()));
                break;
            case "DEV":
                developers.add(new Developer(allEmployees.getFirstName(), allEmployees.getLastName(), allEmployees.getEntryDate()));
                break;
        }
        this.allEmployees.add(allEmployees);
        Collections.sort(this.allEmployees);
    }

    public List<AllEmployees> getAllEmployees() {
        return allEmployees;
    }

    public List<ProjectManager> getProjectManagers() {
        return projectManagers;
    }

    public List<BusinessAnalyst> getBusinessAnalysts() {
        return businessAnalysts;
    }

    public List<QualityAssurance> getQualityAssurances() {
        return qualityAssurances;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }
}






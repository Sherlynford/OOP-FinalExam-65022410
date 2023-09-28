import java.util.ArrayList;

class Project {
    private String projectName;
    private String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public String getProject() {
        return projectName + " : " + description;
    }
}

interface Person {
    public String getName();

    public void setName(String Name);

    public int getAge();

    public void setAge(int Age);
}

interface Job {
    public String getPosition();

    public void setPosition(String Position);

    public String getEmpID();

    public void setEmpID(String EmpID);
}

class Employee implements Person, Job {
    private String Name;
    private int Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> projects;

    public Employee(String Name, int Age, String Position, String EmpID) {
        this.Name = Name;
        this.Age = Age;
        this.Position = Position;
        this.EmpID = EmpID;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public String showDetail() {
        StringBuilder details = new StringBuilder();
        details.append("Name: ").append(Name).append("\n");
        details.append("Position: ").append(Position).append("\n");
        details.append("EmpID: ").append(EmpID).append("\n");
        details.append("Projects:\n");
        for (Project project : projects) {
            details.append("\t").append(project.getProject()).append("\n");
        }
        return details.toString();
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String getPosition() {
        return Position;
    }

    @Override
    public void setPosition(String Position) {
        this.Position = Position;
    }

    @Override
    public String getEmpID() {
        return EmpID;
    }

    @Override
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }
}

public class Main {
    public static void main(String[] args) {
        Project project1 = new Project("Web A", "Developing a web application");
        Project project2 = new Project("Mobile app A", "Developing a mobile app");

        Employee employee1 = new Employee("Tom", 25, "UX/UI", "0001");
        employee1.addProject(project1);
        employee1.addProject(project2);

        Employee employee2 = new Employee("Tim", 30, "FrontEnd", "0002");
        employee2.addProject(project1);

        System.out.println(employee1.showDetail());
        System.out.println("********************************************");
        System.out.println(employee2.showDetail());
    }
}
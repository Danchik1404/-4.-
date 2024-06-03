import java.util.ArrayList;


public class Database {
    private final ArrayList<Employee> empDatabase;

    public Database() {
        this.empDatabase = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeesByExperience(int experience) {
        ArrayList<Employee> selection = new ArrayList<>();
        for (Employee employee : empDatabase) {
            if (employee.experience == experience) {
                selection.add(employee);
            }
        }
        return selection;
    }

    private ArrayList<Employee> getEmployeesByName(String name) {
        ArrayList<Employee> selection = new ArrayList<>();
        for (Employee employee : empDatabase) {
            if (employee.name.equals(name)) {
                selection.add(employee);
            }
        }
        return selection;
    }

    public void getEmployeePhoneByName(String name) {
        ArrayList<Employee> selection = getEmployeesByName(name);
        if (selection.size() > 0) {
            selection.forEach(employee -> System.out.println(
                    "ID " + employee.empId + " - " + employee.name + " " + employee.phone
            ));
        } else {
            System.out.println("No employees with such phone number.");
        }
    }

    public Employee getEmployeeById(int employeeId) {
        return empDatabase.stream()
                .filter(employee -> employee.empId.equals(employeeId))
                .findFirst()
                .orElse(null);
    }

    public void add(Integer empId, String name, String phone, Integer experience) {
        if (getEmployeeById(empId) == null) {
            Employee employee = new Employee(empId, name, phone, experience);
            empDatabase.add(employee);
        } else {
            System.out.println("Incorrect employee ID");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        empDatabase.forEach(obj -> result.append(obj).append("\n"));
        return result.toString();
    }
}
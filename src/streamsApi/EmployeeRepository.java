package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private List<Employee> employeeList;

    public EmployeeRepository() {
        this.employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John Doe", "john.doe@example.com", "IT", 75000, 30));
        employeeList.add(new Employee(2, "Jane Smith", "jane.smith@example.com", "Finance", 68000, 28));
        employeeList.add(new Employee(3, "Emily Johnson", "emily.johnson@example.com", "HR", 60000, 35));
        employeeList.add(new Employee(4, "Michael Brown", "michael.brown@example.com", "Marketing", 72000, 40));
        employeeList.add(new Employee(5, "Chris Davis", "chris.davis@example.com", "Development", 82000, 32));
        employeeList.add(new Employee(6, "Anna Taylor", "anna.taylor@example.com", "Sales", 68000, 26));
        employeeList.add(new Employee(7, "David Wilson", "david.wilson@example.com", "Operations", 75000, 45));
        employeeList.add(new Employee(8, "Laura White", "laura.white@example.com", "IT", 78000, 33));
        employeeList.add(new Employee(9, "James Green", "james.green@example.com", "Logistics", 65000, 38));
        employeeList.add(new Employee(10, "Sophia Lee", "sophia.lee@example.com", "Research", 90000, 29));

    }

    public List<Employee> getEmployees() {
        return this.employeeList;
    }

    // We have to make this method returnType to "Optional" to overcome exceptions like "No Value Present"
    public Optional<Employee> getEmployeeById(int id) {
        return this.employeeList.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst();
    }
}

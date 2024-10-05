package streamsApi;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeService(employeeRepository);
        List<Employee> employeeList = employeeService.getEmployees();
        employeeList.forEach(System.out::println);
        // Intermediate operations:
        // Filter
        employeeService.getEmployeesFilteredBasedOnSalary(70000).forEach(System.out::println);

        employeeService.getEmployeeEmails().forEach(System.out::println);


        try {
            System.out.println(employeeService.getEmployeeById(3));
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

package streamsApi;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    // we have to give repository dependence since we are getting data from their.
    private EmployeeRepository employeeRepository;

    // We are creating ARG constructor with employee Repository: which means it is necessary to
    // have a employee Repo to start with EmployeeService.
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees() {
        return this.employeeRepository.getEmployees();
    }

    public List<Employee> getEmployeesFilteredBasedOnSalary(double minSalary) {
        return this.employeeRepository.getEmployees().stream()
                .filter(employee -> employee.getSalary() >= minSalary)
                .collect(Collectors.toList());
    }

    public List<String> getEmployeeEmails() {
        return this.employeeRepository.getEmployees().stream()
                .map(Employee::getEmail)
                .collect(Collectors.toList());
    }


    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        Optional<Employee> optional = this.employeeRepository.getEmployeeById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else throw new EmployeeNotFoundException("Employee Not Found with ID " + id);
    }
}

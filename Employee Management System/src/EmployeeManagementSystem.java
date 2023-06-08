import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class EmployeeManagementSystem {
    private List<Employee> employees;
    private Map<Integer, Employee> employeeMap;

    public  EmployeeManagementSystem() {
        employees = new ArrayList<>();
        employeeMap = new HashMap<>();
    }


    // Getter ho
    public List<Employee> getEmployees() {
        return employees;
    }

    // Getter ho
    public Map<Integer, Employee> getEmployeeMap() {
        return employeeMap;
    }


    //Adding methods as instructed jstai add remove and all stuffs.

    //Adding Employee
    public void addEmployee(Employee e){
        employees.add(e); // add() builtin function ho array ma
        employeeMap.put(e.getId(),e); //
    }

    public void printEmployees(){
        Stream<Employee>  employeeStream = employees.stream();
        employeeStream.forEach(e -> System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary()));
    }
    // Print all departments of an employee with the given ID using a Stream and a Lambda function
    public void printDepartments(Integer id) {
        employeeMap.entrySet().stream()
                .filter(entry -> entry.getKey().equals(id))
                .flatMap(entry -> entry.getValue().getDepartments().stream())
                .forEach(System.out::println);
    }

    // Add a department to the given employee's department set
    // Add a department to the given employee's department set
    public void addDepartment(Integer id, Department department) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            employee.addDepartment(department);
        }
    }

}

import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        // Create an instance of EmployeeManagementSystem
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Create some Employee objects
        Employee employee1 = new Employee(1, "John Doe",  50000);
        Employee employee2 = new Employee(2, "Jane Smith",  60000);
        Employee employee3 = new Employee(3, "Mike Johnson",  55000);

        // Add employees to system
        ems.addEmployee(employee1);
        ems.addEmployee(employee2);
        ems.addEmployee(employee3);

        // SHould print  the name and salary of employees:
        ems.printEmployees();


        // yesto garnai mildaina ani
//        Department department1 = new Department("Marketing");
//        Department department2 = new Department("Sales");
//        Department department3 = new Department("HR");
        //department object banako
        Department department1 = Department.MARKETING;
        Department department2 = Department.SALES;
        Department department3 = Department.HR;

        ems.addDepartment(1, department1);
        ems.addDepartment(2, department2);
        ems.addDepartment(2, department3);

        // Print the departments of an employee with a given ID
        ems.printDepartments(2);
    }
}

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private int id;
    private String name;
    private Set<Department> departments;
    private double salary;
    private boolean fulltime;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.departments = new HashSet<>();
        this.salary = salary;
        this.fulltime = setFullTime(salary);
        this.departments = new HashSet<>(departments);
    }

    private boolean setFullTime(double salary) {
        return salary >= 20000;
    }

    // Getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        this.fulltime = setFullTime(salary);
    }

    public boolean isFulltime() {
        return fulltime;
    }

    // Add a department to the employee's department set
    public void addDepartment(Department department) {
        departments.add(department);
    }
}

//import java.util.HashSet;
//import java.util.Set;
//
//public class Employee {
//    private int id;
//    private String name;
//    private Set<Department> departments;
//    private double salary;
//    private boolean fulltime;
//
//    public Employee(int id, String name, Set<Department> departments, double salary, boolean fulltime) {
//        this.id = id;
//        this.name = name;
//        this.departments = new HashSet<>();
//        this.salary = salary;
//        this.fulltime = setFullTime(salary);
//    }
//
//    private Boolean setFullTime(double salary) {
//        return this.fulltime = (salary >= 20000) ? true : false;
//    }
//
//
//    //getter and setter methods hai yeta hai
//
//    public int getId(){
//        return id;
//    }
//
//    public void setId(int Id){
//        this.id  = id;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//         this.name=name;
//    }
//
//    public Set<Department> getDepartments(){
//        return departments;
//    }
//
//
//    public void setDepartments(Set<Department> departments){
//        this.departments = new HashSet<>(departments);
//    }
//
//    public double getSalary(){
//        return salary;
//    }
//
//    public void setSalary(double salary){
//        this.salary= salary;
//        setFullTime(salary);
//    }
//
//    public boolean isFulltime(){
//        return fulltime;
//    }
//
//    public void addDepartment(Department department) {
//        departments.add(department);
//    }
//}
//

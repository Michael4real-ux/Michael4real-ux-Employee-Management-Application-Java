import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> employeeService = new HashSet<Employee>();

    Employee emp1=new Employee(101, "Damilola", 24, "Developer", "IT", 25000);
    Employee emp2=new Employee(102, "Meena", 26, "Tester","CO", 57000);
    Employee emp3=new Employee(103, "Bob", 20, "DevOps Eng","Admin", 5000);
    Employee emp4=new Employee(104, "Max", 27, "System Eng","CO",  70000);



    Scanner scanner=new Scanner(System.in);

    boolean found= false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public EmployeeService() {
        employeeService.add(emp1);
        employeeService.add(emp2);
        employeeService.add(emp3);
        employeeService.add(emp4);
    }

    // view all employees
    public void viewAllEmployees(){
        for(Employee emp:employeeService){
            System.out.println(emp);
        }
    }

}

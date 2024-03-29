import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> employeeService = new HashSet<>();

    Employee emp1=new Employee(101, "manilla", 24, "Developer", "IT", 25000);
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
    // View employee based on their id
    public void viewEmployee(){
        System.out.format("Enter id: ");
        id = Integer.parseInt(scanner.nextLine());
        for(Employee emp:employeeService){
            if(emp.getId() == id){
                System.out.println(emp);
                found = true;
            }
        }
        if(!found){
            System.out.println("Employee with this id is not present");
        } else{
            System.out.println("Employee found");
        }
    }

    // Update Employee
    public void updateEmployee(){
        System.out.format("Enter id: ");
        id = Integer.parseInt(scanner.nextLine());
        boolean found= false;
        for(Employee emp:employeeService){
            if(emp.getId() ==id){
                System.out.format("Enter name: ");
                name = scanner.nextLine();
                System.out.format("Enter new salary: ");
                sal = Double.parseDouble(scanner.nextLine());
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated Details of employee are: " + emp);
                found = true;
            }

        }
        if(!found){
            System.out.println("Employee is not found");
        }else{
           System.out.println("Employee updated successfully !!");
        }
    }

    // Delete Employee
    public void deleteEmployee(){
        System.out.format("Enter your id: ");
        id = Integer.parseInt(scanner.nextLine());
        boolean found=false;
        Employee deleteEmp=null;
        for(Employee emp:employeeService) {
            if(emp.getId()==id) {
                deleteEmp=emp;
                found=true;
            }
        }
        if(!found) {
            System.out.println("Employee is not present");
        }
        else {
            employeeService.remove(deleteEmp);
            System.out.println("Employee deleted successfully!!");
        }
    }

    // Add employee
    public void addEmployee(){
        System.out.format("Enter id: ");
        id=Integer.parseInt(scanner.nextLine());
        System.out.format("Enter name: ");
        name= scanner.nextLine();
        System.out.format("Enter age: ");
        age=Integer.parseInt(scanner.nextLine());
        System.out.format("Enter Designation: ");
        designation=scanner.nextLine();
        System.out.format("Enter Department: ");
        department=scanner.nextLine();
        System.out.format("Enter salary: ");
        sal = Double.parseDouble(scanner.nextLine());

        Employee emp= new Employee(id, name, age, designation, department, sal);
        employeeService.add(emp);
        System.out.println(emp);
        System.out.println("Employee added successfully");
    }

}

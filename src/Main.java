import java.util.Scanner;

public class Main {
    EmployeeService service = new EmployeeService();

    static boolean ordering = true;
    public static void menu(){
        System.out.println("**************Welcome To Employee Management System***************"
                + "\n1. Add Employee"
                + "\n2.View Employee"
                + "\n3.Update Employee"
                + "\n4. Delete Employee"
                + "\n5.View All Employee"
                + "\n6. Exist ");
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     do{
         menu();
         System.out.printf("Enter your Choice: ");
         int choice = scanner .nextInt();
      switch(choice){
          case 1:
              System.out.println("Add Employee");
              break;
          case 2:
              System.out.println("View Employee");
              break;
          case 3:
              System.out.println("Update Employee");
              break;
          case 4:
              System.out.println("Delete Employee");
              break;
          case 5:
              System.out.println("View All Employee");
              break;
          case 6:
              System.out.println("Thank you for using our employee management app");
              System.exit(0);
          default:
              System.out.println("Please enter valid choice");

      }
     } while(ordering);
    }
}
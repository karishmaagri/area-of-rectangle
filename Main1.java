package firstproject;

public class Main1 {

public static void main(String[] args) {
   // Creating an Employee object
   Employee employee = new Employee("Karishma", 21, "1234567890", "123 Main St", 50000, "Software Development");

   // Creating a Manager object
   Manager manager = new Manager("Shubman Gill", 24, "0987654321", "Mumbai", 80000, "Cricketer");

   // Printing details and salary of the employee
   System.out.println("Employee Details:");
   System.out.println("Name: " + employee.name);
   System.out.println("Age: " + employee.age);
   System.out.println("Phone Number: " + employee.phoneNumber);
   System.out.println("Address: " + employee.address);
   System.out.println("Specialization: " + employee.specialization);
   employee.printSalary();

   // Printing details and salary of the manager
   System.out.println("\nManager Details:");
   System.out.println("Name: " + manager.name);
   System.out.println("Age: " + manager.age);
   System.out.println("Phone Number: " + manager.phoneNumber);
   System.out.println("Address: " + manager.address);
   System.out.println("Department: " + manager.department);
   manager.printSalary();
}
}

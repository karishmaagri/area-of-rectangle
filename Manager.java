package firstproject;


public class Manager extends Member {
String department;

// Constructor
public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
   super(name, age, phoneNumber, address, salary);
   this.department = department;
}
}
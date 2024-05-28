package firstproject;

public class Employee extends Member {
String specialization;

// Constructor
public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
   super(name, age, phoneNumber, address, salary);
   this.specialization = specialization;
}
}
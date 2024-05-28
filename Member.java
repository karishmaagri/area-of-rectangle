package firstproject;

public class Member {

 String name;
 int age;
 String phoneNumber;
 String address;
 double salary;


 public Member(String name, int age, String phoneNumber, String address, double salary) {
     this.name = name;
     this.age = age;
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.salary = salary;
 }


// public Member(String name2, int age2, String phoneNumber2, String address2, double salary2) {
	// TODO Auto-generated constructor stub
//}


public void printSalary() {
     System.out.println("Salary: " + salary);
 }
}






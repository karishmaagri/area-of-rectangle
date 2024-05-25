package employee;

import java.util.Scanner;

public class displayinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emppersonalinfo emp = new emppersonalinfo();

Scanner sc = new Scanner(System.in);

System.out.println("Enter Your Name==>");
String ename = sc.nextLine();
System.out.println("Enter your contact info==>");	
int contact = sc.nextInt();
System.out.println("Enter your email==>");
String email = sc.next();



emp.setEname(ename);
emp.setMobileno(contact);
emp.setEmailId(email);


System.out.println(emp);

	}

}

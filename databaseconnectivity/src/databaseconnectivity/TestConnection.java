package databaseconnectivity;
import java.util.Scanner;
public class TestConnection {

	public static void main(String[] args) {
		
		
		Account ac = new Account();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		ac.setAccname( sc.nextLine());
		
		System.out.println("Enter number");
		ac.setAccno(sc.nextLine());
		
		System.out.println("Enter balance");
		 ac.setBalance(sc.nextInt());
		 
		 DatabaseConnection.getConnection();
		 
		Crudoperation crd = new Crudoperation();
		
		
		
		
		//Crudoperation.insertdata(ac.getAccno(), ac.getAccname(),ac.getBalance());
		//Crudoperation.getdata();
		
		
		
		
		
		//DatabaseConnection.getConnection();
			//Crudoperation.insertData("acc05","Ji",6700);
			//Crudoperation.insertData("acc06","mihir",600);
			//Crudoperation.insertData("acc07","jaimin",600);
			//Crudoperation.insertData("acc08","shrey",700);
			//Crudoperation.deleteData("acc01");
			
	}

}

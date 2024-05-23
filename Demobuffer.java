package employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demobuffer {

	public static void main(String[] args)throws Exception{

	
		String name;
		int Salary;
		
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name");
			name = br.readLine();
			System.out.println("Enter Salary");
			Salary = Integer.parseInt(br.readLine());
			System.out.println(name + " " + Salary);
			
			
		}
		
	}
		





package databaseconnectivity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Crudoperation crd = new Crudoperation();
		System.out.println(crd);
		Crudoperation.getData();
		Crudoperation.deleteData(123);
		Crudoperation.insertdata(null, null, 0);
		Crudoperation.updatedata(null, null);
		
		//PreCrud pr = new PreCrud();
		//PreCrud.insertData();
		
		
		
	}
}
	
		
		// Students stt = new Students(216,"amad","science");
		 
		 //Crudoperation cr = new Crudoperation();
		 
		 //Crudoperation.insertdata(stt.getEnroll(),stt.getName(),stt.getStream());
		 
		 //System.out.println(stt);
		// Crudoperation.getdata();
		 //Crudoperation.deleteData(143);


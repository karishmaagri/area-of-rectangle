package databaseconnectivity;
import java.sql.*;
public class DatabaseConnection {
	
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="Kaju#1268Agri";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/bank";
	static  Connection cn;
	
	
	
	public static Connection getConnection() {
		
		try {
			
		
			Class.forName("com.mysql.cj.jdbc.Driver");   // 2 . driver register
			cn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD );
			
			//System.out.println(cn);
		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
		} 
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		return(cn);
}
}
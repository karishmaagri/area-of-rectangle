package databaseconnectivity;
import java.sql.*;
import javax.sql.*;

public class PreCrud {
	
	static Connection cn;
	static PreparedStatement pst;
	
	public PreCrud() {
		cn = DatabaseConnection.getConnection();
		 
	}
	
	public static void insertData() {
		
		String squery = "insert into bank values('a001', 'Sharmila', 45000)";
		try {
			pst = cn.prepareStatement(squery);
			pst.setString(1,"Kaju" );
			pst.setString(2,"Jigu" );
			pst.setInt(3,111 );
		    int r = pst.executeUpdate();
		    
		    if(r>0) {
		    	System.out.println("Record inserted ....");
		    }
		
		} catch (SQLException e) {
			 
			e.printStackTrace();
		}
		
	}

}

package databaseconnectivity;

import java.sql.*;
import javax.sql.*;

public class Crudoperation {
	static Statement st;
	static Connection cn;
	
	
	public Crudoperation() {
		cn = DatabaseConnection.getConnection();
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void insertdata(String accno,String accname,int balance) {

		String squery=	"insert into bank values('" + accno + "','" + accname + "'," + balance+ ")";

		System.out.println(squery);
		
		try {
			int result = st.executeUpdate(squery);
			//System.out.println(r);
			if(result>0) {
				System.out.println("Data inserted");
			}
					// TODO: handle exception
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void deleteData(int i) {
		String squery="delete from bank where accno='" +i+ "'";

		try {
			int result= st.executeUpdate(squery);
			if(result>0) {
				System.out.println("Data deleted .....");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void updatedata(String accname, String accno) {
	
		String squery="update bank set accname='"+accname+"' where accno='"+accno+"'";
		try {
			int result =st.executeUpdate(squery);
			System.out.println("Data Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void getData() {
		// TODO Auto-generated method stub
		String squery = "select * from bank";
		try {
			ResultSet r = st.executeQuery(squery);
			while(r.next()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

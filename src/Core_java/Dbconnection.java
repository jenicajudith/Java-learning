package Core_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbconnection {
	
	static String url="jdbc:mysql://localhost:3306/Student";
	static 	String username="root";
	static 	String password="Judi@2005";
		
		public static Connection  dbconnection() {
			Connection conn=null; 	try {
			conn= DriverManager.getConnection(url,username,password);
			}catch (SQLException e) {
				
				System.out.println(e.getMessage());
			}
			return conn;
		}

}

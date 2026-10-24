package Core_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Studenttable {

	
	String tablecreation="create table stutable("+
			"id int ,"+ "name varchar(50),"+"dept varchar(50) )";
	
	Connection conn=Dbconnection.dbconnection();
	Scanner sc= new Scanner(System.in);
	public void stutablecreation() {
		try {
		Statement st= conn.createStatement();
		st.executeUpdate(tablecreation);
		System.out.println("table is created");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	String insert="insert into stutable(id,name,dept) value(?,?,?)";
	public void insert() {
		try {
			System.out.println("enter your id");
			int id=sc.nextInt();
			System.out.println("enter your name");
			String name=sc.next();
			System.out.println("enter your department");
			String dept=sc.next();
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, dept);
			int row=ps.executeUpdate();
			if(row==1) {
				System.out.println("data stored successfully");
			}
			else {
				System.out.println("data not stored");
			}
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

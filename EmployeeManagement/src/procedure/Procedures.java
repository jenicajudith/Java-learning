package procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import emp.Dbconnection;

public class Procedures {
	String store="create procedure insertdisplay(in empids int,in empnames varchar(50),"
			+ " in empsalarys double,in empshifttimes varchar(50),in emppasswords varchar(50)) "
+ "begin "
+ "insert into emptable(empid,empname,empsalary,empshifttime,emppassword)"
+ "value(empids,empnames,empsalarys,empshifttimes,emppasswords);"
+ "select * from emptable;"
+ "end";
	Connection conn=Dbconnection.dbconnection();
	public void createprocedures() {
		try {
			Statement st= conn.createStatement();
			st.executeUpdate(store);
			System.out.println("created stored procedured");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	String call="{call insertdisplay(?,?,?,?,?)}";
	public void callproducedures() {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your empid");
			int empid=sc.nextInt();
			sc.nextLine();
		    System.out.println("Enter your empname");
		    String empname=sc.nextLine();
		    System.out.println("Enter your empsalary");
		    double salary= sc.nextDouble();
		    sc.nextLine();
		    System.out.println("Enter your emp shift time");
		    String empshifttime=sc.nextLine();
		    System.out.println("Enter your emp password");
		    String emppassword=sc.nextLine();
		    
			CallableStatement cs=conn.prepareCall(call);
			cs.setInt(1, empid);
			cs.setString(2, empname);
			cs.setDouble(3, salary);
			cs.setString(4, empshifttime);
			cs.setString(5, emppassword);
	boolean result=cs.execute();
	if(result) {
	   ResultSet rs	=cs.getResultSet();
	   while(rs.next()) {
	   System.out.println("empid:"+rs.getInt("empid")+",emp name:"+rs.getString("empname")+",emp salary:"
	   +rs.getDouble("empsalary")+",emp shifttime:"+rs.getString("empshifttime")
	   +",emppassword:"+rs.getString("emppassword"));
	   }
	}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	
	
	public static void main(String[] args) {
		Procedures procedures= new Procedures();
		procedures.createprocedures();
		procedures.callproducedures();
	}

}
 
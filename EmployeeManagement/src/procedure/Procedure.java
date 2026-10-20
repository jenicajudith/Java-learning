package procedure;

import java.sql.Connection;

import java.sql.CallableStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Procedure {
	
	String store="create procedure insertdisplay(in customer_ids int,in cus_names varchar(50))"
			+"begin "+"insert into customer(customer_id,cus_name)"+"value(customer_ids,cus_names);"+
			"select * from customer;"+
			"end";
	Connection conn=Dbconnection.dbconnection();
	public void customers() {
		try {
			Statement st= conn.createStatement();
			st.executeUpdate(store);
			System.out.println("created stored procedured");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	String call="{call insertdisplay(?,?)}";
	public void display() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the customer id");
			int customer_id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the customer name");
			String cus_name=sc.nextLine();
			
			CallableStatement cs=conn.prepareCall(call);
			cs.setInt(1,customer_id);
			cs.setString(2,cus_name);
            boolean result=cs.execute();
			if(result) {
			   ResultSet rs	=cs.getResultSet();
			   while(rs.next()) {
			   System.out.println("Customer id : "+rs.getInt("customer_id")+",Customer name: "+rs.getString("cus_name"));
			   }
			   rs.close();
			}
			
			cs.close();
				}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Procedure p=new Procedure();
		p.customers();
		p.display();
	}

}

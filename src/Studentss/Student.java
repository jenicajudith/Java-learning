package Studentss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	
	String student_table="create table student_table("+"id int,"+"name varchar(50),"+"age int"+");";
	
	Connection conn=Dbconnection.dbconnection();
	Scanner sc=new Scanner(System.in);
	public void student_table() {
		try {
			Statement st= conn.createStatement();
			st.executeUpdate(student_table);
			System.out.println("table is created");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	
	String insert="insert into student_table(id,name,age)values(?,?,?)";
	public void insertion() {
		try {
					System.out.println("Enter your id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("enter your name");
					String name=sc.next();
					sc.nextLine();
					System.out.println("enter your age");
					int age=sc.nextInt();
					sc.nextLine();
					
					PreparedStatement ps=conn.prepareStatement(insert);
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, age);
					
					int row=ps.executeUpdate();
					if(row==1) {
						System.out.println("data stored successfully");
					}
					else {
						System.out.println("data not stored");
					}
					
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	String display="select * from Student_table";
	public void display() {
		try {
			Statement cs=conn.createStatement();
			ResultSet rs=cs.executeQuery(display);
			while(rs.next()) {
			System.out.println("ID:"+rs.getInt("id")+" "+"NAME:"+rs.getString("name")+" "+"AGE:"+rs.getInt("age"));
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	}



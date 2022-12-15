/*
 * program to retrive data from database with city name start with s
 * @Auther: K Mohan
 * @Date: 15dec22
 */

//Declaring the package
package com.question2;

//importing the package
import java.sql.*;

//declaring the class
public class Jdbc {

	//main method
	public static void main(String[] args) throws SQLException {
		
		//creating the variables
		String url = "jdbc:mysql://localhost:3306/author";
		String username = "root";
		String password = "Kmohan@180";
		
		//steblishing connection with the database
		Connection con= DriverManager.getConnection(url, username, password);
        
		//executing the statement
		Statement st= con.createStatement();
		
		//sql query to retrive data with city name start with s
		String Sql="Select * from autherdetails where city like'S%'";
		
		//result set to store the data
		ResultSet rs= st.executeQuery(Sql);
		
		//while loop to print the data
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		//closing the connection
		con.close();

	}
	//end of main method
}
//end of the class

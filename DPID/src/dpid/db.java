/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sudhakar
 */
public class db {
    

	private static Connection conn;
	
	public static Connection getConnection()
	{
		if(conn != null)
		{
			return conn;
		}
		else
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","admin");
                                System.out.println("Database Connected");
                                Statement st;
			}
			catch(ClassNotFoundException | SQLException e)
			{
			}	
		}
		return conn;
	}
}

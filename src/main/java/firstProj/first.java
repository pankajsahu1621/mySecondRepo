package firstProj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class first {

	public static void main(String[] args) throws Exception
	{
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/query";
		String user = "root";
		String psw = "Ranu1207";
		Connection con = DriverManager.getConnection(url,user,psw);
		if(con.isClosed())
		{
			System.out.println("con is closed");
			}
		else {
			System.out.println("con created");
		}
	
		
		
		Statement st = con.createStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		 
		 System.out.println("enter table name");
		 String tname = br.readLine();
		 String sql = "create table " + tname + "(eno int ,ename varchar(20) , esal int )";
		 System.out.println(sql);
		 st.executeUpdate(sql);
		 System.out.println("TABLE CREATED SUCCESSFULLY");
	
			
			
				
		 con.close();
		 
}
}
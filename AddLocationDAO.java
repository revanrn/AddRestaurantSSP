package com.example.demo.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;

	import org.springframework.stereotype.Repository;

	import com.example.demo.model.Location;


	@Repository

	public class LocationDAO {

		public static Connection connectToDB() {
			Connection connection = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return connection;

		}

		public void addUser(Location loc) { try 
		{
			 Connection con = connectToDB(); 
			 PreparedStatement stmt =  con.prepareStatement("insert into locationdetails values(?,?,?,?,?,?)");
			  stmt.setInt(1, loc.getRouteId());
			  stmt.setString(2, loc.getTrainNo());
			  stmt.setString(3, loc.getFrom());
			  stmt.setString(4, loc.getTo());
			  stmt.setString(5, loc.getFromTime());
			  stmt.setString(6, loc.getToTime());			  
			  // Step 4: Execute SQL Query 
			  int affectedRows = stmt.executeUpdate();
			  System.out.println("Affected rows in location table : " + affectedRows);
			  PreparedStatement stmt1 =  con.prepareStatement("insert into stops values(?,?,?,?)");
			  stmt1.setInt(1, loc.getStopId());
			  stmt1.setString(2, loc.getStop1());
			  stmt1.setString(3, loc.getTime1());
			  stmt1.setInt(4, loc.getRouteId());			  
			  // Step 4: Execute SQL Query 
			  int affectedRows1 = stmt1.executeUpdate();
			  PreparedStatement stmt2 =  con.prepareStatement("insert into stops values(?,?,?,?)");
			  stmt2.setInt(1, loc.getStopId1());
			  stmt2.setString(2, loc.getStop2());
			  stmt2.setString(3, loc.getTime2());
			  stmt2.setInt(4, loc.getRouteId());	  
			  // Step 4: Execute SQL Query 
			  int affectedRows2 = stmt2.executeUpdate();
			  PreparedStatement stmt3 =  con.prepareStatement("insert into stops values(?,?,?,?)");
			  stmt3.setInt(1, loc.getStopId2());
			  stmt3.setString(2, loc.getStop3());
			  stmt3.setString(3, loc.getTime3());
			  stmt3.setInt(4, loc.getRouteId());		  
			  // Step 4: Execute SQL Query 
			  int affectedRows3 = stmt3.executeUpdate();
			  System.out.println("Affected rows in Stops table" + affectedRows3);
			  
			  
			  
			  
			  
			  
			  // Step 5:Close Connection con.close();
			  
			  } catch (SQLException e) { // TODO Auto-generated catch block
			  e.printStackTrace(); }
			  }
			 
              

		
		
		
		
		
		
		
		
		
		
		
}

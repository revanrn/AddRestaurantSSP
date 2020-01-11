package com.example.demo.dao;

import java.sql.*;
import java.util.*;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Restaurant;

@Repository
public class RestaurantDAO {

	public Connection connectToDB() {
		Connection connection = null;
		try {// Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create Connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public void store(Restaurant rest) {
		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("insert into location values(?)");
			stmt.setInt(1, rest.getRouteId());
			int affected = stmt.executeUpdate();
			System.out.println("Affected rows in location table = " + affected);
			PreparedStatement stmt1 = con.prepareStatement("insert into restaurant values(?,?,?)");
			stmt1.setInt(1, rest.getRestaurantId());
			stmt1.setString(2, rest.getRestaurantName());
			stmt1.setInt(3, rest.getRouteId());
			int affected1 = stmt1.executeUpdate();
			System.out.println("Affected rows in Restaurant table = " + affected1);
			PreparedStatement stmt2 = con.prepareStatement("insert into food values(?,?,?,?,?)");
			stmt2.setInt(1, rest.getFoodId());
			stmt2.setString(2, rest.getFoodName());
			stmt2.setDouble(3, rest.getPrice());
			stmt2.setString(4, rest.getCategory());
			stmt2.setInt(5, rest.getRestaurantId());
			int affected2 = stmt2.executeUpdate();
			System.out.println("Affected rows in Food table = " + affected2);
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Restaurant> displayRestaurants() {
		List<Restaurant> usersList = new ArrayList<Restaurant>();
		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from location");
			ResultSet rs = stmt.executeQuery();
			PreparedStatement stmt1 = con.prepareStatement("select fooid,foodname,price,category from food");
			ResultSet rs1 = stmt1.executeQuery();
			PreparedStatement stmt2 = con.prepareStatement("select restaurantid,restaurantname from restaurant");
			ResultSet rs2 = stmt2.executeQuery();
			while (rs.next()) {
				Restaurant rest = new Restaurant();
				rest.setRouteId(rs.getInt(1));
				usersList.add(rest);
			}
			while (rs1.next()) {
				Restaurant rest = new Restaurant();
				rest.setFoodId(rs1.getInt(1));
				rest.setFoodName(rs1.getString(2));
				rest.setPrice(rs1.getDouble(3));
				rest.setCategory(rs1.getString(4));
				;
				usersList.add(rest);
			}
			while (rs2.next()) {
				Restaurant rest = new Restaurant();
				rest.setRestaurantId(rs2.getInt(1));
				rest.setRestaurantName(rs2.getString(2));
				usersList.add(rest);
			}
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usersList;

	}
	
	public boolean validate(String name,String password) {
		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from signin where userid= '" + name + "' and password='" + password + "'");
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				return true;
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
	public void addRestaurant(Restaurant rest) {
		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("insert into location values(?,?,?)");
			stmt.setInt(1, rest.getRouteId());
			stmt.setString(2, rest.getFrom());
			stmt.setString(3, rest.getTo());
			int affected = stmt.executeUpdate();
			System.out.println("Affected rows in location table = " + affected);
			
			PreparedStatement stmt4 = con.prepareStatement("select id1.NEXTVAL from dual");
			ResultSet rs4 = stmt4.executeQuery();
			rs4.next();
			int id5 = rs4.getInt(1);
			PreparedStatement stmt5 = con.prepareStatement("insert into stop values(?,?,?)");
			stmt5.setInt(1, id5);
			stmt5.setString(2,rest.getStopName());
			stmt5.setInt(3, rest.getRouteId());
			// Execute SQL query
			int affectedrows6 = stmt5.executeUpdate();
			System.out.println("Affected Rows in stop table = " + affectedrows6);
			
			
			
			PreparedStatement stmt1 = con.prepareStatement("insert into restaurant values(?,?,?)");
			stmt1.setInt(1, rest.getRestaurantId());
			stmt1.setString(2, rest.getRestaurantName());
			stmt1.setInt(3, id5);
			int affected1 = stmt1.executeUpdate();
			System.out.println("Affected rows in Restaurant table = " + affected1);
			
			
			PreparedStatement stmt3 = con.prepareStatement("select id.NEXTVAL from dual");
			ResultSet rs = stmt3.executeQuery();
			rs.next();
			int id = rs.getInt(1);
			PreparedStatement stmt2 = con.prepareStatement("insert into food values(?,?,?,?,?)");
			stmt2.setString(1, rest.getFoodName());
			stmt2.setDouble(2, rest.getPrice());
			stmt2.setString(3, rest.getCategory());
			stmt2.setInt(4, rest.getRestaurantId());
			stmt2.setInt(5, id);
			int affected2 = stmt2.executeUpdate();
			PreparedStatement stmt6 = con.prepareStatement("select id.NEXTVAL from dual");
			ResultSet rs2 = stmt6.executeQuery();
			rs2.next();
			int id2 = rs2.getInt(1);
			PreparedStatement stmt7 = con.prepareStatement("insert into food values(?,?,?,?,?)");
			stmt7.setString(1, rest.getFoodName1());
			stmt7.setDouble(2, rest.getPrice1());
			stmt7.setString(3, rest.getCategory());
			stmt7.setInt(4, rest.getRestaurantId());
			stmt7.setInt(5, id2);
			int affected3 = stmt7.executeUpdate();
			PreparedStatement stmt8 = con.prepareStatement("select id.NEXTVAL from dual");
			ResultSet rs3 = stmt8.executeQuery();
			rs3.next();
			int id3 = rs3.getInt(1);
			PreparedStatement stmt9 = con.prepareStatement("insert into food values(?,?,?,?,?)");
			stmt9.setString(1, rest.getFoodName2());
			stmt9.setDouble(2, rest.getPrice2());
			stmt9.setString(3, rest.getCategory());
			stmt9.setInt(4, rest.getRestaurantId());
			stmt9.setInt(5, id3);
			int affected4 = stmt9.executeUpdate();
			System.out.println("Affected rows in Food table = " + affected4);		
			
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

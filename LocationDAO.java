package com.deloitte.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.deloitte.demo.model.Location;
import com.deloitte.demo.model.Restaurant;

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

	public ArrayList<Location> displayUser() {
		ArrayList<Location> userList = new ArrayList<Location>();
		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from location");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Location user = new Location();

				user.setStopId(rs.getString(1));
				user.setFrom(rs.getString(2));
				user.setTo(rs.getString(3));
				user.setFromTime(rs.getString(4));
				user.setToTime(rs.getString(5));
				user.setStop1(rs.getString(6));
				/*
				 * user.setStop2(rs.getString(7)); user.setStop3(rs.getString(8));
				 * user.setTime1(rs.getString(9)); user.setTime2(rs.getString(10));
				 * user.setTime3(rs.getString(11)); user.setTrainNo(rs.getString(12));
				 */
				userList.add(user);
			}
			// Step 5:Close Connection
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;

	}

	public ArrayList<Location> display1(String from, String to) {

		Connection con = connectToDB();
		ArrayList<Location> userList = new ArrayList<Location>();
		String route = null;
		String stops = null;
		Location user = new Location();

		try {

			PreparedStatement stmt = con.prepareStatement("select * from location where fromloc='" + from + "' and toloc='" + to + "'");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				route = user.setRouteid(rs.getString(1));
				user.setFrom(rs.getString(2));
				user.setTo(rs.getString(3));
				user.setFromTime(rs.getString(4));
				user.setToTime(rs.getString(5));
				user.setTrainNo(rs.getString(6));

			}
			PreparedStatement stmt1 = con.prepareStatement("select * from restaurant where stopid='" + route + "'");
			ResultSet rs2 = stmt1.executeQuery();
			while (rs2.next()) {

				user.setRid(rs2.getString(1));
				user.setRname(rs2.getString(2));
				stops=user.setStopId(rs2.getString(3));
				
			}
			
			

			PreparedStatement stmt2 = con.prepareStatement("select stopname,stoptime from stops where stopid='" + route + "'");
			ResultSet rs3 = stmt2.executeQuery();
			while (rs3.next()) {
				user.setStop1(rs3.getString(2));				
				user.setTime1(rs3.getString(3));				
			}
PreparedStatement stmt3 = con.prepareStatement("select stopname,stoptime from stops where stopid='" + route + "'");			
			ResultSet rs4 = stmt3.executeQuery();
			while (rs4.next()) {
				user.setStop2(rs4.getString(2));				
				user.setTime2(rs4.getString(3));				
			}
PreparedStatement stmt4 = con.prepareStatement("select stopname,stoptime from stops where stopid='" + route + "'");			
			ResultSet rs5 = stmt4.executeQuery();
			while (rs5.next()) {
				user.setStop3(rs5.getString(2));				
				user.setTime3(rs5.getString(3));				
			}
			
			
			
			
			userList.add(user);

			// Step 5:Close Connection
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return userList;
	}

}

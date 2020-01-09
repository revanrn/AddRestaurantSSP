package com.deloitte.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.demo.dao.LocationDAO;
import com.deloitte.demo.model.Location;
//import com.example.demo.dao.LibraryDAO;


@Service

public class LocationServices {

	Location loc = new Location();
	@Autowired
	LocationDAO dao;

	public ArrayList<Location> display() {
		return dao.displayUser();
	}
	
	

	
	public ArrayList<Location> displayLoc(String from,String to)
	{
		return dao.display1(from, to);
		
	}

	
}







/*public ArrayList<Location> displayLoc()
{
	return dao.display();
	
}*/




/*
 * public void add(Location loc) { dao.addUser(loc); }
 * 
 * public String validation(String uname,String password) {
 * 
 * if(uname.equals("admin")&&password.equals("admin123")) return
 * "LOGIN SUCCESSFUL"; else return "INVALID USER"; }
 * 
 * 
 * public boolean validate(String uname,String password) {
 * 
 * if(uname.equals("admin")&&password.equals("admin123")) return true; else
 * return false; }
 */

/*
 * public boolean check(String routeId,String from,String
 * to,fromTime,toTime,stop1,stop2,stop3,time1,time2,time3,trainNo) {
 * 
 * }
 */

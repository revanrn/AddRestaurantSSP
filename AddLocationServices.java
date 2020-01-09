package com.example.demo.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LocationDAO;
import com.example.demo.model.Location;
//import com.example.demo.dao.LibraryDAO;

@Service

public class LocationServices {

	@Autowired
	LocationDAO dao;

	public void addUser(Location loc) {
		dao.addUser(loc);

	}

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
}

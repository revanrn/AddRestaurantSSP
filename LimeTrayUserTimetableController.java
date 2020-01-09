package com.deloitte.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.demo.model.Location;
import com.deloitte.demo.services.LocationServices;

@Controller
@ResponseBody
public class LimeTrayController {

	
	@Autowired
	LocationServices service;

	@GetMapping("/locationdetails")
	public ModelAndView myMethod() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("timetable2");

		return modelandview.addObject("user", service.display());
	}

	@GetMapping("/form")
	public ModelAndView resDisplay()
	{
		ModelAndView check = new ModelAndView();
		check.setViewName("timetable2");
		return check;
	}
	

/*	@GetMapping("/table")
	public ModelAndView table()
	{
		
		ModelAndView check = new ModelAndView();
	
			check.setViewName("location");
				return check.addObject("user", service.displayLoc());
		}
	*/
	
	
	@GetMapping("/loctable")
	public ModelAndView loctable(@RequestParam("from") String from , @RequestParam("to") String to)
	{
		
		ModelAndView check = new ModelAndView();
	
			check.setViewName("location");
				return check.addObject("user",service.displayLoc(from,to));
			
		}
		
		
		
		
	

	@PostMapping("/a")
	public String getmap() {
		return "hello";
	}

}












/*
 * @GetMapping("/msg") public ModelAndView myMethod() { ModelAndView
 * modelandview = new ModelAndView(); modelandview.setViewName("index"); //
 * modelandview.addObject("abc", service.g);
 * 
 * return modelandview; }
 * 
 * @GetMapping("/form") public ModelAndView username() { ModelAndView login =
 * new ModelAndView(); login.setViewName("login"); //
 * modelandview.addObject("abc", service.g);
 * 
 * return login; }
 * 
 * @GetMapping("/logincheck") public ModelAndView login(@RequestParam("uname")
 * String uname, @RequestParam("pwd") String pwd) {
 * 
 * System.out.println("name =" + uname); System.out.println("password =" + pwd);
 * 
 * ModelAndView check = new ModelAndView(); if (service.validate(uname, pwd)) {
 * ModelAndView login = new ModelAndView(); login.setViewName("welcome"); //
 * login.addObject(uname, uname); // modelandview.addObject("abc", service.g);
 * return login; } else { check.setViewName("login"); return
 * check.addObject("test", service.validation(uname, pwd)); } }
 * 
 * @PostMapping("/addloc")
 * 
 * public void addUser(@RequestBody Location loc) { // return
 * service.getMessage();
 * 
 * service.add(loc); }
 * 
 * 
 * 
 * 
 * /* @PostMapping("/loccheck") public ModelAndView login(Location loc) {
 * //@RequestBody
 * 
 * ModelAndView check = new ModelAndView();
 * 
 * if (service.validate(routeId,from,to,fromTime,toTime,stop1,stop2,stop3,time1,
 * time2,time3,trainNo)) {
 * 
 * login.setViewName("welcome"); // login.addObject(uname, uname); //
 * modelandview.addObject("abc", service.g); return login; } else {
 * check.setViewName("login"); return check.addObject("test",
 * service.validation(uname, pwd)); } }
 */

/*
 * @RequestMapping("/display") public String getUser() { return
 * "user details will be displayed"; }
 * 
 * @GetMapping("/adminlocation") public ModelAndView location() { ModelAndView
 * loc = new ModelAndView(); loc.setViewName("AdminLocation"); return loc; }
 */

/*
 * @GetMapping("/locvalid") public ModelAndView locvalid() { ModelAndView lValid
 * = new ModelAndView(); lValid.setViewName("AdminLocation"); //
 * modelandview.addObject("abc", service.g);
 * 
 * return lValid; }
 */

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Location;
import com.example.demo.services.LocationServices;

@Controller
@ResponseBody
public class Locationcontroller {

	@Autowired
	LocationServices service;

	@GetMapping("/addlocation")
	public ModelAndView addUser() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("locationdetails");
        return modelAndView; }

	@GetMapping("/addLocation1")
	public String getmap(Location loc) {
         service.addUser(loc);
         return "Location added successfully";
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
 * 
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

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Restaurant;
import com.example.demo.services.RestaurantService;

@Controller
@ResponseBody
public class RestaurantController {
	@Autowired
	RestaurantService service;

	@PostMapping("/addrestaurants1")
	public String addrestaurants1(@RequestBody Restaurant rest) {
		service.store(rest);
		return "Sucessfully inserted into the database";
	}

	@RequestMapping("/")
	public List<Restaurant> getMessage() {
		return service.displayRestaurants();
	}

	@GetMapping("/msg")
	public ModelAndView myMethod() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("DisplayRestaurant");
		modelAndView.addObject("test", service.displayRestaurants());
		return modelAndView;
	}

	@GetMapping("/form")
	public ModelAndView myMethod1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AddRestaurant");
		// modelAndView.addObject("test",service.displayRestaurants());
		return modelAndView;
	}

	@GetMapping("/addrestaurantsform")
	public ModelAndView addrestaurantsform() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("AddRestaurant");
		// modelAndView.addObject("msg",);
		return modelAndView;
	}

	@GetMapping("/addRestaurant")
	public String login1(Restaurant rest) {
		service.addRes(rest);
		return "Restaurant Added!";
	}

	@GetMapping("/login1")
	public ModelAndView login(@RequestParam("uname") String name, @RequestParam("password") String password) {
		System.out.println("UserName = " + name);
		System.out.println("UserName = " + password);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Login");
		boolean flag = service.validate(name, password);
		System.out.println(flag);
		modelAndView.addObject("m", flag);
		if (flag) {
			modelAndView.setViewName("welcome");
			modelAndView.addObject("msg", name);
		} else {
			modelAndView.setViewName("Login");
			modelAndView.addObject("test", "Invalid user!!");
		}
		return modelAndView;
	}

}

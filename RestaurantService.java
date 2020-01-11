package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RestaurantDAO;
import com.example.demo.model.Restaurant;

@Service
public class RestaurantService {

	@Autowired
	RestaurantDAO dao;

	public void store(Restaurant rest) {
		dao.store(rest);
	}

	public List<Restaurant> displayRestaurants() {
		return dao.displayRestaurants();
	}

	public boolean validate(String name, String password) {
		return dao.validate(name, password);
	}

	public void addRes(Restaurant rest) {
		dao.addRestaurant(rest);
	}
}

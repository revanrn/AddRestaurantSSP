package com.example.demo.model;

public class Restaurant {
	private int restaurantId;
	private String restaurantName;
	private int routeId;
	private int foodId;
	private String foodName;
	private double price;
	private String foodName1;
	private double price1;
	private String foodName2;
	private double price2;
	private String category;
	private int stopId;
	private String stopName;
	private String from;
	private String to;

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", routeId="
				+ routeId + ", foodId=" + foodId + ", foodName=" + foodName + ", price=" + price + ", foodName1="
				+ foodName1 + ", price1=" + price1 + ", foodName2=" + foodName2 + ", price2=" + price2 + ", category="
				+ category + ", stopId=" + stopId + ", stopName=" + stopName + ", from=" + from + ", to=" + to + "]";
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(Location loc) {
		this.routeId = loc.getRouteId();
	}

	public int getStopId() {
		return stopId;
	}

	public void setStopId(int stopId) {
		this.stopId = stopId;
	}

	public String getStopName() {
		return stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFoodName1() {
		return foodName1;
	}

	public void setFoodName1(String foodName1) {
		this.foodName1 = foodName1;
	}

	public double getPrice1() {
		return price1;
	}

	public void setPrice1(double price1) {
		this.price1 = price1;
	}

	public String getFoodName2() {
		return foodName2;
	}

	public void setFoodName2(String foodName2) {
		this.foodName2 = foodName2;
	}

	public double getPrice2() {
		return price2;
	}

	public void setPrice2(double price2) {
		this.price2 = price2;
	}
}

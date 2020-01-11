package com.example.demo.model;


public class Restaurant {
	
	private int restaurantId;
	private String restaurantName;
	private int routeId;
	private String category;
	private String from;
	private String to;
	private String foodName;
	private String foodName1;
	private String foodName2;
	private String stopName;
	private double price;
	private double price1;
	private double price2;
	private int foodId;
	
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", routeId="
				+ routeId + ", category=" + category + ", from=" + from + ", to=" + to + ", foodName=" + foodName
				+ ", foodName1=" + foodName1 + ", foodName2=" + foodName2 + ", stopName=" + stopName + ", price="
				+ price + ", price1=" + price1 + ", price2=" + price2 + ", foodId=" + foodId + "]";
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
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodName1() {
		return foodName1;
	}
	public void setFoodName1(String foodName1) {
		this.foodName1 = foodName1;
	}
	public String getFoodName2() {
		return foodName2;
	}
	public void setFoodName2(String foodName2) {
		this.foodName2 = foodName2;
	}
	public String getStopName() {
		return stopName;
	}
	public void setStopName(String stopName) {
		this.stopName = stopName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice1() {
		return price1;
	}
	public void setPrice1(double price1) {
		this.price1 = price1;
	}
	public double getPrice2() {
		return price2;
	}
	public void setPrice2(double price2) {
		this.price2 = price2;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
}

package com.snap.entity;

public class City {
	private int Id;
	private String cityName;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(int id, String cityName) {
		super();
		Id = id;
		this.cityName = cityName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

	
}

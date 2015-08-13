package com.snap.entity;

public class Theatre {

	private int id;
	private int cityId;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Theatre(int id, int cityId, String location) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.location = location;
	}
	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.snap.entity;

public class Booking {

	private int id;
	private String seatsType;
	private int seatsCount;
	private int showId;
	private int userId;
	public Booking(int id, String seatsType, int seatsCount, int showId,
			int userId) {
		super();
		this.id = id;
		this.seatsType = seatsType;
		this.seatsCount = seatsCount;
		this.showId = showId;
		this.userId = userId;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSeatsType() {
		return seatsType;
	}
	public void setSeatsType(String seatsType) {
		this.seatsType = seatsType;
	}
	public int getSeatsCount() {
		return seatsCount;
	}
	public void setSeatsCount(int seatsCount) {
		this.seatsCount = seatsCount;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}

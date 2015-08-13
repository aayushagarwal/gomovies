package com.snap.entity;
import java.util.Date;

public class Show {

	private int id;
	private String seatsType;
	private int seatsAvailable;
	private int seatTypeCost;
	private Date date;
	private int theatreId;
	private int movieId;
	public Show(int id, String seatsType, int seatsAvailable, int seatTypeCost,
			Date date, int theatreId, int movieId) {
		super();
		this.id = id;
		this.seatsType = seatsType;
		this.seatsAvailable = seatsAvailable;
		this.seatTypeCost = seatTypeCost;
		this.date = date;
		this.theatreId = theatreId;
		this.movieId = movieId;
	}
	public Show() {
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
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public int getSeatTypeCost() {
		return seatTypeCost;
	}
	public void setSeatTypeCost(int seatTypeCost) {
		this.seatTypeCost = seatTypeCost;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
 
}

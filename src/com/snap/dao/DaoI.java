package com.snap.dao;

import java.util.List;
import java.util.Set;

import com.snap.entity.*;

public interface DaoI {
	public List<Movie> getMovies();
	public int createMovie();
	public int addMovie(Movie movie);
	
	
	public List<City> getCities();
	public int createCity();
	public int addCity(City city);
	
	
	
	
	public List<Admin> getAdmins();
	public int createAdmin();
	public int addAdmin(Admin Admin);
	
	
	
	
	public List<Theatre> getTheatres();
	public int createTheatre();
	public int addTheatre(Theatre theatre);
	
	
	
	public List<User> getUsers();
	public int createUser();
	public int addUser(User user);
	
	public List<Booking> getBookings();
	public int createBooking();
	public int addMovie(Booking booking);
	
	public List<Show> getShows();
	public int createShow();
	public int addMovie(Show show);
	
}

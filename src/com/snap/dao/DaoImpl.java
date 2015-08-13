package com.snap.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;



import com.snap.entity.Admin;
import com.snap.entity.Booking;
import com.snap.entity.City;
import com.snap.entity.Movie;
import com.snap.entity.Show;
import com.snap.entity.Theatre;
import com.snap.entity.User;

public class DaoImpl implements DaoI{

	private JdbcTemplate jtemp;
	
	//setter for DI
	public void setJtemp(JdbcTemplate jtemp) {
		this.jtemp = jtemp;
	}
	
	@Override
	public List<Movie> getMovies() {
		String hql="select * from movies";
		List<Map<String,Object>> lst=jtemp.queryForList(hql);
		List<Movie> mov=new ArrayList<Movie>();
		for(Map<String,Object> m:lst){
			Movie movie=new Movie();
			int movieId=(int) m.get("movieId");
			movie.setMovieId(movieId);
			System.out.println(movieId);
			String movieTitle=(String) m.get("movieTitle");
			movie.setMovieTitle(movieTitle);
			System.out.println(movieTitle);
			mov.add(movie);
		}
		return mov;
	}


	@Override
	public int createMovie() {
		String sql="create table movies (movieId int not null auto_increment, movieTitle varchar(50) not null, releaseDate date not null, rating double, duration double, description varchar(100) not null, primary key(movieId))";
		jtemp.update(sql);
		return 1;
	}

	public int addMovie(Movie movie){
		String sql="insert into movies values(?,?,?,?,?,?)";
		Object[] params={movie.getMovieId(),movie.getMovieTitle(),movie.getReleaseDate(),movie.getRating(),movie.getDuration(),movie.getDescription()};
		jtemp.update(sql, params);
		return 1;
	}

	@Override
	public List<City> getCities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createCity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addCity(City city) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admin> getAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createAdmin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addAdmin(Admin Admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Theatre> getTheatres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createTheatre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createUser() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Booking> getBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createBooking() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addMovie(Booking booking) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Show> getShows() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createShow() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addMovie(Show show) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}

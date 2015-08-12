package com.snap.dao;

import java.util.List;
import java.util.Set;

import com.snap.entity.Movie;

public interface DaoI {
	public List<Movie> getMovies();
	public int createMovie();
	public int addMovie(Movie movie);
}

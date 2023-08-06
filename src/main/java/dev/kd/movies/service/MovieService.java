package dev.kd.movies.service;

import org.springframework.stereotype.Service;

import dev.kd.movies.bo.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {

	public List<Movie> findAllMovies();

	public Optional<Movie> findMovieByImdbId(String imdbId);

	public void addMovie(Movie movie);
}

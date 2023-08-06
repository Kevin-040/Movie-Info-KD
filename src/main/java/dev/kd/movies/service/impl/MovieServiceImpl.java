package dev.kd.movies.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.kd.movies.bo.Movie;
import dev.kd.movies.repo.MovieRepository;
import dev.kd.movies.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repository;

	@Override
	public List<Movie> findAllMovies() {
		return repository.findAll();
	}

	@Override

	public Optional<Movie> findMovieByImdbId(String imdbId) {
		return repository.findMovieByImdbId(imdbId);
	}

	@Override
	public void addMovie(Movie movie) {
		this.repository.save(movie);
	}

}

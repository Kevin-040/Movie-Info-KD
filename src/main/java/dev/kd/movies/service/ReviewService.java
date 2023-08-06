package dev.kd.movies.service;


import dev.kd.movies.bo.Review;

public interface ReviewService {

	public Review createReview(String reviewBody, String imdbId);

}

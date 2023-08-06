package dev.kd.movies.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.kd.movies.bo.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}

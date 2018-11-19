package airbnb.repo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import airbnb.domain.base.Review;

public interface IReviewCommandRepo extends CrudRepository<Review, UUID>{

}

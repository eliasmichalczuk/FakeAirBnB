package airbnb.repo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import airbnb.domain.base.Review;

@Repository
@Transactional
public interface IReviewCommandRepo extends CrudRepository<Review, UUID>{

}

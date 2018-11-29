package airbnb.repo;

import java.awt.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import airbnb.domain.base.Review;

@Repository
@Transactional
public interface IReviewQueryRepo extends CrudRepository <Review, UUID>{

	public List findAllByRoomId(long roomId);

	public void save(java.util.Optional<Review> review);
}

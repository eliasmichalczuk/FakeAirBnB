package airbnb.repo;

import java.awt.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import airbnb.domain.base.Review;

public interface IReviewQueryRepo extends CrudRepository <Review, UUID>{

	public List findAllByRoomId(long roomId);
	public Review findOne(String review);
	
}

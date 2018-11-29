package airbnb.controller.query;

import java.awt.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.Review;
import airbnb.repo.IBaseQueryRepo;
import airbnb.repo.IReviewQueryRepo;

@RestController
@RequestMapping("api/review")
public class ReviewQueryController {

	@Autowired
	private IReviewQueryRepo repo;
	public ReviewQueryController(IReviewQueryRepo repo, IBaseQueryRepo<Review, UUID> baseRepo) {
		super();
		this.repo = repo;
		this.baseRepo = baseRepo;
	}

	private IBaseQueryRepo<Review, UUID> baseRepo;

	
	@RequestMapping(value="/{roomId}", method=RequestMethod.GET)
	public List findReviewByRoomId(@PathVariable("roomId") long roomId){
		List reviewList = repo.findAllByRoomId(roomId);
		return reviewList;
	}
	
	@GetMapping
	public java.util.Optional<Review> findReviewById(@PathVariable UUID reviewId) {
		return baseRepo.findById(reviewId);
	}
	
}

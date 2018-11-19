package airbnb.controller.query;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/review")
public class ReviewQueryController {

	/*@Autowired
	private IReviewQueryRepo<Review, String> repo;
	@Autowired
	private IBaseQueryRepo<Review, UUID> baseRepo;

	
	@RequestMapping(value="/{roomId}", method=RequestMethod.GET)
	public List findReviewByRoomId(@PathVariable("roomId") long roomId){
		List reviewList = repo.findAllByRoomId(roomId);
		return reviewList;
	}*/
	
	/*@GetMapping("/{id}")
	@ResponseBody
	public void (@PathVariable("review") Review review) {
		return baseRepo.findById(review.getId());
	}*/
	
}

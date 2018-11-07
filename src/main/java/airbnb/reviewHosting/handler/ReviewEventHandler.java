package airbnb.reviewHosting.handler;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;

import airbnb.domain.base.Review;
import airbnb.repo.ReviewCommandRepo;
import airbnb.reviewHosting.events.RoomReviewedEvent;

public class ReviewEventHandler {

	@Autowired
	private ReviewCommandRepo reviewRepo;
	
	@EventHandler
	public void on(RoomReviewedEvent event) {
		reviewRepo.save(new Review(event.Id, event.Description))
	}
}

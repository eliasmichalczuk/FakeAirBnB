package airbnb.reviewHosting.handler;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;

import airbnb.domain.base.Review;
import airbnb.repo.BaseCommandRepo;
import airbnb.reviewHosting.events.RoomReviewedEvent;

public class ReviewEventHandler {

	@Autowired
	private BaseCommandRepo<Review, ?> baseRepo;
	
	@EventHandler
	public void on(RoomReviewedEvent event) {
		baseRepo.save(new Review(event.id, event.user, event.room, event.description));
	}
}

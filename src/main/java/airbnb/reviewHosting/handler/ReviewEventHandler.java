package airbnb.reviewHosting.handler;

import java.util.ArrayList;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;

import airbnb.domain.base.Review;
import airbnb.repo.BaseCommandRepo;
import airbnb.reviewHosting.events.RoomReviewedEvent;

public class ReviewEventHandler {

	@Autowired
	private BaseCommandRepo baseRepo;
	
	@EventHandler
	public void on(RoomReviewedEvent event) {
		boolean list = new ArrayList<Integer>().add(new Integer(event.stars));
		baseRepo.save(new Review(event.id, event.user, event.room, event.description, ));
	}
}

package airbnb.reviewHosting.handler;

import java.util.UUID;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Component;

import airbnb.domain.base.Review;
import airbnb.repo.IReviewCommandRepo;
import airbnb.repo.IReviewQueryRepo;
import airbnb.reviewHosting.events.ReviewCreatedEvent;
import airbnb.reviewHosting.events.ReviewDescriptionModifiedEvent;
import airbnb.reviewHosting.events.ReviewStarsModifiedEvent;

@Component
public class ReviewEventHandler {
	
	private IReviewCommandRepo reviewCommandRepo;
	private IReviewQueryRepo reviewQueryRepo;
	
	@Autowired
	public ReviewEventHandler(IReviewCommandRepo reviewCommandRepo, IReviewQueryRepo reviewQueryRepo) {
		this.reviewCommandRepo = reviewCommandRepo;
		this.reviewQueryRepo = reviewQueryRepo;
	}
	
	
	/*@EventSourcingHandler
	protected void on(RoomReviewedEvent event) {
		baseRepo.save(new Review(event.id, event.user, event.room, event.description));
		AggregateLifecycle.markDeleted();
	}*/
	
	@EventHandler
	public void on(ReviewCreatedEvent event) {
		reviewCommandRepo.save(new Review(UUID.randomUUID(),event.getUser(), event.getRoom(), event.getDescription(), event.getStars()));
	}
	
	@EventHandler
	public void on(ReviewStarsModifiedEvent event) {
		Review review = reviewQueryRepo.findOne(event.getReview());
		review.setStars(event.getStars());
		reviewCommandRepo.save(review);
	}
	
	@EventHandler
	public void on(ReviewDescriptionModifiedEvent event) throws NotFoundException {
		Review review = reviewQueryRepo.findById(event.getReview())
				.orElseThrow(() -> new NotFoundException());
		review.setDescription(event.getDescription());
		reviewCommandRepo.save(review);
	}
}

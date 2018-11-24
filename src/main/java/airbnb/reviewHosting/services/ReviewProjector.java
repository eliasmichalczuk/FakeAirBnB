package airbnb.reviewHosting.services;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;
import airbnb.domain.base.Review;
import airbnb.repo.IReviewCommandRepo;
import airbnb.repo.IReviewQueryRepo;
import airbnb.reviewHosting.events.ReviewCreatedEvent;
import airbnb.reviewHosting.events.ReviewDescriptionModifiedEvent;
import airbnb.reviewHosting.events.ReviewStarsModifiedEvent;

@Service
public class ReviewProjector {

	private final IReviewCommandRepo reviewCommandRepo;
	private final IReviewQueryRepo reviewQueryRepo;

	@Autowired
	public ReviewProjector(IReviewCommandRepo reviewCommandRepo, IReviewQueryRepo reviewQueryRepo) {
		this.reviewCommandRepo = reviewCommandRepo;
		this.reviewQueryRepo = reviewQueryRepo;
	}
	@EventHandler
	public void on(ReviewStarsModifiedEvent event) {
		java.util.Optional<Review> review = reviewQueryRepo.findById(event.getReviewId());
		review.orElse(null).setStars(event.getStars());
		reviewQueryRepo.save(review);
	}
	
	@EventHandler
	protected void on(ReviewDescriptionModifiedEvent event) throws NotFoundException {
		Review review = reviewQueryRepo.findById(event.getReviewId())
				.orElseThrow(() -> new NotFoundException());
		review.setDescription(event.getDescription());
		reviewCommandRepo.save(review);
	}
	@EventHandler
	protected void on(ReviewCreatedEvent event) {
		Review review = Review.builder()
				.id(event.getReviewId())
				.description(event.getDescription())
				.Stars(event.getStars())
				.build();
		reviewCommandRepo.save(review);
	}
	
	
}

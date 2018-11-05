package airbnb.reviewHosting.aggregates;

import java.io.Serializable;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;

import airbnb.domain.base.Review;
import airbnb.reviewHosting.commands.ReviewCommand;
import airbnb.reviewHosting.events.RoomReviewedEvent;

public class ReviewAggregate extends Review implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@CommandHandler
	protected void on(ReviewCommand command) {
		AggregateLifecycle.apply(new RoomReviewedEvent(super.getId(), super.getUser(),
				super.getRoom(), super.getDescription(), super.getStars()));
	}
	
	@EventSourcingHandler
	protected void on(RoomReviewedEvent event) {
		AggregateLifecycle.markDeleted();
	}
	
}

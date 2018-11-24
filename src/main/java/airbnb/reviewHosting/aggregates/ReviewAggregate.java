package airbnb.reviewHosting.aggregates;

import java.io.Serializable;
import java.util.UUID;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import airbnb.reviewHosting.commands.CreateReviewCommand;
import airbnb.reviewHosting.commands.ModifyReviewDescriptionCommand;
import airbnb.reviewHosting.commands.ModifyReviewStarsCommand;
import airbnb.reviewHosting.events.ReviewCreatedEvent;
import airbnb.reviewHosting.events.ReviewDescriptionModifiedEvent;
import airbnb.reviewHosting.events.ReviewStarsModifiedEvent;

@Aggregate
public class ReviewAggregate  implements Serializable{

	@AggregateIdentifier
	private UUID Id = UUID.randomUUID();
	private String description;
	private int stars;
	private UUID userId;
	private UUID roomId;
	
	private static final long serialVersionUID = 1L;
	
	/*@CommandHandler
	protected void on(ReviewCommand command) {
		AggregateLifecycle.apply(new RoomReviewedEvent(super.getId(), super.getUser(),
				super.getRoom(), super.getDescription()));
	}*/
	
	ReviewAggregate(){
	}
	
	@CommandHandler
	public ReviewAggregate(CreateReviewCommand command) {
		AggregateLifecycle.apply(new ReviewCreatedEvent(command.getRoomId(), command.getUserId(), command.getRoomId(), 
		command.getDescription(), command.getStars()));
	}
	
	@CommandHandler
	void on(ModifyReviewDescriptionCommand command) {
		AggregateLifecycle.apply(new ReviewDescriptionModifiedEvent(command.getReviewId(),command.getDescription()));
	}
	
	@CommandHandler
	void on(ModifyReviewStarsCommand command) {
		AggregateLifecycle.apply(new ReviewStarsModifiedEvent(command.getReviewId(),command.getStars()));
	}
	
	@EventSourcingHandler
	protected void on(ReviewCreatedEvent event) {
		this.userId = event.userId;
		this.roomId = event.roomId;
		this.description = event.description;
		this.stars = event.stars;
	}
	
	@EventSourcingHandler
	protected void on(ReviewDescriptionModifiedEvent event) {
		this.description = event.getDescription();
	}
	
	@EventSourcingHandler
	protected void on(ReviewStarsModifiedEvent event) {
		this.stars = event.getStars();
	}
}

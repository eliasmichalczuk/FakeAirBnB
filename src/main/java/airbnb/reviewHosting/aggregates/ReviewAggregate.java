package airbnb.reviewHosting.aggregates;

import java.io.Serializable;
import java.util.UUID;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
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
	public final UUID Id = UUID.randomUUID();

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
		AggregateLifecycle.apply(new ReviewCreatedEvent(command.getUser(), command.getRoom(), 
		command.getDescription(), command.getStars()));
	}
	
	@CommandHandler
	void on(ModifyReviewDescriptionCommand command) {
		AggregateLifecycle.apply(new ReviewDescriptionModifiedEvent(command.getId(),command.getDescription()));
	}
	
	@CommandHandler
	void on(ModifyReviewStarsCommand command) {
		AggregateLifecycle.apply(new ReviewStarsModifiedEvent(command.getId(),command.getStars()));
	}
	
}

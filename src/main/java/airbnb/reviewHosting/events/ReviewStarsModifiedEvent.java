package airbnb.reviewHosting.events;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ReviewStarsModifiedEvent {

	@TargetAggregateIdentifier
	private final String review;
	private final int stars;
}

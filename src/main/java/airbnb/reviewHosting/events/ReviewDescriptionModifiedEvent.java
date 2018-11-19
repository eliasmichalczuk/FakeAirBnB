package airbnb.reviewHosting.events;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ReviewDescriptionModifiedEvent {

	@TargetAggregateIdentifier
	private final UUID review;
	private final String description;
}

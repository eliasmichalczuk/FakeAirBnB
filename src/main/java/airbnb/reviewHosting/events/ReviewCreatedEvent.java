package airbnb.reviewHosting.events;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ReviewCreatedEvent {

	@TargetAggregateIdentifier
	private final UUID reviewId;
	public final UUID userId;
	public final UUID roomId;
	public final String description;
	public final int stars;
}

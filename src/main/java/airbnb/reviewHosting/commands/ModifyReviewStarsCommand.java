package airbnb.reviewHosting.commands;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ModifyReviewStarsCommand {
	
	@TargetAggregateIdentifier
	private final UUID reviewId;
	private final int stars;
}

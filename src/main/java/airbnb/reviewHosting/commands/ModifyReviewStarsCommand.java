package airbnb.reviewHosting.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ModifyReviewStarsCommand {
	
	@TargetAggregateIdentifier
	private final String id;
	private final int stars;
}

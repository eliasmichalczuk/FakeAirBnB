package airbnb.reviewHosting.commands;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ModifyReviewDescriptionCommand {

	@TargetAggregateIdentifier
	private final UUID reviewId;
	private final String description;
}

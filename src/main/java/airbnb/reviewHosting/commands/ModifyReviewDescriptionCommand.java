package airbnb.reviewHosting.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class ModifyReviewDescriptionCommand {

	@TargetAggregateIdentifier
	private final String id;
	private final String description;
}

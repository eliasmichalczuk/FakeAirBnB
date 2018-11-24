package airbnb.reviewHosting.commands;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class CreateReviewCommand {

	@TargetAggregateIdentifier
	public final UUID reviewId;
	public final UUID userId;	
	public final UUID roomId;
	public final String description;
	public final int stars;
}

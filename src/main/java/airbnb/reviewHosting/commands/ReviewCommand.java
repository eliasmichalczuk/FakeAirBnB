package airbnb.reviewHosting.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ReviewCommand {

	@TargetAggregateIdentifier
	public final long Id;
	public final String description;
	public final int userId;
	public final int star;
	public final int roomId;	
}

package airbnb.reviewHosting.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import airbnb.domain.base.Room;
import airbnb.domain.base.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ReviewCommand {

	@TargetAggregateIdentifier
	public final int id;
	public final User user;
	public final Room room;
	public final String description;
	public final int stars;	
}

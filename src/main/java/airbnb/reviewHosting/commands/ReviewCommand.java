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
	public final long Id;
	public final User User;
	public final Room Room;
	private final String Description;
	private final int Stars;
	
}

package airbnb.reviewHosting.events;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import airbnb.domain.base.Room;
import airbnb.domain.base.User;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class RoomReviewedEvent {

	@TargetAggregateIdentifier
	public final long id;
	public final User user;
	public final Room room;
	public final String description;
	public final int stars;
}

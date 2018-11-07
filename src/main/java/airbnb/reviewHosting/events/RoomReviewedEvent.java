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
	public final long Id;
	public final int userId;
	public final int roomId;
	public final String description;
	public final int stars;
}

package airbnb.reviewHosting.events;

import airbnb.domain.base.Room;
import airbnb.domain.base.User;
import lombok.Value;

@Value
public class ReviewCreatedEvent {

	public final User user;
	public final Room room;
	public final String description;
	public final int stars;
}

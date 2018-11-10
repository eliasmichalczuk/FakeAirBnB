package airbnb.reviewHosting;

import airbnb.domain.base.Room;
import airbnb.domain.base.User;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReviewDto {

	public final int id;
	public final User user;
	public final Room room;
	public final String description;
	public final int stars;
}

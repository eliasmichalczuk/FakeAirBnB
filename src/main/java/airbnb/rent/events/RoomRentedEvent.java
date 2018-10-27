package airbnb.rent.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoomRentedEvent {

	public long Id;
	public long UserId;
	public long RoomId;
}

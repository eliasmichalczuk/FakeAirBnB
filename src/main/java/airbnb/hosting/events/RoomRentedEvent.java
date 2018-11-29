package airbnb.hosting.events;

import java.util.UUID;

import airbnb.hosting.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoomRentedEvent {

	public final UUID Id;
	public final UUID roomId;
	public final UUID userId;
	public final UUID ownerId;
	public final Enum status = Status.RENTED;
}

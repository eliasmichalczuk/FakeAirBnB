package airbnb.hosting.events;

import java.util.UUID;

import airbnb.hosting.enums.Status;
import lombok.Value;

@Value
public class HostingStartedEvent {

	public final UUID id;
	public final Enum status = Status.STARTED; 
}

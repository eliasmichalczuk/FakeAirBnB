package airbnb.hosting.events;

import airbnb.hosting.dto.HostingStartedDto;
import lombok.Value;

@Value
public class HostingStartedEvent {

	public final HostingStartedDto dto;
}

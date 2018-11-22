package airbnb.hosting.dto;

import java.util.UUID;

import lombok.Value;

@Value
public class HostingStartedDto {

	public final UUID roomId;
	public final UUID userId;
}

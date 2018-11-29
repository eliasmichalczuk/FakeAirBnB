package airbnb.hosting.commands;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import airbnb.hosting.dto.HostingStartedDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RentRoomCommand {

	@TargetAggregateIdentifier
	public final UUID id;
	public final UUID roomId;
	public final UUID ownerId;
	public final UUID userId;
	public final Enum RENTED;
	
}

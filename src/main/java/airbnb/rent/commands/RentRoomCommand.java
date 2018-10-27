package airbnb.rent.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RentRoomCommand {

	@TargetAggregateIdentifier
	private long Id;
	private long UserId;
	private long RoomId;
	
}

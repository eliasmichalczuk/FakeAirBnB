package airbnb.hosting.aggregates;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;

import airbnb.hosting.commands.RentRoomCommand;
import airbnb.hosting.events.RoomRentedEvent;

public class RentAggregate {

	@AggregateIdentifier
	private long id;
	
	/*@CommandHandler
	public RentAggregate(RentRoomCommand command) {
		apply(new RoomRentedEvent(command.getId(), command.get))
	}*/
}

package airbnb.rent.aggregates;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import airbnb.rent.commands.RentRoomCommand;

public class RentAggregate {

	@AggregateIdentifier
	private long id;
	
	@CommandHandler
	public RentAggregate(RentRoomCommand command) {
		apply(new RoomRentedEvent(command.getId(), command.get))
	}
}

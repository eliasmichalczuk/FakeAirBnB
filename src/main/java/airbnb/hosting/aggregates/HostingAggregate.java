package airbnb.hosting.aggregates;

import org.axonframework.commandhandling.model.AggregateIdentifier;

public class RentAggregate {

	@AggregateIdentifier
	private long id;
	
	/*@CommandHandler
	public RentAggregate(RentRoomCommand command) {
		apply(new RoomRentedEvent(command.getId(), command.get))
	}*/
}

package airbnb.hosting.aggregates;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import airbnb.hosting.commands.StartHostingCommand;
import airbnb.hosting.events.HostingStartedEvent;

@Aggregate
public class HostingAggregate {

	@AggregateIdentifier
	private long id;
	
	private static final long serialVersionUID = 1L;
	
	HostingAggregate(){
	}
	
	/*@CommandHandler
	public RentAggregate(RentRoomCommand command) {
		apply(new RoomRentedEvent(command.getId(), command.get))
	}*/
	
	public HostingAggregate(StartHostingCommand command) {
		AggregateLifecycle.apply(new HostingStartedEvent(command.dto));
	}
	//hostingInprogresCommand
	//FinishHostingCommand
}

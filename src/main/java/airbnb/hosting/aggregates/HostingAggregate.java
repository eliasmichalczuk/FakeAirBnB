package airbnb.hosting.aggregates;

import java.util.UUID;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import airbnb.hosting.commands.EndHostingCommand;
import airbnb.hosting.commands.RentRoomCommand;
import airbnb.hosting.commands.StartHostingCommand;
import airbnb.hosting.events.HostingEndedEvent;
import airbnb.hosting.events.HostingStartedEvent;
import airbnb.hosting.events.RoomRentedEvent;


@Aggregate
public class HostingAggregate {

	@AggregateIdentifier
	private UUID id;
	private Enum status;
	private UUID roomId;
	private UUID userId;
	
	private static final long serialVersionUID = 1L;
	
	HostingAggregate(){
	}
	/*@CommandHandler
	public RentAggregate(RentRoomCommand command) {
		apply(new RoomRentedEvent(command.getId(), command.get))
	}*/
	
	@CommandHandler
	public HostingAggregate(StartHostingCommand command) {
		AggregateLifecycle.apply(new HostingStartedEvent(command.Id));
	}
	
	@CommandHandler
	void on(RentRoomCommand command) {
		AggregateLifecycle.apply(new RoomRentedEvent(command.id, command.roomId, command.userId, command.ownerId));
	}
	
	@CommandHandler
	void on(EndHostingCommand command) {
		AggregateLifecycle.apply(new HostingEndedEvent(command.Id));
	}
	
	@EventSourcingHandler
	protected void on(HostingStartedEvent event) {
		this.id = event.id;
		this.status = event.status;
	}
	
	@EventSourcingHandler
	protected void on(RoomRentedEvent event) {
		this.id = event.Id;
		this.status = event.status;
	}
	
	@EventSourcingHandler
	protected void on(HostingEndedEvent event) {
		this.status = event.status;
	}
	
}

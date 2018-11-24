package airbnb.hosting.services;

import java.util.UUID;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airbnb.domain.base.Hosting;
import airbnb.hosting.events.HostingEndedEvent;
import airbnb.hosting.events.HostingStartedEvent;
import airbnb.hosting.events.RoomRentedEvent;
import airbnb.repo.IBaseCommandRepo;
import airbnb.repo.IBaseQueryRepo;

@Service
public class HostingProjector {

	private final IBaseCommandRepo<Hosting, UUID> commandRepo;
	private final IBaseQueryRepo<Hosting, UUID> queryRepo;
	
	@Autowired
	public HostingProjector(IBaseCommandRepo<Hosting, UUID> commandRepo, IBaseQueryRepo<Hosting, UUID> queryRepo) {
		this.commandRepo = commandRepo;
		this.queryRepo = queryRepo;
	}
	
	@EventHandler
	protected void on(RoomRentedEvent event) {
		Hosting hosting = Hosting.builder()
				.id(event.getId())
				.roomId(event.roomId)
				.userId(event.userId)
				.status(event.RENTED)
				.build();
		commandRepo.save(hosting);
	}
	
	@EventHandler
	protected void on(HostingStartedEvent event) {
	Hosting hosting = queryRepo.getOne(event.id);
	Hosting nHosting = Hosting.builder()
					.roomId(hosting.getRoomId())
					.userId(hosting.getUserId())
					.status(event.STARTED)
					.build();
	commandRepo.save(hosting);
	}
	
	
	
	@EventHandler
	protected void on(HostingEndedEvent event) {
		Hosting hosting = queryRepo.getOne(event.id);
		Hosting nHosting = Hosting.builder()
						.roomId(hosting.getRoomId())
						.userId(hosting.getUserId())
						.status(event.ENDED)
						.build();
		commandRepo.save(hosting);
	}
}

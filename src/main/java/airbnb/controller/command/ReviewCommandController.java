package airbnb.controller.command;

import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.Room;
import airbnb.domain.base.User;
import airbnb.repo.ReviewCommandRepo;
import airbnb.reviewHosting.ReviewDto;
import airbnb.reviewHosting.commands.ReviewCommand;

@RestController
@RequestMapping("api/review/")
public class ReviewCommandController {

	@Autowired
	private CommandGateway commandGateway;
	
	@PostMapping
	public CompletableFuture<String> create(@RequestBody ReviewDto dto){
		return commandGateway.send(new ReviewCommand(dto.id, dto.user, dto.room, dto.description, dto.stars
				));
	}
}


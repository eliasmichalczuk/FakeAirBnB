package airbnb.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.Room;
import airbnb.repo.IRoomRepo;

@RestController
@RequestMapping("api/room")
public class RoomCommandController {
	
	@Autowired
	private IRoomRepo roomRepo;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String postQuarto(@RequestBody Room quarto) {
		roomRepo.save(quarto);
		return null;
	}
}

package airbnb.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import airbnb.rent.domain.entity.Room;
import airbnb.repo.RoomRepo;

@RestController
@RequestMapping("/quarto/")
public class QuartoCommandController {

	private RoomRepo roomRepo;
	
	@Autowired
	public QuartoCommandController(RoomRepo roomRepo) {
		this.roomRepo = roomRepo;
	}
	
	@RequestMapping(value="/quarto/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String postQuarto(@RequestBody Room quarto) {
		roomRepo.save(quarto);
		return null;
	}
}

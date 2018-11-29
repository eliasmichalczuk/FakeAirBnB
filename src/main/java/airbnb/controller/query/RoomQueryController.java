package airbnb.controller.query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.Room;
import airbnb.repo.IRoomRepo;

@Component
@RestController
@RequestMapping("api/room")
public class RoomQueryController {

	private IRoomRepo roomRepo;
	
	@Autowired
	public RoomQueryController(IRoomRepo roomRepo) {
		super();
		this.roomRepo = roomRepo;
	}

	@RequestMapping(value="/{}", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Room> findAll() {
		List<Room> listaQ = roomRepo.findAll();
		return listaQ;
	}
	
	@RequestMapping(value="/{street}", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Room> findQuartoByStreet(@PathVariable("street") String street, Model model) {
		List<Room> listaQ = roomRepo.findByStreet(street);
		if 	(listaQ != null)
			model.addAttribute("rooms",listaQ);
		return listaQ;
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Optional<Room> findRoomById(@PathVariable("id") UUID id) {
		return roomRepo.findById(id);
	}
}

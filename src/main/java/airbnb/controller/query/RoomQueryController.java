package airbnb.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import airbnb.domain.base.Room;
import airbnb.repo.RoomRepo;

@Controller
@RequestMapping("/quarto/")
public class RoomQueryController {

	private RoomRepo roomRepo;
	
	@Autowired
	public RoomQueryController(RoomRepo roomRepo) {
		this.roomRepo = roomRepo;
	}
	
	@RequestMapping(value="/quarto/{}", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Room> findAll(@PathVariable("quarto") String quarto, Model model) {
		List<Room> listaQ = roomRepo.findAll();
		return listaQ;
	}
	
	@RequestMapping(value="/quarto/{rua}", method = RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Room> findQuartoByRua(@PathVariable("quarto") String quarto, Model model) {
		List<Room> listaQ = roomRepo.findByStreet(quarto);
		if 	(listaQ != null)
			model.addAttribute("quartos",listaQ);
		return listaQ;
	}
	
	@GetMapping("/quarto/{id}")
	@ResponseBody
	public Room findQuartoById(@PathVariable("quarto") long id) {
		return roomRepo.findById(id);
	}
}

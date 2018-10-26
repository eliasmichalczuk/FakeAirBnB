package udesc.poo.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import udesc.poo.rent.domain.entity.Quarto;
import udesc.poo.repo.QuartoRepo;

@RestController
@RequestMapping("/quarto/")
public class QuartoCommandController {

	private QuartoRepo quartoRepo;
	
	@Autowired
	public QuartoCommandController(QuartoRepo quartoRepo) {
		this.quartoRepo = quartoRepo;
	}
	
	@RequestMapping(value="/quarto/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public String postQuarto(@RequestBody Quarto quarto) {
		quartoRepo.save(quarto);
		return null;
	}
}

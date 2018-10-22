package udesc.poo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import udesc.poo.repo.QuartoRepo;

@Controller
@RequestMapping("/quarto/")
public class QuartoController {

	private QuartoRepo quartoRepo;
	
	@Autowired
	public QuartoController(QuartoRepo quartoRepo) {
		this.quartoRepo = quartoRepo;
	}
	
	@RequestMapping(value="")
}

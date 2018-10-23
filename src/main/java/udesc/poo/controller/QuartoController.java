package udesc.poo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import udesc.poo.entity.Quarto;
import udesc.poo.repo.QuartoRepo;

@Controller
@RequestMapping("/quarto/")
public class QuartoController {

	private QuartoRepo quartoRepo;
	
	@Autowired
	public QuartoController(QuartoRepo quartoRepo) {
		this.quartoRepo = quartoRepo;
	}
	
	@RequestMapping(value="/{}", method = RequestMethod.GET)
	public List<Quarto> listaQuartos(@PathVariable("quarto") String quarto, Model model) {
		List<Quarto> listaQ = quartoRepo.findAll();
		return listaQ;
	}
	
	@RequestMapping(value="/{rua}", method = RequestMethod.GET)
	public List<Quarto> listaRuas(@PathVariable("quarto") String quarto, Model model) {
		List<Quarto> listaQ = quartoRepo.findByRua(quarto);
		if 	(listaQ != null)
			model.addAttribute("quartos",listaQ);
		return listaQ;
	}
	
	@RequestMapping(value="/{quarto}", method = RequestMethod.POST)
	public String adicionaQuarto(@PathVariable("quarto") Quarto quarto) {
		quartoRepo.save(quarto);
		return null;
	}
}

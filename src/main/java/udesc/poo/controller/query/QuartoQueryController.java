package udesc.poo.controller.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import udesc.poo.domain.entity.Quarto;
import udesc.poo.repo.QuartoRepo;

@Controller
@RequestMapping("/quarto/")
public class QuartoQueryController {

	private QuartoRepo quartoRepo;
	
	@Autowired
	public QuartoQueryController(QuartoRepo quartoRepo) {
		this.quartoRepo = quartoRepo;
	}
	
	@RequestMapping(value="/quarto/{}", method = RequestMethod.GET)
	@ResponseBody
	public List<Quarto> findAll(@PathVariable("quarto") String quarto, Model model) {
		List<Quarto> listaQ = quartoRepo.findAll();
		return listaQ;
	}
	
	@RequestMapping(value="/quarto/{rua}", method = RequestMethod.GET)
	@ResponseBody
	public List<Quarto> findQuartoByRua(@PathVariable("quarto") String quarto, Model model) {
		List<Quarto> listaQ = quartoRepo.findByRua(quarto);
		if 	(listaQ != null)
			model.addAttribute("quartos",listaQ);
		return listaQ;
	}
	
	@GetMapping("/quarto/{id}")
	@ResponseBody
	public Quarto findQuartoById(@PathVariable("quarto") long id) {
		return quartoRepo.findById(id);
	}
}

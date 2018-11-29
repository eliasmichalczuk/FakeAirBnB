package airbnb.controller.query;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.User;
import airbnb.repo.IBaseQueryRepo;

@Component
@RestController
@RequestMapping("api/user")
public class UserQueryController {

	
	private IBaseQueryRepo<User, UUID> repo;
	@Autowired
	public UserQueryController(IBaseQueryRepo<User, UUID> repo) {
		super();
		this.repo = repo;
	}

	@RequestMapping(value="/{userId}", method = RequestMethod.GET)
	public Optional getUserById(@PathVariable UUID userId){
		return repo.findById(userId);
	}
}

package airbnb.controller.basic;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.Owner;
import airbnb.domain.base.User;
import airbnb.repo.IBaseCommandRepo;
import airbnb.repo.IBaseQueryRepo;

@RestController
@RequestMapping("api/owner")
public class OwnerController {

	private IBaseCommandRepo<Owner, UUID> commandRepo;
	private IBaseQueryRepo<Owner, UUID> queryRepo;
	private IBaseQueryRepo<User, UUID> userQueryRepo;

	@Autowired
	public OwnerController(IBaseCommandRepo<Owner, UUID> commandRepo, IBaseQueryRepo<Owner, UUID> queryRepo,
			IBaseQueryRepo<User, UUID> userQueryRepo) {
		this.commandRepo = commandRepo;
		this.queryRepo = queryRepo;
		this.userQueryRepo = userQueryRepo;
	}
	
	@RequestMapping(value="/{userId}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public Owner create(@PathVariable UUID userId) {
		User user = userQueryRepo.getOne(userId);
		commandRepo.save(entity)
	}
}

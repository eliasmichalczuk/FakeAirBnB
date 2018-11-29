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
@RequestMapping("api/dwelling")
public class DwellingController {
	
	private IBaseCommandRepo<Owner, UUID> commandRepo;
	private IBaseQueryRepo<Owner, UUID> queryRepo;
	private IBaseQueryRepo<User, UUID> userQueryRepo;
	private IBaseCommandRepo<Owner, UUID> dwellingCommandRepo;
	private IBaseQueryRepo<Owner, UUID> dwellingQueryRepo;
	
	
	@RequestMapping(value="/{ownerId}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void create(@PathVariable UUID userId) {
		User user = userQueryRepo.getOne(userId);
		Owner owner = Owner.builder()
				.id(user.getId())
				.phoneNumber(user.getPhoneNumber())
				.name(user.getName())
				.email(user.getName())
				.build();
		
		dwellingCommandRepo.save(owner);
	}
}

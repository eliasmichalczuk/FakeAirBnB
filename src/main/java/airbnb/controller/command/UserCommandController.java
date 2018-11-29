package airbnb.controller.command;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import airbnb.domain.base.User;
import airbnb.hosting.dto.UserDto;
import airbnb.repo.IUserCommandRepo;

@RestController
@RequestMapping("api/user")
public class UserCommandController {
	
	
	private IUserCommandRepo repo;
	@Autowired
	public UserCommandController(IUserCommandRepo repo) {
		super();
		this.repo = repo;
	}

	@PostMapping
	public ResponseEntity<User> postUser(@RequestBody UserDto dto) {
		User user = (User) repo.save(dto.toClass());
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
}

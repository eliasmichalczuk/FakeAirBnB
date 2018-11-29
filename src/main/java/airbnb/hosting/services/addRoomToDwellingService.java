package airbnb.hosting.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import airbnb.domain.base.Owner;
import airbnb.domain.base.User;
import airbnb.repo.IBaseCommandRepo;
import airbnb.repo.IBaseQueryRepo;

@Service
public class addRoomToDwellingService {

	private IBaseCommandRepo<Owner, UUID> commandRepo;
	private IBaseQueryRepo<Owner, UUID> queryRepo;
	private IBaseQueryRepo<User, UUID> userQueryRepo;
	private IBaseCommandRepo<Owner, UUID> dwellingCommandRepo;
	private IBaseQueryRepo<Owner, UUID> dwellingQueryRepo;
	
	
}

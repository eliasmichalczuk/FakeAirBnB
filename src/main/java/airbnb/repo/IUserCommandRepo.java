package airbnb.repo;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import airbnb.domain.base.User;

@Repository
@Transactional
public interface IUserCommandRepo extends CrudRepository<User, UUID>{

}

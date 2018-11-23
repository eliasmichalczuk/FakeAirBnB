package airbnb.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import airbnb.domain.base.Room;

@Repository
@Transactional
public interface IRoomRepo extends JpaRepository<Room, UUID>{

	List<Room> findByStreet(String street);
	List<Room> findAll();
	List<Room> findByDescription(String description);
}

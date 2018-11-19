package airbnb.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import airbnb.domain.base.Room;

@Repository
public interface IRoomRepo extends JpaRepository<Room, UUID>{

	List<Room> findByStreet(String street);
	List<Room> findAll();
	List<Room> findByDescription(String description);
}

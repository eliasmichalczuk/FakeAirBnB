package airbnb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import airbnb.domain.base.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long>{

	List<Room> findByStreet(String street);
	List<Room> findAll();
	List<Room> findByDescription(String description);
	Room findById(long id);
}

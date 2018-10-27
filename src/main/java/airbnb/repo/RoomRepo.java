package airbnb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import airbnb.rent.domain.entity.Room;

public interface RoomRepo extends JpaRepository<Room, Long>{

	List<Room> findByRua(String street);
	List<Room> findAll();
	List<Room> findByDescricao(String description);
	Room findById(long id);
}

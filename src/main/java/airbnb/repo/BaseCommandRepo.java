package airbnb.repo;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseCommandRepo extends JpaRepository<Entity, Long>{

	
}

package airbnb.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseQueryRepo <T, ID extends Serializable> extends JpaRepository <T, ID> {
	
}
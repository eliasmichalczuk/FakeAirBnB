package airbnb.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBaseQueryRepo <T, ID extends Serializable> extends JpaRepository <T, ID> {
	
}
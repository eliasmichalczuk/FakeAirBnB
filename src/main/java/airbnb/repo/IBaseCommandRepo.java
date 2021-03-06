package airbnb.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBaseCommandRepo <T, ID extends Serializable> extends CrudRepository <T, ID>{

}

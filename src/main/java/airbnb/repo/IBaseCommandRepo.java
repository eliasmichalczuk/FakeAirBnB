package airbnb.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface IBaseCommandRepo <T, ID extends Serializable> extends CrudRepository <T, ID>{

}

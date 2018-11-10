package airbnb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import airbnb.domain.base.Review;

@Repository
public interface ReviewCommandRepo extends JpaRepository<Review, Long>{

	
}

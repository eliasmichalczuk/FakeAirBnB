package airbnb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import airbnb.domain.base.Review;

public interface ReviewCommandRepo extends JpaRepository<Review, Long>{

	
}

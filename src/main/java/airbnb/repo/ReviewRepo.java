package airbnb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import airbnb.domain.base.Review;

public interface ReviewRepo extends JpaRepository<Review, Long>{

	
}

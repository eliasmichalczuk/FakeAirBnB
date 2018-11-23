package airbnb.repoImplementation;

import java.awt.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import airbnb.domain.base.Review;
import airbnb.repo.IReviewQueryRepo;

@Component
public class ReviewQueryRepo implements IReviewQueryRepo{


	@Override
	public <S extends Review> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Review> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Review> findById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Review> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Review> findAllById(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Review entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Review> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List findAllByRoomId(long roomId) {
		// TODO Auto-generated method stub
		return null;
	}

}

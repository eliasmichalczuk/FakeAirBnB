package airbnb.reviewHosting;

import javax.persistence.Entity;

import airbnb.domain.base.Room;
import airbnb.domain.base.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

	private long id;
	private String description;
	private User user;
	private int stars;
	private Room room;
}

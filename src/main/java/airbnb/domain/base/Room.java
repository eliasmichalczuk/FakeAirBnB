package airbnb.domain.base;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Room")
@Table(name = "room")
@Getter
@Setter (AccessLevel.PRIVATE)
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="street", nullable=false)
	private String street;
	@Column(name="number", nullable=false)
	private int number;
	@Column(name="description", nullable=false)
	private String description;
	@OneToMany(
	        mappedBy = "room", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	@Column(name="reviews", nullable=false)
	private List<Review> reviews;
	
}

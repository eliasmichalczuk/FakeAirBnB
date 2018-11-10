package airbnb.domain.base;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
public class Review{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@AggregateIdentifier
	private long id;
//	@Column(name="usuario", nullable=false)
	@JoinColumn(name="user_id", table="User", nullable=false)
	private User user;
	@Column(name="star", nullable=false)
	@JoinColumn(name="room_id", table="Room", nullable=false)
	private Room room;
	@Column(name="description", nullable=false)
	private String description;
	@Column(name="stars", nullable=false)
	@ElementCollection(targetClass=Integer.class)
	private List<Integer> stars;
	
}

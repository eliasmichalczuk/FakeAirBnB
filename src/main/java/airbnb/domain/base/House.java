package airbnb.domain.base;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
public class House {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@OneToMany
	@Column(name="rooms", nullable=false)
	private ArrayList<Room> quartos;
}

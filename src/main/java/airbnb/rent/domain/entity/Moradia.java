package airbnb.rent.domain.entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
public class Moradia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private ArrayList<Room> quartos;
}

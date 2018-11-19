package airbnb.domain.base;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Dwelling")
@Table(name = "dwelling")
@Getter
public class Dwelling {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "room")
	@Setter
	private List<Room> rooms;
	
}

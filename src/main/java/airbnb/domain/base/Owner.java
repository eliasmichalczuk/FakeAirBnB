package airbnb.domain.base;

import javax.persistence.Column;
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
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="nome", nullable=false)
	private String name;
	@Column(name="telefone", nullable=false)
	private String phoneNumber;
	@Column(name="moradia", nullable=false)
	private Moradia dwellig;
}

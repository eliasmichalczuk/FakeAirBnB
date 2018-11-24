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
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter (AccessLevel.PRIVATE)
@Entity(name = "User")
@Table(name = "user")
@Builder
public class User {

	@Id
	private int id;
	@Column(name="nome", nullable=false)
	private String name;
	@OneToMany(
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private List<Review> reviews;
	@Column(name="telefone", nullable=true)
	private String phoneNumber;
	@Column(name="email", nullable=false)
	private String email;
}

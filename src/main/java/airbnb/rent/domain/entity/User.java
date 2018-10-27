package airbnb.rent.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter (AccessLevel.PRIVATE)
@Entity
@Table(name = "usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="nome", nullable=false)
	private String name;
	
	private List<Review> reviews;
	@Column(name="telefone", nullable=false)
	private String phoneNumber;
	
}

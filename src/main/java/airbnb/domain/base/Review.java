package airbnb.domain.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.axonframework.commandhandling.model.AggregateIdentifier;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
@Table(name = "avaliacao")
public class Review{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@AggregateIdentifier
	private long id;
	@Column(name="descricao", nullable=false)
	private String description;
//	@Column(name="usuario", nullable=false)
	@ManyToOne
	@JoinColumn(name="usuario_id", table="usuario")
	private User user;
	@Column(name="estrelas", nullable=false)
	private int stars;
	@OneToOne
	@JoinColumn(name="quarto_id", table="quarto")
	private Room room;
}

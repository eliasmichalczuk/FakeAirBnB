package udesc.poo.rent.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter (AccessLevel.PRIVATE)
@Table(name = "avaliacao")
public class Avaliacao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="descricao", nullable=false)
	private String descricao;
//	@Column(name="usuario", nullable=false)
	@ManyToOne
	@JoinColumn(name="usuario_id", table="usuario")
	private Usuario usuario;
	@Column(name="estrelas", nullable=false)
	private int estrelas;
	@OneToOne
	@JoinColumn(name="quarto_id", table="quarto")
	private Quarto quarto;
}

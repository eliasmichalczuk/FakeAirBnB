package udesc.poo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Avaliacao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="descricao", nullable=false)
	private String descricao;
	@Column(name="descricao", nullable=false)
	private Usuario usuario;
	@Column(name="estrelas", nullable=false)
	private int estrelas;
}

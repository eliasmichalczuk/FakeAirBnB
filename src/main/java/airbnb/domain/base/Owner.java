package airbnb.domain.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Owner")
@Table(name = "owner")
@Getter
@Setter (AccessLevel.PRIVATE)
@Builder
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="nome", nullable=false)
	private String name;
	@Column(name="telefone", nullable=false)
	private String phoneNumber;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dwellling_id")
	private Dwelling dwellig;
	@Column(name="email", nullable=false)
	private String email;
}

package airbnb.domain.base;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = { "id" })
public class Review{

	@Id
	private UUID id;
//	@Column(name="usuario", nullable=false)
//	@JoinColumn(name="user_id", table="User", nullable=false)
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	@Setter
	private User user;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
	@Setter
	private Room room;
	@Column(name="description", nullable=false)
	@Setter
	private String description;
	@Column(name="stars", nullable=false)
	@Setter
	private int Stars;

}

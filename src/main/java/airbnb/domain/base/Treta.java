package airbnb.domain.base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.hibernate.annotations.Type;

import lombok.Data;

@Data
@Entity
public class Treta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@AggregateIdentifier
	private long id;
	@Type(type="long")
	@Column(columnDefinition = "bigint",name="treta", nullable=false)
	private long treta;
}

package airbnb.domain.base;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@ToString
@Builder
public class Hosting {

	@Id
	private UUID id;	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
	@Setter
	private UUID userId;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
	@Setter
	private UUID roomId;
	private Enum status;
}

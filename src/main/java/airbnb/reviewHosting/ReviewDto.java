package airbnb.reviewHosting;

import java.util.UUID;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReviewDto {

	public final UUID reviewId;
	public final UUID userId;
	public final UUID roomId;
	public final String description;
	public final int stars;
}

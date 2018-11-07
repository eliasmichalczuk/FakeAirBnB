package airbnb.reviewHosting;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReviewDto {

	public long id;
	public String description;
	public int userId;
	public int stars;
	public int roomId;
}

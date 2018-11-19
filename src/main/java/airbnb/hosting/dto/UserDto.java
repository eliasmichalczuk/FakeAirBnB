package airbnb.hosting.dto;

import airbnb.domain.base.User;
import lombok.Value;

@Value
public class UserDto {

	public final String name;
	public final String phone;
	public final String email;
	
	public User toClass() {
		return User.builder().name(name).phoneNumber(phone).email(email).build();
	}
}
